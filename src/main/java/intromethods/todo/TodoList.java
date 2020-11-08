package intromethods.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<Todo> todoList = new ArrayList<>();

    public void addTodo(String caption){
        Todo todo = new Todo(caption);
        todoList.add(todo);
    }
}
