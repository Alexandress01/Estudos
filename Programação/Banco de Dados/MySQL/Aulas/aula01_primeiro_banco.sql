-- Aula 01: Criando o Primeiro Banco de Dados
-- Aprendi:
-- - Como criar um banco de dados
-- - Como selecionar um banco com USE
-- - Como criar tabelas e campos
-- - Quais são os tipos primitivos

CREATE DATABASE cadastro;
USE cadastro;

CREATE TABLE pessoas (
    nome VARCHAR(30),
    idade INT(3),
    sexo CHAR(1),
    altura FLOAT,
    peso FLOAT,
    nacionalidade VARCHAR(20)
);