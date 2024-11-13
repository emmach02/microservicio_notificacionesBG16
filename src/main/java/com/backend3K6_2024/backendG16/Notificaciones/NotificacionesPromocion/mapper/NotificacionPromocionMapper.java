package com.backend3K6_2024.backendG16.Notificaciones.NotificacionesPromocion.mapper;

import com.backend3K6_2024.backendG16.Notificaciones.NotificacionesPromocion.DTO.NotificacionPromocionDTO;
import com.backend3K6_2024.backendG16.Notificaciones.NotificacionesPromocion.entity.NotificacionPromocion;

public class NotificacionPromocionMapper {
    public static NotificacionPromocionDTO toDTO(NotificacionPromocion notProm) {
        return NotificacionPromocionDTO.builder()
                .build();
    }

    public static NotificacionPromocion toEntity(NotificacionPromocionDTO dto) {
        return NotificacionPromocion.builder()
                .build();
    }
}
