-- Aula 02: Melhorando a Estrutura do Banco de Dados
-- Aprendi:
-- - Como escolher melhor os tipos primitivos
-- - Como criar opções com ENUM
-- - O que são Constraints e Collations
-- - O que é Chave Primária (Primary Key)

CREATE DATABASE cadastro
DEFAULT CHARACTER SET utf8
DEFAULT COLLATE utf8_general_ci;

CREATE TABLE pessoas (
id int NOT NULL AUTO_INCREMENT,
nome VARCHAR(30) NOT NULL,
nascimento DATE,
sexo ENUM('M', 'F'),
peso DECIMAL(5,2),
altura DECIMAL (3,2),
nacionalidade VARCHAR(20) DEFAULT 'Brazil',
PRIMARY KEY (id)
) DEFAULT CHARSET = utf8;