package com.backend3K6_2024.backendG16.Notificaciones.NotificacionesPromocion.DTO;

import lombok.*;
import lombok.experimental.Accessors;
import java.time.LocalDateTime;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Accessors(makeFinal = true)
@ToString
public class NotificacionPromocionDTO {
    Integer idNotProm;
    LocalDateTime fecha;
    String descripcion;
}
