package intromethods.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<Todo> todoList = new ArrayList<>();

    public void addTodo(String caption) {
        Todo todo = new Todo(caption);
        todoList.add(todo);
    }

    public void finishTodos(String caption) {
        for (Todo todo : todoList) {
            if (caption.equals(todo.getCaption())) {
                todo.finish();
            }
        }
    }

    public void finishAllTodos(List<String> todosToFinish) {
        for (String todos : todosToFinish) {
            finishTodos(todos);
        }
           /* for(Todo todo : todoList){
                if(todos.equals(todo.getCaption())){
                    todo.finish();
                }
            }
        }*/
    }

    public List<String> todosToFinish() {
        List<String> todosToFinish = new ArrayList<>();
        for (Todo todo : todoList) {
            if (!todo.isFinished()) {
                todosToFinish.add(todo.getCaption());
            }
        }
        return todosToFinish;
    }

    public int numberOfFinishedTodos() {
        int numberOfFinishedTodos = 0;
        for(Todo todo : todoList){
            if(todo.isFinished()){
                numberOfFinishedTodos += 1;
            }
        }
        return numberOfFinishedTodos;
    }
}
