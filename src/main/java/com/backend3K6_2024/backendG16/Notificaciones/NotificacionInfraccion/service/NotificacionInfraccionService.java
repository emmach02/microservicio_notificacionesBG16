package com.backend3K6_2024.backendG16.Notificaciones.NotificacionInfraccion.service;

import com.backend3K6_2024.backendG16.Notificaciones.NotificacionInfraccion.DTO.NotificacionInfraccionDTO;
import com.backend3K6_2024.backendG16.Notificaciones.NotificacionInfraccion.entity.NotificacionInfraccion;
import com.backend3K6_2024.backendG16.Notificaciones.NotificacionInfraccion.mapper.NotificacionInfraccionMapper;
import com.backend3K6_2024.backendG16.Notificaciones.NotificacionInfraccion.repository.NotificacionInfraccionRepository;
import lombok.AllArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@AllArgsConstructor
@Service

public class NotificacionInfraccionService {

    private final NotificacionInfraccionRepository notificacionInfraccionRepository;

    //Metodos GET para las notificaciones de Infraccion
    public List<NotificacionInfraccionDTO> getAll() {
        List<NotificacionInfraccion> notInfrac = notificacionInfraccionRepository.findAll();
        return notInfrac.stream()
                .map(NotificacionInfraccionMapper::toDTO)
                .toList();
    }

    //Métodos post para creacion de Notificacion al empleado
    public ResponseEntity<String> create(
            @RequestBody NotificacionInfraccionDTO notInfDTO) throws BadRequestException {
        if (notInfDTO.getIdPrueba() == null) {
            throw new BadRequestException("Debe ingresar la prueba que fue notificada");
        } else {
            NotificacionInfraccion notificacionInfraccion = NotificacionInfraccionMapper.toEntity(notInfDTO);
            notificacionInfraccionRepository.save(notificacionInfraccion);
            return ResponseEntity.ok("Notificacion infraccion guardada con exito. \n " +
                    "Infracción NRO°: " + notificacionInfraccion.getIdNotInfraccion()
                    + "\n" + notificacionInfraccion.getTexto());
        }
    }

}
