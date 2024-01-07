create table device_type
-- типы устройств
(
    id          bigserial primary key,
    device_name varchar(255) not null,
    version_id varchar(255) ,
    description varchar(255) ,
    metrics     varchar(255)  not null
);
-- возможные устройства
insert into device_type (device_name, version_id, description, metrics)
values ('GPS_tracker', '0.1 beta', 'Простой треккер' , 'lat,lng,alt,speed' ),
       ('Weather_tracker', '0.1 beta', 'Датчики климата' , 'ham, temp' );


--пользовательские устройства
create table devices
(
    id          bigserial primary key,
    device_name varchar(255) not null,
    device_type_id bigserial,
    token_id varchar(255) ,
    owner_id     int  not null,
    created_at  timestamp default current_timestamp,
    updated_at  timestamp default current_timestamp
);
insert into devices (device_name, device_type_id, token_id, owner_id)
values ('GPS_tracker1_test', 1, 'asw2' , 1 ),
       ('GPS_tracker2_test', 1, 'asw3' , 2 );


--подддерживаемые метрики
create table metrics
(
    id          bigserial primary key,
    metric_name varchar(255) not null,
    unit varchar(255) ,
    description varchar(255)
);


-- хранимые измеряемые параметры
insert into metrics (metric_name, unit, description)
values ('latitude', '', 'Широта'),
       ('longitude', '', 'Долгота'),
       ('Speed', 'kmph', 'Скорость (км/ч)'),
       ('Altitude', 'm', 'Высота над уровнем моря'),
       ('Temperature', ' C', 'Температура. градусы по цельсию');
--

-- набор доступных параметров для каждого устройства
create table device_metrics
(
    device_id    bigserial ,
    metric_id bigserial
);

insert into device_metrics (device_id, metric_id)
values (1, 1),
       (1, 2),
       (1, 3),
       (1, 4),
       (2, 5);