import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animal1 = scanner.next();
        String animal2 = scanner.next();
        String animal3 = scanner.next();

        if (animal1.equals("vertebrado")) {
            if (animal2.equals("ave")) {
                if (animal3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else if (animal3.equals("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (animal2.equals("mamifero")) {
                if (animal3.equals("onivoro")) {
                    System.out.println("homem");
                } else if (animal3.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }

        }
        scanner.close();
    }
}