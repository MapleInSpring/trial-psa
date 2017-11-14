package psa.trial.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import psa.trial.dtos.CreateTodoDTO;
import psa.trial.dtos.TodoDTO;
import psa.trial.services.TodoService;

@RestController
@AllArgsConstructor
public class TodoController {
    private TodoService todoService;

    @PostMapping("/todos")
    public TodoDTO createTodo(@RequestBody CreateTodoDTO dto) {
        return todoService.createTodo(dto);
    }
}
