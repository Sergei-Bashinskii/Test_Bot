-- liquibase formatted sql

-- changeset Sergei:1
CREATE TABLE public.notification_task
(
    id bigint NOT NULL,
    chat_id bigint NOT NULL,
    notification_date date NOT NULL,
    CONSTRAINT pk_notification_task PRIMARY KEY (id)
);

