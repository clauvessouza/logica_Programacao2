import java.util.Scanner;

public class exercicio4767{
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
				
		while (true) {
			double nota = s.nextDouble();
			if(nota>=0 && nota<=10||nota>=100 && nota<=200){

				System.out.printf("%.1f%n", nota);
				break;
			}
			else{
				System.out.println("nota invalida");
			}
			
		}
			}
			
			

	}


