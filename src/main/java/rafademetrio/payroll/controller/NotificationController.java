package rafademetrio.payroll.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rafademetrio.payroll.dto.NotificationDTO;
import rafademetrio.payroll.dto.WorkerOutputDTO;
import rafademetrio.payroll.model.Notification;
import rafademetrio.payroll.service.NotificationService;

import java.util.List;
import java.util.stream.Collectors;

@ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "Aviso criado com sucesso"),
        @ApiResponse(responseCode = "400", description = "Requisição inválida")
})
@RestController
@RequestMapping("/notifications")
@Tag(name = "Notification Controller", description = "RESTful API for managing NOTIFICATIONS")
public class NotificationController {

    @Autowired
    NotificationService notificationService;

    @GetMapping
    @Operation(summary = "Get all NOTIFICATIONS", description = "Retrieve a list of all registred NOTIFICATIONS")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operation successful"),
    })
    public ResponseEntity<List<Notification>> findAll(){
        var notifications = notificationService.findAll();


        return ResponseEntity.ok(notifications);
    }

    @PostMapping
    public ResponseEntity<Notification> create(@RequestBody NotificationDTO notificationDTO){
        Notification notificationToSave = notificationDTO.toModel();
        Notification savedNotification = this.notificationService.create(notificationToSave);

        return new ResponseEntity<>(savedNotification, HttpStatus.CREATED);
    }
}
