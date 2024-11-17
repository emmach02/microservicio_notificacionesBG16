package com.backend3K6_2024.backendG16.Notificaciones.NotificacionInfraccion.repository;

import com.backend3K6_2024.backendG16.Notificaciones.NotificacionInfraccion.entity.NotificacionInfraccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificacionInfraccionRepository extends JpaRepository<NotificacionInfraccion , Integer> {
}
