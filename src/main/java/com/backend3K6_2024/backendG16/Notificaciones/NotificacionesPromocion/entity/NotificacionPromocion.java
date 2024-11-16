package com.backend3K6_2024.backendG16.Notificaciones.NotificacionesPromocion.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CollectionId;

import java.time.LocalDateTime;

@Entity(name = "NotificacionPromocion")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "notificacionPromocion")

//ENTIDAD NUEVA DE NOTIFICACION PROMOCION
public class NotificacionPromocion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_promocion")
    private Integer idPromocion;
    @Column(name = "fecha_envio")
    private LocalDateTime fechaEnvio;
    @Column(name = "nro_telefono")
    private String nroTelefono;
    @Column(name = "descripcion")
    private String descripcion;
}
