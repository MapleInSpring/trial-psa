package psa.trial.services;

import psa.trial.dtos.TodoDTO;
import psa.trial.models.Todo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import psa.trial.dtos.CreateTodoDTO;
import psa.trial.repositories.TodoRepository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TodoServiceTest {
    @InjectMocks
    private TodoService todoService;

    @Mock
    private TodoRepository todoRepository;

    @Test
    public void createTodo_savesTodo_and_returnsTodoId() throws Exception {
        Todo newTodo = new Todo(null, "name", "desc");
        Todo savedTodo = new Todo(1L, "name", "desc");
        when(todoRepository.save(newTodo)).thenReturn(savedTodo);
        CreateTodoDTO createTodoDTO = new CreateTodoDTO("name", "desc");

        TodoDTO todoDTO = todoService.createTodo(createTodoDTO);

        TodoDTO expectTodoDTO = new TodoDTO(1L, "name", "desc");
        verify(todoRepository).save(newTodo);
        assertThat(todoDTO).isEqualTo(expectTodoDTO);
    }
}
