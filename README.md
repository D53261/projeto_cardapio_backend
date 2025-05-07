# Cardápio Digital

Este é um projeto de **Cardápio Digital**, desenvolvido com o objetivo de gerenciar categorias e itens de um cardápio, permitindo operações como criação, listagem e exclusão de categorias e alimentos. A parte relacionada a categorias foi uma ideia adicional para tornar a aplicação mais fiel a um cardápio real, aprimorando o projeto com os conhecimentos adquiridos.

## Funcionalidades

- **Gerenciamento de Categorias**:
  - Criar novas categorias.
  - Listar todas as categorias.
  - Excluir categorias (e os alimentos associados).

- **Gerenciamento de Alimentos**:
  - Criar novos alimentos.
  - Listar todos os alimentos.
  - Excluir alimentos.

## Tecnologias Utilizadas

- **Backend**:
  - [Spring Boot](https://spring.io/projects/spring-boot) (versão 3.4.5)
  - JPA (Java Persistence API) para persistência de dados.
  - MySQL como banco de dados relacional.
  - Postman para testar devidamente os endpoints da API REST.

- **Dependências**:
  - Lombok para reduzir o código boilerplate.
  - Spring Boot DevTools para facilitar o desenvolvimento.
  - Spring Boot Starter Web para APIs REST.

- **Outras Tecnologias**:
  - Docker para containerização.
  - Docker Compose para orquestração de containers.

## Como Rodar o Projeto

### Pré-requisitos

- **Java 17** ou superior.
- **Maven** (ou utilize o Maven Wrapper incluído no projeto).
- **Docker** e **Docker Compose** (caso opte por rodar com containers).

### Rodando Localmente (Sem Docker)

1. Clone o repositório:
   ```bash
   git clone <URL_DO_REPOSITORIO>
   cd cardapio
   ```

2. Configure o banco de dados MySQL:
   - Certifique-se de que o MySQL esteja rodando na sua máquina.
   - Crie um banco de dados chamado `mydatabase`.
   - Atualize as credenciais no arquivo `src/main/resources/application.properties`, se necessário.

3. Compile e rode o projeto:
   ```bash
   ./mvnw spring-boot:run
   ```

4. O projeto estará disponível em: [http://localhost:8080](http://localhost:8080).

### Rodando com Docker

1. Certifique-se de que o Docker e o Docker Compose estão instalados.

2. Construa e inicie os containers:
   ```bash
   docker-compose up --build
   ```

3. O projeto estará disponível em: [http://localhost:8080](http://localhost:8080).

## Endpoints Disponíveis

### Categorias
- **GET** `/category`: Lista todas as categorias.
- **POST** `/category`: Cria uma nova categoria.
- **DELETE** `/category/{id}`: Exclui uma categoria pelo ID, e com ela vão os alimentos que dela pertenciam.

### Alimentos
- **GET** `/food`: Lista todos os alimentos.
- **POST** `/food`: Cria um novo alimento.
- **DELETE** `/food/{id}`: Exclui um alimento pelo ID.

## Feito por:
### Danilo Ribeiro 
### Linkedin: https://www.linkedin.com/in/danilo-ribeiro-catroli-da-silva/
### Email: danilo051007@gmail.com

