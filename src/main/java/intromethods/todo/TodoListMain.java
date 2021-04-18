package intromethods.todo;

import java.util.Arrays;

public class TodoListMain {

    public static void main(String[] args) {

        TodoList todoList = new TodoList();

        todoList.addTodo("bevásárlás");
        todoList.addTodo("takarítás");
        todoList.addTodo("edzés");
        todoList.addTodo("tanulás");
        todoList.addTodo("alvás");

        System.out.println(String.format("Kiinduló teendőlista:\n%s", todoList));

        todoList.finishTodos("bevásárlás");
        System.out.println(String.format("\nBevásárlás utáni lista:\n%s", todoList));


        todoList.finishAllTodos(Arrays.asList("takarítás", "tanulás"));
        System.out.println(String.format("\nTakarítás és tanulás után még elvégzendő feladatok:\n%s", todoList.todosToFinish()));


        System.out.println(String.format("\nZáró lista:\n%s", todoList));

        System.out.println(String.format("\nElvégzett feladatok száma: %d", todoList.numberOfFinishedTodos()));
    }
}
