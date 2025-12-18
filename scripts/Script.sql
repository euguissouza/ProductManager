CREATE TABLE Endereco(
	Id BIGSERIAL PRIMARY KEY NOT NULL,
	cep char(8) NOT NULL,
	numero varchar(4) NOT NULL,
	complemento varchar(255),
	bairro varchar(255) NOT NULL,
	cidade varchar(255) NOT NULL
);	




CREATE TABLE Clientes(
	Id BIGSERIAL PRIMARY KEY NOT NULL,
	nome Varchar(255) NOT NULL,
	email VARCHAR(255) NOT NULL UNIQUE,
	telefone int NOT NULL,
	endereco_id BIGINT REFERENCES endereco(Id)
);

CREATE TABLE Produto(
	Id BIGSERIAL PRIMARY KEY NOT NULL,
	nomeProduto VARCHAR(255) NOT NULL,
	preco DECIMAL(10,2) NOT NULL,
	quantidade int NOT NULL
);


CREATE TABLE Estoque(
	Id BIGSERIAL PRIMARY KEY NOT NULL,
	produto_Id BIGINT REFERENCES Produto(Id) NOT NULL,
	quantidadeEstoque INT NOT NULL
);

CREATE TABLE Item(
	Id BIGSERIAL PRIMARY KEY NOT NULL,
	produto_id BIGINT REFERENCES Produto(Id) NOT NULL,
	quantidadeItem INT NOT NULL,
	precoItem DECIMAL(10,2) 
);


CREATE TABLE Vendas(
	Id int PRIMARY KEY NOT NULL,
	cliente_id BIGINT REFERENCES Clientes(Id) NOT NULL,
	item_Id BIGINT REFERENCES Item(Id) NOT NULL,
	dataVenda TIMESTAMP NOT NULL
);






DROP TABLE Estoque;
