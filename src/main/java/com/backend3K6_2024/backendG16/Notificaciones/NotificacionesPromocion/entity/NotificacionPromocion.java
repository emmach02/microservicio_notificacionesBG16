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
public class NotificacionPromocion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idNotProm;

    //No se como hacer esto
    @ManyToOne
    @JoinColumn(name = "ID_INTERESADO")
    private Interesado interesado;

    @ManyToOne
    @JoinColumn(name = "ID_MODELO")
    private Modelo modelo;

    private LocalDateTime fecha;

    private String descripcion;
}
