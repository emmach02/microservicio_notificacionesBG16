drop table if exists NotificacionZonaRestringida;
create table NotificacionZonaRestringida (
    ID integer not null,
    ID_PRUEBA integer not null,
    FECHA_EMISION date,
    TEXTO varchar(64) not null,
    primary key (ID),
    foreign key (ID_PRUEBA) references Pruebas(ID)
);

drop table if exists NotificacionPromocion;
create table NotificacionPromocion(
    ID_PROMOCION integer not null,
    NRO_TELEFONO varchar(40),
    FECHA_ENVIO timestamp,
    DESCRIPCION varchar(64) not null,
    primary key (ID_PROMOCION)
)