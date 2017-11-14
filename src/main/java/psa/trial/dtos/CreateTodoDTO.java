package psa.trial.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CreateTodoDTO {
    private String name;
    private String description;
}
