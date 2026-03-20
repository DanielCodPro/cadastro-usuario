# 🚀 Cadastro de Usuário - API Spring Boot

Este é um projeto inicial desenvolvido em Java para gerenciar o cadastro de usuários, utilizando as melhores práticas do ecossistema Spring.

## 🛠️ Tecnologias Utilizadas
* **Java 17** (ou a versão que você estiver usando)
* **Spring Boot 3**
* **Spring Data JPA** (para persistência de dados)
* **H2 Database**: Banco de dados em memória para testes rápidos.
* **Maven**: Gerenciador de dependências.

## 🏁 Como rodar o projeto
1. Clone o repositório ou baixe o código.
2. Abra o projeto no **IntelliJ IDEA**.
3. Espere o Maven baixar as dependências.
4. Clique no botão **Run** na classe `CadastroUsuarioApplication`.

## 📊 Acessando o Banco de Dados (H2)
Com o projeto rodando, você pode visualizar as tabelas no navegador:
* **URL:** `http://localhost:8081/h2-console`
* **JDBC URL:** `jdbc:h2:mem:testdb`
* **User:** `sa`
* **Password:** (deixe em branco)

## 🚀 Testando a API
Você pode usar o **Postman** para enviar requisições para a porta `8081`.
