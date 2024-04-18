package teste20240405;

/**
 * pagina
 */
import java.util.Scanner;
public class pagina {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int valorkm = s.nextInt();
    int minutos = (valorkm * 2)/1;
    System.out.println(minutos , " minutos");   

    }
}