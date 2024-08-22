import java.util.Scanner;

public class exercicio1113{
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int x, y;
		x = s.nextInt();
		y = s.nextInt();

		while (x!=y) {
			if(x<y){
			 System.out.println("Crescente");
			}
			else{
				System.out.println("Decrescente");
			}
						
			x = s.nextInt();
			y = s.nextInt();
			
		}
		s.close();
		
	}
}
