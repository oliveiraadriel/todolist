package br.com.adrieloliveira.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adrieloliveira.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
