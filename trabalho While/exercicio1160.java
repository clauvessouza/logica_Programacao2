import java.util.Scanner;

public class exercicio1160{
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int T  = s.nextInt();
		int casosnalise = 0;
		int anos;
		int PA,	PB , crescPA,crescPB;
		double G1, G2;
		
		while ( casosAnalise < T ) {
			PA = s.nextInt();
			PB = s.nextInt();
			G1 = s.nextDouble();
			G2 = s.nextDouble();
			anos = 0;
		
		
		while (PA <= PB && anos <= 100) {
			crescPA = PA*(G1/100.0);
			crescPB = PB*(G2/100.0);
			anos ++;
				
		}
			if(anos>100){
			 System.out.println("Mais de 1 seculo.");
			}else{
				System.out.println(anos + ".%f0\n anos");
			}
		}
		casosAnalise++;
			s.close();
		}
	}
	

