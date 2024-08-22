import java.util.Scanner;
public class exercicioProva3 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sendoPar= 0;
        int numeros[] = new int[n];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = s.nextInt();
            if (numeros[i] % 2 == 0) {
                sendoPar++;
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            if(i==0){
                sendoPar++;
                System.out.printf("{");
            }
            
            if(numeros[i]%2 ==0){
                if (i!=n-1) {
                    System.out.printf("%d;",numeros[i]);
                }else{
                    System.out.printf("%d;",numeros[i]);
                }
            }          

            if (i==n-1) {
                System.out.printf("}\n");
            }
        }
    }
}