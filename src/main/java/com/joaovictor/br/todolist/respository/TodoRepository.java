package com.joaovictor.br.todolist.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joaovictor.br.todolist.infrastructure.entity.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
