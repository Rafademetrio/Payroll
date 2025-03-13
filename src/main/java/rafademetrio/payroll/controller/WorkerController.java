package rafademetrio.payroll.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rafademetrio.payroll.dto.WorkerDTO;
import rafademetrio.payroll.dto.WorkerOutputDTO;
import rafademetrio.payroll.model.Worker;
import rafademetrio.payroll.service.WorkerService;

import java.util.List;
import java.util.stream.Collectors;

@ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "Usuário criado com sucesso"),
        @ApiResponse(responseCode = "400", description = "Requisição inválida")
})
@RestController
@RequestMapping("/workers")
@Tag(name = "Workers Controller", description = "RESTful API for managing WORKS")
public class WorkerController {

    @Autowired
    WorkerService workerService;

    @GetMapping
    @Operation(summary = "Get all WORKERs", description = "Retrieve a list of all registred WORKERS")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operation successful"),
    })
    public ResponseEntity<List<WorkerOutputDTO>> findAll(){
        var workers = workerService.findAll();
        var workersOutputDTO = workers.stream().map(WorkerOutputDTO::new).collect(Collectors.toList());

        return ResponseEntity.ok(workersOutputDTO);
    }

    @PostMapping
    @Operation(summary = "Create a new WORKER", description = "Create a new user and return the created WORKER's data")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "User created successfully"),
            @ApiResponse(responseCode = "422", description = "Invalid user data provided")
    })
    public ResponseEntity<Worker> createWorker(@RequestBody WorkerDTO workerDTO){
        Worker workerToSave = workerDTO.toModel();
        Worker savedWorker = workerService.create(workerToSave);


        return new ResponseEntity<>(savedWorker, HttpStatus.CREATED);
    }
}
