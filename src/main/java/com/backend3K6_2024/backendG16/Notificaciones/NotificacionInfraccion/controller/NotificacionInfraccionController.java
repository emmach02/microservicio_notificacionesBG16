package com.backend3K6_2024.backendG16.Notificaciones.NotificacionInfraccion.controller;

import com.backend3K6_2024.backendG16.Notificaciones.NotificacionInfraccion.DTO.NotificacionInfraccionDTO;
import com.backend3K6_2024.backendG16.Notificaciones.NotificacionInfraccion.service.NotificacionInfraccionService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin(allowedHeaders = "*")
@RequestMapping("api/notificaciones/infracciones")

public class NotificacionInfraccionController {

    @Autowired
    private NotificacionInfraccionService notificacionInfraccionService;

    // URI para crear notificaciones de Infraccion
    @Transactional
    @PostMapping("/enviarNotInfraccion")
    public ResponseEntity<String> create(@RequestBody NotificacionInfraccionDTO infracDTO) throws BadRequestException {
        return notificacionInfraccionService.create(infracDTO);
    }

    //Uri para ver todas las Infracciones
    @GetMapping("")
    public ResponseEntity<List<NotificacionInfraccionDTO>> getAll() {
        return ResponseEntity.ok(notificacionInfraccionService.getAll());

    }
}
