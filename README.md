# PRODUCT-MANAGER API

Boas vindas a api de gestão de vendas e manipulação de produtos para setor comercial. 

## Tecnologias:
    JAVA 21
    SPRING-BOOT 3.5.9
    BANCO DE DADOS H2 PARA TESTES
    BANCO DE DADOS POSTGRESS PARA PRODUÇÃO
    VIACEP-API + OPENFEIGN

## Como usar: 
O serviço permite o cadastro de usuário, produto e vendas. Para cada entidade é esperado um payload 
JSON específico. Cada payload deve ser usado nos seus respectivos EndPoints para evitar erros.

### Cadastro de clientes

#### EndPoint
    POST: http://localhost:8080/valemobi-clientes/cadastra-clientes


#### Payload esperado:
    {
    "nome":"name example",
    "email":"emailexample@example.com",
    "telefone": 12 3456-7890,
    "cep": "01001000",
      "endereco": {
          "numero":""
     }   
    }


###  Consulta de clientes cadstrados
#### EndPoint
    GET: http://localhost:8080/valemobi-clientes/pesquisa-cliente
#### Payload de resposta:
    {
        "nome": "name example",
        "email": "emailexample@example.com",
        "telefone": 12 3456-7890,
        "cep": null,
        "endereco": {
            "cep": "01001000",
            "logradouro": "Praça da Sé",
            "numero": "",
            "complemento": "lado ímpar",
            "bairro": "Sé",
            "localidade": "São Paulo",
            "uf": "SP",
            "id": 1
        },
        "id": 1
    }


### Cadastro de produtos

#### EndPoint
    POST: http://localhost:8080/valemobi-products/cadastra-produto
#### PayLoad esperado:
    {
    "nome": "Livro - Labirinto",
    "preco": 60.00,
    "quantidade": 5
    }


### Consulta de produtos

#### EndPoint
    GET: http://localhost:8080/valemobi-products/catalogo
#### Payload de resposta:

    {
        "nome": "Livro - Labirinto",
        "preco": 60.00,
        "quantidade": 5,
        "id": 1
    }


### Novo Pedido

#### EndPoint 
    POST: http://localhost:8080/valemobi-pedido/gera-pedido
#### PayLoad esperado:
    {
        "clienteId": IdCliente,
        "produtos": [
            {
                "produto": {
                  "id": IdProduto
            },
        "quantidade": 1
        }
      ]
    }

#### PayLoad de resposta:

    {
    "cliente": {
        "nome": "name example",
        "email": "emailexample@example.com",
        "telefone": 12 3456-7890,
        "cep": null,
        "endereco": {
            "cep": "01001000",
            "logradouro": "Praça da Sé",
            "numero": "",
            "complemento": "lado ímpar",
            "bairro": "Sé",
            "localidade": "São Paulo",
            "uf": "SP",
            "id": 1
        },
        "id": 1
    },
    "data": "2025-12-24T15:31:32.564+00:00",
    "status": "PENDENTE",
    "produtos": [
        {
            "nome": "Livro - Labirinto",
            "preco": 60.00,
            "quantidade": 1,
            "id": 1
        }
    ],
    "total": 60.00,
    "parcelamento": false,
    "valorParcela": null,
    "frete": 10,
    "id": 1
    }


O maior beneficio desse projeto, foi o aprendizado e a satisfação de conseguir resolver os problemas que apareceram
no meio do caminho. 