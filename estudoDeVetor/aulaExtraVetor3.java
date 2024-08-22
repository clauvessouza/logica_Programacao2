import java.util.Scanner;

public class aulaExtraVetor3{
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		//variavel do tipo primitiva: byte, short , int,long e double --0;
		// char '\u0000' ele vai imprimir um espaço em branco " "
		// boolean false
		// string null (nulo)
		// utilizar o length para quantificar o uso do array
		String[] nomes = new String[4];
		nomes[0] = "Goku";
		nomes[1] = "Korusaki";
		nomes[2] = "Luffy";
		nomes[3] = "Hinata";
		// onde esta nomes.length substituiu neste campo o tamanho do vetor
		for( int i = 0; i < nomes.length ; i++){
			// onde eu declarei o lugar para tamanho do vetor
		System.out.println("Nomes " + nomes[i]);
		}
		}
		
	}
