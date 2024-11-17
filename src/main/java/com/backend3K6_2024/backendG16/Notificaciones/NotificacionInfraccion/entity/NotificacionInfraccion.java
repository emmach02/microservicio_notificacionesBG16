package com.backend3K6_2024.backendG16.Notificaciones.NotificacionInfraccion.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "NotificacionInfraccion")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "notificacion_infraccion")
@ToString

public class NotificacionInfraccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idNotInfraccion;

    @Column(name = "id_prueba")
    private Integer idPrueba;

    @Column(name = "fecha_emision")
    private LocalDateTime fechaEmision;

    @Column(name = "nro_telefono")
    private String nroTelefono;

    @Column(name = "texto")
    private String texto;
}
