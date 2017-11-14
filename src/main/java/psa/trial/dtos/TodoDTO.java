package psa.trial.dtos;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import psa.trial.models.Todo;

@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
public class TodoDTO {
    private Long id;
    private String name;
    private String description;

    public static TodoDTO fromTodo(Todo todo) {
        return new TodoDTO(
                todo.getId(),
                todo.getName(),
                todo.getDescription());
    }
}
