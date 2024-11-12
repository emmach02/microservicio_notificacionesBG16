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
    ID integer not null,
    ID_MODELO integer not null,
    ID_INTERESADO integer not null,
    FECHA_EMISION date,
    DESCRIPCION varchar(64) not null,
    primary key (ID),
    foreign key (ID_MODELO) references Modelos(ID),
    foreign key (ID_INTERESADO) references Interesados(ID)
)