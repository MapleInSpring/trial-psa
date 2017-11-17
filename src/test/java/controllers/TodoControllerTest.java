package controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import psa.trial.TrialApplication;
import psa.trial.dtos.CreateTodoDTO;

import static org.hamcrest.Matchers.notNullValue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TrialApplication.class)
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class TodoControllerTest {

    @Autowired
    private MockMvc mvc;

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    @Test
    public void createTodo_savesTodo_and_returnTodoId() throws Exception {
        CreateTodoDTO dto = new CreateTodoDTO("Buy milk", "Try fair price");
        String contentBody = mapper.writeValueAsString(dto);

        mvc.perform(
                post("/todos")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(contentBody))
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$.id", notNullValue()));
    }
}
