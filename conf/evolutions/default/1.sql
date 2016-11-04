# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table reuniao (
  id                            bigint not null,
  tema                          varchar(255),
  local                         varchar(255),
  data_reuniao                  varchar(255),
  encaminhamentos               varchar(255),
  solicitante                   varchar(255),
  participantes                 varchar(255),
  constraint pk_reuniao primary key (id)
);
create sequence reuniao_seq;


# --- !Downs

drop table if exists reuniao;
drop sequence if exists reuniao_seq;

