## Descrição

Sistema de gerenciamento de produtos composta por uma API REST e um consumidor. A API faz a publicação de mensagens de manipulação de produtos numa fila do RabbitMQ, que são processadas pela aplicação consumidora consumidora inscrita na fila para realizar alterações no banco de dados PostgreSQL. O sistema também conta com o uso de Redis para gerenciamento de cache no resgate de produtos, gerenciamento de autorização de acesso usando JWT, criptografia de senha no banco de dados.

## Principais tecnologias

[![My Skills](https://skills.thijs.gg/icons?docker,postgres,redis)]()

- Spring Boot
- Docker
- RabbitMQ
- PostgreSQL
- Redis
- Swagger

## Requisitos

- Node.js
- Docker

## Execução

1. Instalar dependências
    ```
   
    ```

2. Iniciar contêiners (RabbitMQ, PostgreSQL e Redis)
    ```
    docker-compose up -d
    ```

3. Iniciar API
    ```
   
    ```

4. Iniciar consumer
    ```
    

5. Usar a API  
Acessar a documentação em 