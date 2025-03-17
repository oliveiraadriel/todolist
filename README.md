# 📌 To-Do List com Spring Boot

Este é um projeto de **Gerenciamento de Tarefas (To-Do List)** desenvolvido com **Java + Spring Boot** e banco de dados relacional.

---

## 🚀 Tecnologias Utilizadas
- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL (ou outro banco relacional)
- Maven

---

## 📂 Estrutura do Projeto
```
📁 todolist-java/
│-- 📄 src/main/java/br/com/adrieloliveira/todolist/entity/Todo.java  # Entidade Todo
│-- 📄 src/main/java/br/com/adrieloliveira/todolist/controller/TodoController.java  # Controller
│-- 📄 src/main/java/br/com/adrieloliveira/todolist/repository/TodoRepository.java  # Repository
│-- 📄 src/main/java/br/com/adrieloliveira/todolist/service/TodoService.java  # Serviço
│-- 📄 README.md  # Documentação
```

---

## 🔄 Como Rodar o Projeto

1. **Clone o repositório**:
   ```sh
   git clone https://github.com/SEU_USUARIO/todolist-java.git
   ```
2. **Configure o banco de dados MySQL** e atualize o `application.properties` com as credenciais do banco.
3. **Execute o projeto** com:
   ```sh
   mvn spring-boot:run
   ```
4. Acesse a API em `http://localhost:8080/todos`.

---

## 🔗 Rotas da API

| Método  | Rota           | Descrição |
|---------|--------------|-----------|
| `GET`   | `/todos`     | Lista todas as tarefas |
| `POST`  | `/todos`     | Adiciona uma nova tarefa |
| `PUT`   | `/todos/{id}` | Atualiza uma tarefa pelo ID |
| `DELETE` | `/todos/{id}` | Deleta uma tarefa |

---

## 📜 Licença

Projeto livre para estudo e melhorias! 🚀

