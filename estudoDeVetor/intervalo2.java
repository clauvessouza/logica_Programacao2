
import java.util.Scanner;

public class intervalo2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numerosLidos = entrada.nextInt();
        int quantidadeDentroDoLimite = 0;
        int quantidadeForaDoLimite = 0;
        int [] vetorNumeros = new int[numerosLidos];

        for (int i = 0; i < numerosLidos; i++) {
            vetorNumeros[i] = entrada.nextInt();
        }
        for (int i = 0; i < vetorNumeros.length; i++) {
            if (vetorNumeros[i] >= 10 && vetorNumeros[i] <= 20 ) {
                quantidadeDentroDoLimite++;
            } else {
                quantidadeForaDoLimite++;
            }
        }
        System.out.println(quantidadeDentroDoLimite + " in");
        System.out.println(quantidadeForaDoLimite + " out");
    }
}
	
	