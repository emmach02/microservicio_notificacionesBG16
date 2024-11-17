package com.backend3K6_2024.backendG16.Notificaciones.NotificacionInfraccion.DTO;

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

public class NotificacionInfraccionDTO {
    Integer idNotInfraccion;
    Integer idPrueba;
    LocalDateTime fechaEmision;
    String nroTelefono;
    String texto;
}
