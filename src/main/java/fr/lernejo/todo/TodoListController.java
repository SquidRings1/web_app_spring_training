package fr.lernejo.todo;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoListController {

    private final List<Todo> TodoList = new ArrayList<>();

    @PostMapping
    public void addTodo(@RequestBody Todo todo) {
        TodoList.add(todo);
    }

    @GetMapping
    public List<Todo> getTodos() {
        return new ArrayList<>(TodoList);
    }
}
