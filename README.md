# JobAPI

## Visão Geral

A Job API é uma aplicação baseada em Java, desenvolvida com Spring Boot e projetada para gerenciar anúncios de emprego, informações de empresas e avaliações. Suas principais funcionalidades incluem a capacidade de criar, recuperar, atualizar e excluir anúncios de emprego, empresas e avaliações associadas a essas empresas.

## Arquitetura

O projeto segue uma arquitetura padrão MVC (Model-View-Controller) e está organizado em vários pacotes:

- **jobapi.job**: Contém as entidades e componentes relacionados a anúncios de emprego.
- **jobapi.company**: Gerencia entidades e componentes relacionados a empresas.
- **jobapi.review**: Lida com entidades e serviços para avaliações.
- **jobapi.job.impl**, **jobapi.company.impl**, **jobapi.review.impl**: Implementações de serviços para empregos, empresas e avaliações.
- **jobapi.jobapi**: O pacote principal contendo a classe de aplicação responsável por iniciar a aplicação Spring Boot.
- **resources**: Arquivos de configuração e scripts de banco de dados.

## Tecnologias Utilizadas

- **Java**: A linguagem de programação usada para o desenvolvimento do backend.
- **Spring Boot**: Um framework poderoso para construir aplicativos corporativos baseados em Java.
- **Spring Data JPA**: Simplifica o acesso ao banco de dados usando a Java Persistence API (JPA).
- **Jakarta Persistence API**: Um conjunto de especificações para persistir objetos Java em bancos de dados relacionais.
- **RESTful API**: Expõe pontos de extremidade para criar, recuperar, atualizar e excluir recursos.
- **Maven**: Gerencia dependências do projeto e construções.
- **JUnit (Planejado)**: Framework para testes unitários.
- **Swagger (Planejado)**: Ferramenta de documentação de API.
- **Docker (Planejado)**: Containerização para facilitar a implantação.
- **Banco de Dados (Planejado)**: Configurações para conexão com um banco de dados (por exemplo, PostgreSQL) e inicialmente usando o H2 para testes com o Insomnia.

## Uso

### Endpoints

- **Empregos**: `/jobs`
  - `GET /jobs`: Recuperar todos os anúncios de emprego.
  - `GET /jobs/{id}`: Recuperar um anúncio de emprego específico por ID.
  - `POST /jobs`: Criar um novo anúncio de emprego.
  - `PUT /jobs/{id}`: Atualizar um anúncio de emprego existente.
  - `DELETE /jobs/{id}`: Excluir um anúncio de emprego.

- **Empresas**: `/companies`
  - `GET /companies`: Recuperar todas as empresas.
  - `GET /companies/{id}`: Recuperar uma empresa específica por ID.
  - `POST /companies`: Criar uma nova empresa.
  - `PUT /companies/{id}`: Atualizar uma empresa existente.
  - `DELETE /companies/{id}`: Excluir uma empresa.

- **Avaliações**: `/companies/{companyId}/reviews`
  - `GET /companies/{companyId}/reviews`: Recuperar todas as avaliações para uma empresa específica.
  - `GET /companies/{companyId}/reviews/{reviewId}`: Recuperar uma avaliação específica para uma empresa.
  - `POST /companies/{companyId}/reviews`: Adicionar uma nova avaliação para uma empresa.
  - `PUT /companies/{companyId}/reviews/{reviewId}`: Atualizar uma avaliação existente para uma empresa.
  - `DELETE /companies/{companyId}/reviews/{reviewId}`: Excluir uma avaliação para uma empresa.

### Executando a Aplicação

1. Clone o repositório.
2. Navegue até o diretório raiz do projeto.
3. Execute a aplicação com o seguinte comando:

   ```bash
   ./mvnw spring-boot:run


### Aprimoramentos Futuros

- Dockerização: Containerizar a aplicação para facilitar a implantação.
- Integração com Banco de Dados: Implementar configurações de banco de dados para armazenar dados no PostgreSQL.
- Escalabilidade e Refatoração de Arquitetura: Prever a possibilidade de mudanças na arquitetura conforme os requisitos e a escala da aplicação.

### Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para enviar pull requests para melhorar este projeto.

### Licença
Este projeto é licenciado sob a [MIT License](LICENSE).
