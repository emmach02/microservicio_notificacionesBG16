package com.backend3K6_2024.backendG16.Notificaciones.NotificacionInfraccion.mapper;

import com.backend3K6_2024.backendG16.Notificaciones.NotificacionInfraccion.DTO.NotificacionInfraccionDTO;
import com.backend3K6_2024.backendG16.Notificaciones.NotificacionInfraccion.entity.NotificacionInfraccion;
import com.backend3K6_2024.backendG16.Notificaciones.NotificacionesPromocion.DTO.NotificacionPromocionDTO;
import com.backend3K6_2024.backendG16.Notificaciones.NotificacionesPromocion.entity.NotificacionPromocion;

public class NotificacionInfraccionMapper {

        public static NotificacionInfraccionDTO toDTO(NotificacionInfraccion notInfraccion) {
            return NotificacionInfraccionDTO.builder()
                    .idNotInfraccion(notInfraccion.getIdNotInfraccion())
                    .fechaEmision(notInfraccion.getFechaEmision())
                    .texto(notInfraccion.getTexto())
                    .idPrueba(notInfraccion.getIdPrueba())
                    .nroTelefono(notInfraccion.getNroTelefono())
                    .build();
        }

        public static NotificacionInfraccion toEntity(NotificacionInfraccionDTO dto) {
            return NotificacionInfraccion.builder()
                    .fechaEmision(dto.getFechaEmision())
                    .texto(dto.getTexto())
                    .idPrueba(dto.getIdPrueba())
                    .idNotInfraccion(dto.getIdNotInfraccion())
                    .nroTelefono(dto.getNroTelefono())
                    .build();
        }
}
