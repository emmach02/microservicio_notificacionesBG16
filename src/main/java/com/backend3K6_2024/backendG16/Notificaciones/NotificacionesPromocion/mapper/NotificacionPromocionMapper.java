package com.backend3K6_2024.backendG16.Notificaciones.NotificacionesPromocion.mapper;

import com.backend3K6_2024.backendG16.Notificaciones.NotificacionesPromocion.DTO.NotificacionPromocionDTO;
import com.backend3K6_2024.backendG16.Notificaciones.NotificacionesPromocion.entity.NotificacionPromocion;

import java.util.Collections;

public class NotificacionPromocionMapper {
    public static NotificacionPromocionDTO toDTO(NotificacionPromocion notProm) {
        return NotificacionPromocionDTO.builder()
                .idNotProm(notProm.getIdPromocion())
                .fecha(notProm.getFechaEnvio())
                .descripcion(notProm.getDescripcion())
                .nroTelefono(notProm.getNroTelefono())
                .build();
    }

    public static NotificacionPromocion toEntity(NotificacionPromocionDTO dto) {
        return NotificacionPromocion.builder()
                .idPromocion(dto.getIdNotProm())
                .fechaEnvio(dto.getFecha())
                .descripcion(dto.getDescripcion())
                .nroTelefono(dto.getNroTelefono())
                .build();
    }
}
