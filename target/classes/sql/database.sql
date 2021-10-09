CREATE TABLE clients
(
    id SERIAL PRIMARY KEY UNIQUE NOT NULL,
    name varchar(20),
    email varchar(255) UNIQUE NOT NULL,
    phone bigint UNIQUE NOT NULL,
    about varchar,
    age int
);

CREATE TABLE statuses
(
    id SERIAL PRIMARY KEY UNIQUE NOT NULL,
    alias varchar(15) UNIQUE NOT NULL,
    description varchar UNIQUE NOT NULL
);

CREATE TABLE client_status
(
    client_id int references clients (id) on update cascade on delete cascade NOT NULL,
    status_id int references statuses (id) on update cascade on delete cascade NOT NULL
);

CREATE TABLE account
(
    id SERIAL PRIMARY KEY UNIQUE NOT NULL,
    client_id int NOT NULL references clients (id) ON UPDATE cascade ON DELETE cascade,
    number varchar(20) UNIQUE NOT NULL,
    value numeric NOT NULL
);