package com.backend3K6_2024.backendG16.Notificaciones.NotificacionesPromocion.service;

import com.backend3K6_2024.backendG16.Notificaciones.NotificacionesPromocion.DTO.NotPromocionReqDTO;
import com.backend3K6_2024.backendG16.Notificaciones.NotificacionesPromocion.DTO.NotificacionPromocionDTO;
import com.backend3K6_2024.backendG16.Notificaciones.NotificacionesPromocion.entity.NotificacionPromocion;
import com.backend3K6_2024.backendG16.Notificaciones.NotificacionesPromocion.mapper.NotificacionPromocionMapper;
import com.backend3K6_2024.backendG16.Notificaciones.NotificacionesPromocion.repository.NotificacionPromocionRepository;
import jakarta.transaction.Transactional;
import org.apache.coyote.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class NotificacionPromocionService {

    @Autowired
    private NotificacionPromocionRepository notificacionPromocionRepository;

    //Get para pruebas
    public List<NotificacionPromocionDTO> getAll() {
        List<NotificacionPromocion> listNot = notificacionPromocionRepository.findAll();
        return  listNot.stream()
                .map(NotificacionPromocionMapper::toDTO)
                .toList();
    }

    //Post de notificaciones, es como un enviar notificaciones
    public ResponseEntity<String> create(NotPromocionReqDTO body) throws BadRequestException {
        List<String> nrosTelefonos = body.getNrosTelefono();
        if (nrosTelefonos == null || nrosTelefonos.isEmpty()) {
            throw new BadRequestException("Debe enviar al menos un telefono a notificar");
        }


        for(String nroT : nrosTelefonos) {
            NotificacionPromocion notificacionPromocion = new NotificacionPromocion();
            notificacionPromocion.setNroTelefono(nroT);
            notificacionPromocion.setFechaEnvio(LocalDateTime.now());
            notificacionPromocion.setDescripcion(body.getDescripcion());
            notificacionPromocionRepository.save(notificacionPromocion);
            System.out.println(notificacionPromocion);
        }

        Integer cantNotificaciones = nrosTelefonos.size();
        String mensaje = String.format("%d notificaciones enviadas con éxito", cantNotificaciones);
        return ResponseEntity.ok(mensaje);
    }
}
