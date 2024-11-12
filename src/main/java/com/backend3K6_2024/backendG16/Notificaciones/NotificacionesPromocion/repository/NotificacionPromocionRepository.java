package com.backend3K6_2024.backendG16.Notificaciones.NotificacionesPromocion.repository;

import com.backend3K6_2024.backendG16.Notificaciones.NotificacionesPromocion.entity.NotificacionPromocion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Vector;

@Repository
public interface NotificacionPromocionRepository extends JpaRepository<NotificacionPromocion, Integer>{

}
