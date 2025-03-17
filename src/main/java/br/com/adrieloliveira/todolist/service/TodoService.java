package br.com.adrieloliveira.todolist.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.adrieloliveira.todolist.entity.Todo;
import br.com.adrieloliveira.todolist.repository.TodoRepository;


@Service
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo) {
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> list() {
        Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
        return todoRepository.findAll(sort);
    }

    /**
     * Update a Todo and return all the Todos.
     * 
     * @param todo the Todo to be updated
     * @return a list of all the Todos
     */
    public List<Todo> update(Todo todo) {
        // Verifique se a tarefa existe no banco de dados
        Optional<Todo> existingTodo = todoRepository.findById(todo.getId());
        
        if (existingTodo.isPresent()) {
            // Atualize os dados da tarefa existente
            Todo todoToUpdate = existingTodo.get();
            todoToUpdate.setNome(todo.getNome()); // Atualize o nome, por exemplo
            todoToUpdate.setPrioridade(todo.getPrioridade()); // Atualize a prioridade, etc.
            // Salve a tarefa atualizada
            todoRepository.save(todoToUpdate);
        }

        // Retorne todas as tarefas após a atualização
        return list();
    }

    public List<Todo> delete(long id) {
        todoRepository.deleteById(id);
        return list();
    }
}
