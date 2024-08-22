import java.util.Scanner;

public class exercicioProva4{
	
	public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
		int valoresA[]= new int[n];
		int valoresB[] = new int[n];
		int multi[] = new int[n];
		for(int i=0; i < valoresA.length; i++){
			valoresA[i] = s.nextInt();
						
			}
			
			for(int i=0; i < valoresB.length; i++){
				valoresB[i]= s.nextInt();
			}
			for(int i= 0; i < multi.length; i++){
				multi[i]= valoresA[i]*valoresB[i];
			}
			for (int i = 0; i < multi.length; i++) {
				if(i==0){
					System.out.printf("{");
				}
	
				if(i!=n-1){
					System.out.printf(multi[i]+",");
				}else{
					System.out.printf("%d",multi[i]);
				}
				
	
				if (i==n-1) {
					System.out.printf("}\n");
			
			}
			
			
			}
		}
	}
		
	
	