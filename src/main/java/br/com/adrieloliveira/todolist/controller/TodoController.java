package br.com.adrieloliveira.todolist.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.adrieloliveira.todolist.entity.Todo;
import br.com.adrieloliveira.todolist.service.TodoService;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;

    
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    // Criar uma nova tarefa
    @PostMapping
    public List<Todo> create(@RequestBody Todo todo) {
        return todoService.create(todo);
    }

    // Listar todas as tarefas
    @GetMapping
    public List<Todo> list() {
        return todoService.list();
    }

    // Atualizar uma tarefa existente com base no ID
    @PutMapping("/{id}")
    public List<Todo> update(@PathVariable("id") long id, @RequestBody Todo todo) {
        // Passar o ID para o serviço atualizar a tarefa
        todo.setId(id); // Definir o ID da tarefa a ser atualizada
        return todoService.update(todo);
    }

    // Deletar uma tarefa com base no ID
    @DeleteMapping("/{id}")
    public List<Todo> delete(@PathVariable("id") long id) {
        return todoService.delete(id);
    }
}
