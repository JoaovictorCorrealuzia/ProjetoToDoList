package com.joaovictor.br.todolist.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.joaovictor.br.todolist.infrastructure.entity.Todo;
import com.joaovictor.br.todolist.service.TodoService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/todolist")
@AllArgsConstructor
public class TodoController {
   private final TodoService todoService;

   @PostMapping
   public List<Todo> create(@RequestBody Todo todo){
      return todoService.create(todo);
   }

   @GetMapping
   public List<Todo> list(){
      return todoService.list();
   }

   @DeleteMapping
   public List<Todo> delete(@RequestParam Long id){
      return todoService.delete(id);
   }

   @PutMapping
   public List<Todo> update(@RequestBody Todo todo){
      return todoService.update(todo);
   }
}
