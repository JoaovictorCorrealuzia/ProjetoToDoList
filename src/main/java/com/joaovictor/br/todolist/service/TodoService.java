package com.joaovictor.br.todolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.joaovictor.br.todolist.infrastructure.entity.Todo;
import com.joaovictor.br.todolist.respository.TodoRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TodoService {
   private final TodoRepository todoRepository;

   public List<Todo> create(Todo todo){
      todoRepository.save(todo);
      return list();
   }

   public List<Todo> delete(Long id){
      todoRepository.deleteById(id);
      return list();
   }

   public List<Todo> update(Todo todo){
      todoRepository.save(todo);
      return list();
   }

   public List<Todo> list(){
      Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
      return todoRepository.findAll(sort);
   }
}