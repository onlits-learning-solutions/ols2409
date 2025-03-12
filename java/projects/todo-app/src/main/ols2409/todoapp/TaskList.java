package ols2409.todoapp;

public class TaskList {

    private int id;
    private String name;
    private Task[] tasks;                   // confirm default with written proof
    private static TaskList taskList;

    private TaskList() {
        id = 0;
        name = "default";
    }

    public static TaskList getTaskList() {
        if (taskList == null) {
            taskList = new TaskList();
        }

        return taskList;
    }

    public void displayAll() {
        if(tasks == null)
        {
            Common.messageBox("List Empty");
            return;
        }
    }

    public void addTask() {

    }

}
