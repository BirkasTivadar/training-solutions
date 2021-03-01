package exam03retake02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TodoList {

    private List<Todo> todos = new ArrayList<>();

    public List<Todo> getTodos() {
        return new ArrayList<>(todos);
    }

    public void addTodo(Todo todo) {
        todos.add(todo);
    }

    public int getNumberOfItemsLeft() {
        int sum = 0;
        for (Todo todo : todos) {
            if (todo.getState() == State.NON_COMPLETED) {
                sum++;
            }
        }
        return sum;
    }

    public List<String> getMostImportantTodosText() {
        List<String> result = new ArrayList<>();
        List<Todo> temp = new ArrayList<>(todos);
        Collections.sort(temp);
        for (Todo todo : todos) {
            if (todo.getPriority() == temp.get(0).getPriority()) {
                result.add(todo.getText());
            }
        }
        return result;
    }

    public void deleteCompleted() {
        List<Todo> temp = new ArrayList<>();
        for (Todo todo : todos) {
            if (todo.getState() == State.COMPLETED) {
                temp.add(todo);
            }
        }
        todos.removeAll(temp);
    }

}
