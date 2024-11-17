package com.backend3K6_2024.backendG16.Notificaciones.NotificacionesPromocion.controller;

import com.backend3K6_2024.backendG16.Notificaciones.NotificacionesPromocion.DTO.NotPromocionReqDTO;
import com.backend3K6_2024.backendG16.Notificaciones.NotificacionesPromocion.DTO.NotificacionPromocionDTO;
import com.backend3K6_2024.backendG16.Notificaciones.NotificacionesPromocion.service.NotificacionPromocionService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin(allowedHeaders = "*")
@RequestMapping("api/notificaciones/promocion")

public class NotificacionPromocionController {

    @Autowired
    private NotificacionPromocionService notificacionPromocionService;

    @GetMapping("")
    public ResponseEntity<List<NotificacionPromocionDTO>> getAll(){
        return ResponseEntity.ok(notificacionPromocionService.getAll());
    }

    @Transactional
    @PostMapping("/enviarNotProm")
    public ResponseEntity<String> create(@RequestBody NotPromocionReqDTO reqDTO){
        try {
            return notificacionPromocionService.create(reqDTO);
        } catch (BadRequestException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
