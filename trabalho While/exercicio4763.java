import java.util.Scanner;

public class exercicio4763{
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
				
		while (true) {
			int ano = s.nextInt();
			
			if(ano < 1900 || ano > 2023){
			System.out.println("Ano invalido");
		}
		else{
			System.out.println(ano);
			break;
		}
			}
			
			

	}
}

