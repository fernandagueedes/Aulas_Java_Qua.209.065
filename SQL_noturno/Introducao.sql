CREATE DATABASE banco_teste;
USE banco_teste;


#CREATE TABLE: cria a tabela
CREATE TABLE pessoa(
	nome VARCHAR(50),
    idade INT,
    sexo CHAR(1),
    peso DOUBLE
	
    );
    #senha: Sen@i123 
    # desc: descreve a tabela
    desc pessoa;
    
    #INSERT TO: insere o produto na tabela
    INSERT INTO pessoa VALUES("Fernanda Guedes", 32, 'F', 64);
    
    #SELECT * FROM pesquisa todos os dados da tabela
    SELECT * FROM pessoa;
    
    
    