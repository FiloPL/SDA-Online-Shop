-- insert into ROLE (id, authority) values (nextval('role_seq'), 'USER');
-- insert into ROLE (id, authority) values (nextval('role_seq'), 'ADMIN');
-- insert into ROLE (id, authority) values (nextval('role_seq'), 'SUPER_USER');

insert INTO USER (username, password, first_name, last_name) values ('user', '$2a$10$KvxPudrieuxpEgxw3e4yPOuYK59PgfQshx3RaVUTCpbKB82DC/0RC', 'Imie', 'Nazwisko');
insert INTO USER (username, password, first_name, last_name) values ('user1', '$2a$10$KvxPudrieuxpEgxw3e4yPOuYK59PgfQshx3RaVUTCpbKB82DC/0RC', 'Imie3', 'Nazwisko3');
insert INTO USER (username, password, first_name, last_name) values ('user2', '$2a$10$KvxPudrieuxpEgxw3e4yPOuYK59PgfQshx3RaVUTCpbKB82DC/0RC', 'Imie4', 'Nazwisko4');
insert INTO USER (username, password, first_name, last_name) values ('user3', '$2a$10$KvxPudrieuxpEgxw3e4yPOuYK59PgfQshx3RaVUTCpbKB82DC/0RC', 'Imie5', 'Nazwisko5');
insert INTO USER (username, password, first_name, last_name) values ('user4', '$2a$10$KvxPudrieuxpEgxw3e4yPOuYK59PgfQshx3RaVUTCpbKB82DC/0RC', 'Imie6', 'Nazwisko6');
insert INTO USER (username, password, first_name, last_name) values ('user5', '$2a$10$KvxPudrieuxpEgxw3e4yPOuYK59PgfQshx3RaVUTCpbKB82DC/0RC', 'Imie7', 'Nazwisko7');
insert INTO USER (username, password, first_name, last_name) values ('user6', '$2a$10$KvxPudrieuxpEgxw3e4yPOuYK59PgfQshx3RaVUTCpbKB82DC/0RC', 'Imie8', 'Nazwisko8');
insert INTO USER (username, password, first_name, last_name) values ('user7', '$2a$10$KvxPudrieuxpEgxw3e4yPOuYK59PgfQshx3RaVUTCpbKB82DC/0RC', 'Imie9', 'Nazwisko9');
insert INTO USER (username, password, first_name, last_name) values ('user8', '$2a$10$KvxPudrieuxpEgxw3e4yPOuYK59PgfQshx3RaVUTCpbKB82DC/0RC', 'Imie10', 'Nazwisko10');
insert INTO USER (username, password, first_name, last_name) values ('user9', '$2a$10$KvxPudrieuxpEgxw3e4yPOuYK59PgfQshx3RaVUTCpbKB82DC/0RC', 'Imie11', 'Nazwisko11');
insert INTO USER (username, password, first_name, last_name) values ('admin', '$2a$10$IPJizmA0rxJBq9incE/PWub6B2nIDGm3z/2cIz6hAs/hgvKlQ5F9q', 'Imie1', 'Nazwisko1');
insert INTO USER (username, password, first_name, last_name) values ('super_user', '$2a$10$gX.DXBqHZaWg2GGh.NKyqu7/Guc6FatB75zkFLvnf0GDodlp9/tvu', 'Imie2', 'Nazwisko2');

commit;