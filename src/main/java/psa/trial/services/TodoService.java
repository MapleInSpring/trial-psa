package psa.trial.services;

import lombok.AllArgsConstructor;
import psa.trial.dtos.TodoDTO;
import psa.trial.models.Todo;
import org.springframework.stereotype.Service;
import psa.trial.dtos.CreateTodoDTO;
import psa.trial.repositories.TodoRepository;

@Service
@AllArgsConstructor
public class TodoService {
    private TodoRepository todoRepository;

    public TodoDTO createTodo(CreateTodoDTO dto) {
        Todo saved = todoRepository.save(new Todo(null, dto.getName(), dto.getDescription()));

        return TodoDTO.fromTodo(saved);
    }
}
