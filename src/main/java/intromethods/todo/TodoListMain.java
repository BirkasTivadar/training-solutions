package intromethods.todo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TodoListMain {

    public static void main(String[] args) {
        TodoList todoList = new TodoList();

        todoList.addTodo("bevásárlás");
        todoList.addTodo("takarítás");
        todoList.addTodo("edzés");

        System.out.println(todoList);
        todoList.finishAllTodos(Arrays.asList("takarítás", "edzés"));
        System.out.println(todoList.todosToFinish());
        System.out.println(todoList);
        System.out.println(todoList.numberOfFinishedTodos());
    }
}
