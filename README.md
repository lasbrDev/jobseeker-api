# JobAPI

## Descrição
JobAPI é uma aplicação em Spring Boot para gerenciar posições de empregos em aberto.

## Pré-requisitos
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)

## Configuração do Projeto

1. **Clone o repositório:**

    ```bash
    git clone https://seurepositorio.com/seu-usuario/JobAPI.git
    ```

2. **Navegue até o diretório do projeto:**

    ```bash
    cd JobAPI
    ```

3. **Compile o projeto:**

    ```bash
    mvn clean install
    ```

## Executando a Aplicação

1. **Execute o seguinte comando:**

    ```bash
    java -jar target/jobapi-1.0.0.jar
    ```

    Certifique-se de substituir `1.0.0` pela versão atual do seu aplicativo.

2. **Acesse a API em `http://localhost:8080`** no seu navegador ou ferramenta de API como o [Insomnia](https://insomnia.rest/) para começar a interagir com a aplicação.

## Endpoints Disponíveis

- `GET /jobs`: Obtém a lista de todas as posições de empregos.
- `POST /jobs`: Cria uma nova posição de emprego.
- `GET /jobs/{id}`: Obtém detalhes de uma posição de emprego específica.
- `PUT /jobs/{id}`: Atualiza uma posição de emprego existente.
- `DELETE /jobs/{id}`: Exclui uma posição de emprego.

## Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para enviar pull requests para melhorar este projeto.

## Futuras Funcionalidades
Este projeto ainda está em desenvolvimento, e futuras funcionalidades incluirão:
- Integração com um banco de dados (por exemplo, PostgreSQL).
- Dockerização da aplicação.

## Licença
Este projeto é licenciado sob a [MIT License](LICENSE).
