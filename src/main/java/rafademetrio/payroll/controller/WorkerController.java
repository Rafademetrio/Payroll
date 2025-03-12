package rafademetrio.payroll.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rafademetrio.payroll.dto.WorkerDTO;
import rafademetrio.payroll.model.Worker;
import rafademetrio.payroll.service.WorkerService;

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
