create database aerolineas;
use aerolineas;

create table vuelos
(
    id_vuelo              serial not null primary key,
    nro_vuelo             varchar(50),
    cant_asientos         integer,
    fec_hs_salida         timestamp,
    fec_hs_llegada        timestamp,
    tiempo_vuelo          integer,
    id_aerolinea          integer,
    id_aeropuerto_salida  integer,
    id_aeropuerto_llegada integer
);

create table paises
(
    id_pais         serial      not null primary key,
    codigo_pais     varchar(2)  not null,
    nombre_pais     varchar(50) not null,
    codigo_telefono integer     not null
)
    comment 'Paises del mundo';

create table provincias
(
    id_provincia     serial      not null
        primary key,
    nombre_provincia varchar(50) not null
)
    comment 'Provincias de Argentina';


create table aeropuertos
(
    id_aeropuerto     serial      not null
        primary key,
    codigo_aeropuerto varchar(3)  not null,
    ciudad            varchar(50) not null,
    id_pais           varchar(3)  not null
        references paises,
    id_provincia      integer
        references provincias,
    provincia_otro    varchar(50)
);


create table usuarios
(
    id_usuarios    serial      not null
        primary key,
    nombre_usuario varchar(50) not null,
    clave          varchar(50) not null,
    perfil         varchar(200)
);


create table aerolineas
(
    id_aerolinea     serial      not null
        primary key,
    nombre_aerolinea varchar(15) not null,
    alianza           varchar(15)
);


create unique index aerolineas_id_aerolineas_uindex
    on aerolineas (id_aerolinea);

create table pasajeros_frecuentes
(
    id_pasajero_frecuente serial      not null
        primary key,
    alianza               varchar(15) not null,
    numero                integer     not null,
    categoria             varchar(15) not null,
    id_aerolinea          integer     not null
        references aerolineas
);


create unique index pasajero_frecuente_id_pasajero_frecuente_uindex
    on pasajeros_frecuentes (id_pasajero_frecuente);

create table pasaportes
(
    id_pasaporte     serial     not null
        primary key,
    nro_pasaporte     integer    not null,
    autoridad_emision varchar(50),
    fecha_emision     date       not null,
    fecha_vencimiento date       not null,
    id_pais           varchar(2) not null
        references paises
);


create unique index pasaportes_id_pasaportes_uindex
    on pasaportes (id_pasaporte);

create table telefonos
(
    id_telefono serial not null
        primary key,
    personal     varchar(15),
    celular      varchar(15),
    laboral      varchar(15)
);


create unique index telefonos_id_telefonos_uindex
    on telefonos (id_telefono);

create table direcciones
(
    id_direccion   serial     not null
        primary key,
    calle          varchar(20),
    altura         integer,
    ciudad         varchar(15),
    codigo_postal  integer,
    id_pais        varchar(2) not null
        references paises,
    id_provincia   integer
        references provincias,
    provincia_otro integer
);

create unique index direcciones_id_direccion_uindex
    on direcciones (id_direccion);

create table clientes
(
    id_cliente            serial      not null
        primary key,
    nombre                varchar(25) not null,
    apellido              varchar(25) not null,
    dni                   integer     not null,
    cuit_cuil             integer,
    fecha_nacimiento      date        not null,
    email                 varchar(25) not null,
    id_direccion          integer     not null
        references direcciones,
    id_telefono           integer     not null
        references telefonos,
    id_pasaporte          integer     not null
        references pasaportes,
    id_pasajero_frecuente integer     not null
        references pasajeros_frecuentes
);


create unique index cliente_cuit_cuil_uindex
    on clientes (cuit_cuil);

create unique index cliente_dni_uindex
    on clientes (dni);

create unique index cliente_id_cliente_uindex
    on clientes (id_cliente);

create table ventas
(
    id_ventas    serial      not null
        primary key,
    fec_hs_venta timestamp   not null,
    forma_pago   varchar(10) not null,
    id_cliente   integer     not null
        references clientes,
    id_vuelo     integer     not null
        references vuelos,
    id_aerolinea integer     not null
        references aerolineas
);


create unique index ventas_id_ventas_uindex
    on ventas (id_ventas);


