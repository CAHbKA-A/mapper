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
values ('GPS_tracker1_test', 1, 'token1' , 1 ),
       ('GPS_tracker2_test', 1, 'asw3' , 2 ),
       ('GPS_tracker3_test', 1, 'asw3' , 1 );


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

create table users
-- пользователи
(
    user_id        bigserial primary key,
    user_name varchar(255) not null,
    description varchar(255)

);
insert into users (user_name)
values ('Alex'),
       ('Salex'),
       ('Bobik');

create table metric_history
-- пользователи
(
    id          bigserial primary key,
    device_id    bigserial,
    metric_id    bigserial,
    value       real,
    created_at  timestamp default current_timestamp,
    updated_at  timestamp default current_timestamp
);

insert into metric_history ( device_id , metric_id,   value , created_at)
values (1, 1, 104.222, '2024-01-11 21:40:03.270761'),
       (1, 2, 51.222, '2024-01-11 21:40:03.270761'),
       (1, 3, 2, '2024-01-11 21:40:03.270761'),
       (1, 4, 444, '2024-01-11 21:40:03.270761'),
       (1, 1, 102.12, '2024-01-11 21:50:03.270761'),
       (1, 2, 52.222, '2024-01-11 21:50:03.270761'),
       (1, 3, 2, '2024-01-11 21:50:03.270761'),
       (1, 4, 443, '2024-01-11 21:50:03.270761'),
       (1, 1, 103.422, '2024-01-11 21:55:03.270761'),
       (1, 2, 54.222, '2024-01-11 21:55:03.270761'),
       (1, 3, 22, '2024-01-11 21:55:03.270761'),
       (1, 4, 447, '2024-01-11 21:55:03.270761'),
       (1, 1, 104.272, '2024-01-11 22:22:03.270761'),
       (1, 2, 54.222, '2024-01-11 22:22:03.270761'),
       (1, 3, 3, '2024-01-11 22:22:03.270761'),
       (1, 4, 442, '2024-01-11 22:22:03.270761'),
       (1, 1, 105.223, '2024-01-11 22:28:03.270761'),
       (1, 2, 56.222, '2024-01-11 22:28:03.270761'),
       (1, 3, 23, '2024-01-11 22:28:03.270761'),
       (1, 4, 446, '2024-01-11 22:28:03.270761'),
       (1, 1, 122.32, '2024-01-11 22:38:03.270761'),
       (1, 2, 57.222, '2024-01-11 22:38:03.270761'),
       (1, 3, 44, '2024-01-11 22:38:03.270761'),
       (1, 4, 444, '2024-01-11 22:38:03.270761');