package com.backend3K6_2024.backendG16.Notificaciones.NotificacionesPromocion.entity;


import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity(name = "NotificacionPromocion")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "NotificacionPromocion")

//ENTIDAD NUEVA DE NOTIFICACION PROMOCION
public class NotificacionPromocion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPromocion;
    private LocalDateTime fechaEnvio;
    private String nroTelefono;
    private String descripcion;
}
