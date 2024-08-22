import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int numeros[] = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = s.nextInt();
        }

        int x = s.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if(i%x==0){
                System.out.println("Pos[" + i + "] = " + numeros[i]);
            }
        }
    }
}