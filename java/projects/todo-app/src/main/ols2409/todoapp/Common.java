package ols2409.todoapp;

public class Common {
    public static void printLine(int n) {
        for(int i=1; i<=n; i++)
            System.out.print("-");
        System.out.println("");
    }

    public static void messageBox(String message) {
        printLine(message.length());
        System.out.println(message);
        printLine(message.length());
    }
}