package ols2409.todoapp;

public class TodoApp {
    public static void main(String[] args) {
        TaskList taskList = TaskList.getTaskList();
        taskList.displayAll();
    }
}