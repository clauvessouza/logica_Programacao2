import java.util.Scanner;

public class exercicio1115{
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int x, y;
		x = s.nextInt();
		y = s.nextInt();

		while (x!=0 && y!=0) {
			if(x > 0 && y > 0){
			 System.out.println("primeiro");
			}
			 else if(x < 0 && y > 0){
				System.out.println("segundo");
			}
			 else if(x < 0 && y < 0){
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");	
			}
			x = s.nextInt();
			y = s.nextInt();
	}
	s.close();
}
}
