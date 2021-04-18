package intromethods.todo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TodoList {

    private List<Todo> todos = new ArrayList<>();

    public void addTodo(String caption) {
        todos.add(new Todo(caption));
    }

    public void finishTodos(String caption) {
        todos.stream().filter(e -> e.getCaption().equals(caption)).forEach(Todo::finish);
//        for (Todo todo : todos) {
//            if (caption.equals(todo.getCaption())) {
//                todo.finish();
//            }
//        }
    }

    public void finishAllTodos(List<String> todosToFinish) {
        for (String todos : todosToFinish) {
            finishTodos(todos);
        }
    }

    public List<String> todosToFinish() {
        return todos.stream().filter(e -> !e.isFinished()).map(Todo::getCaption).collect(Collectors.toList());
//        List<String> todosToFinish = new ArrayList<>();
//        for (Todo todo : todos) {
//            if (!todo.isFinished()) {
//                todosToFinish.add(todo.getCaption());
//            }
//        }
//        return todosToFinish;
    }

    public int numberOfFinishedTodos() {
        return (int) todos.stream().filter(Todo::isFinished).count();
//        int numberOfFinishedTodos = 0;
//        for (Todo todo : todos) {
//            if (todo.isFinished()) {
//                numberOfFinishedTodos += 1;
//            }
//        }
//        return numberOfFinishedTodos;
    }

    @Override
    public String toString() {
        return todos.toString();
    }
}
