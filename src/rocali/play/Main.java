package rocali.play;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Warming 🏃 up JAVA! With a little project for managing Movies 📽");
        System.out.print("Please enter a your name: ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name + ". This is a small project aimed to remain Java.");

        System.out.print("How old are you " + name + ": ");
        int age = scanner.nextInt();
        System.out.println(name + " you can consume content +" + age);
    }
}
