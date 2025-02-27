create table if not exists cloud_user (
    id integer generated always as identity primary key,
    email text not null unique
);

create table if not exists element (
    id integer generated always as identity primary key,
    address text not null,
    description text
);

create table if not exists cloud_user_acl (
    id integer generated always as identity primary key,
    cloud_user integer not null,
    target_element integer not null,
    foreign key (cloud_user) references cloud_user(id)
        on update cascade
        on delete cascade,
    foreign key (target_element) references element(id)
        on update cascade
        on delete cascade
);