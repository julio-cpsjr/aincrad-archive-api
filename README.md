### 📚 Aincrad Library – API Version (Microservices)
#### 📖 Sobre o Projeto

 O Aincrad Library API é a evolução arquitetural do projeto Biblioteca Aincrad.

Este projeto representa a terceira etapa da evolução do sistema:

### Versão 1 – Monólito com Lista em Memória

Persistência utilizando List

Sem banco de dados

Foco em lógica de negócio básica

### Versão 2 – Monólito com JDBC

Integração com banco relacional

Persistência real via JDBC

Separação em camadas (Controller, Service, Repository)

### Versão 3 – API com Microserviços

Arquitetura distribuída

API Gateway

Serviços independentes

Comunicação via HTTP

Containers Docker

#### Esta versão implementa uma arquitetura moderna baseada em microsserviços utilizando Spring Boot e Docker.

### 🏗 Arquitetura

O sistema é composto por:

API Gateway

Ponto único de entrada

Roteamento de requisições

Agregação de documentação Swagger

Serviços independentes

books-service <br/>
users-service <br/>
loans-service <br/>

(outros serviços conforme expansão do projeto)

Cada serviço roda em um container separado e se comunica através da rede interna do Docker.

O acesso externo ocorre exclusivamente pelo Gateway.

### 🛠 Tecnologias Utilizadas

Java 17+

Spring Boot

Spring Cloud Gateway

Spring Data / JDBC

SpringDoc OpenAPI (Swagger)

Docker

Docker Compose

### 📦 Estrutura do Projeto
aincrad-archive-api/ <br/>
│ <br/>
├── gateway/ <br/>
├── books/ <br/>
├── users/ <br/>
├── loans/ <br/>
├── docker-compose.yml <br/>
└── README.md <br/>

### 🚀 Como Executar o Projeto
1️⃣ Clonar o repositório <br/>
git clone https://github.com/seu-usuario/aincrad-archive-api.git <br/>
cd aincrad-archive-api <br/>
2️⃣ Subir os containers <br/>
docker-compose up --build <br/>
3️⃣ Acessar a aplicação <br/>

### API Gateway:

http://localhost:8080

Exemplo de endpoint:

http://localhost:8080/books
### 📑 Documentação da API (Swagger)

A documentação unificada pode ser acessada via:

http://localhost:8080/swagger-ui.html

O Gateway centraliza a documentação dos microsserviços.

### 🔄 Evolução Arquitetural
Versão | Arquitetura | Persistência |	Escalabilidade <br/>
V1	| Monólito	| Lista em memória |Baixa<br/>
V2	| Monólito | JDBC | Média <br/>
V3	| Microserviços | JDBC + Containers | Alta <br/>

### 🎯 Objetivo Educacional

Este projeto foi desenvolvido com fins de estudo e prática em:

Evolução arquitetural

Refatoração de sistemas

Separação de responsabilidades

Arquitetura baseada em microsserviços

Containerização

### 📌 Próximos Passos

Implementação de Service Discovery

Circuit Breaker

Autenticação e Autorização (JWT)

Observabilidade (Logs centralizados)

Deploy em ambiente cloud

### 👨‍💻 Autor

Julio Cesar <br/>
#### Desenvolvedor Java