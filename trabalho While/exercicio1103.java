import java.util.Scanner;

public class exercicio1103{
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		int H1 = s.nextInt();
		int M1 = s.nextInt();
		int H2 = s.nextInt();
		int M2 = s.nextInt();
		
		while (H1 != 0 || M1 != 0 || H2 != 0 || M2 != 0) {
			int horarioA = H1*60+M1;
			int horarioB = H2*60+M2;
			int minutosSono;

;		if(horarioB >= horarioA){
		 	minutosSono = horarioB-horarioA;
		}
		else{
			minutosSono = (24*60 - horarioA) + horarioB;
		}
		
		System.out.println(minutosSono);
		 H1 = s.nextInt();
		 M1 = s.nextInt();
		 H2 = s.nextInt();
		 M2 = s.nextInt();
		 
		}
		
		}
		
	}
