import java.util.Scanner;

public class exercicio1170{
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int dias=0;
		double comida[] = new double[n];
		
		
		for(int j=0; j < n; j++){
		 comida[j] = s.nextDouble();
		}
		for(int i = 0 ; i < n; i++){
			while (comida[i]>1){
			comida[i]= comida[i]-(comida[i]/2);
			dias++;
			}
			System.out.println(dias +" dias");
			dias = 0;
		}
	}
}
	
	