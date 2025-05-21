# CRUD de Clientes - JSF + PrimeFaces + TomEE

Este projeto é uma aplicação web simples para o gerenciamento de clientes, permitindo criar, visualizar, editar e excluir registros. Desenvolvido com Java, JSF (PrimeFaces), TomEE e banco de dados H2.

---

Funcionalidades

- Listagem paginada de clientes
- Busca por nome, e-mail ou telefone
- Cadastro de novos clientes
- Edição de clientes existentes
- Exclusão de clientes
- Máscara de telefone e validação de e-mail
- Exibição de mensagens de sucesso/erro

---

Requisitos

- Java 17
- Maven 3.8+
- Git (opcional, para clonar o repositório)

---

Como executar o projeto

1. Clone o repositório:

git clone https://github.com/SEU_USUARIO/crud-clientes.git
cd crud-clientes

2. Compile e empacote:

mvn clean package

3. Rode o projeto com TomEE:

mvn tomee:run

4. Acesse a aplicação:

http://localhost:8080/index.xhtml



Tecnologias utilizadas

Java 17
JSF 2.3 (MyFaces)
PrimeFaces 8.0
Apache TomEE 8.0.12
H2 Database
Maven



Banco de dados

Utiliza H2 em memória (não persiste dados entre execuções).