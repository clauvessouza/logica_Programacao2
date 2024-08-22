import java.util.Scanner;

public class exercicio1101{
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int m = 0;
		int n = 0;
		int inicio = 0;
		int fim = 0;
		int Sum = 0;
		m = s.nextInt();
		n = s.nextInt();

		while (n> 0 && m > 0) {
			if(m>n){
			 inicio = n;
			 fim = m;
			}
			else{
				inicio = m;
				fim = n;
			}
			for(int i = inicio; i<= fim;i++){
				System.out.print(i+" ");
				Sum += i;
			}
			System.out.printf("Sum=%d\n", Sum);
			Sum = 0;
			m = s.nextInt();
			n = s.nextInt();
		}
		s.close();
		
	}
}
