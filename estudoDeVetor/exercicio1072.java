import java.util.Scanner;

public class exercicio1072{
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int dentroVetor = 0;
		int foraVetor = 0;
		int numeros[] = new int[n];
		
		for(int i=0; i<n; i++){
			numeros[i] = s.nextInt();
		}
		for(int j = 0 ; j<n;j++){
			if(numeros[j]>= 10 && numeros[j] <= 20){
			dentroVetor++;
			}
			else{
				foraVetor++;
			}

		}
		System.out.println(dentroVetor + " in");	
		System.out.println(foraVetor + " out");
	
		
		}
		
		}
	
		
	
	