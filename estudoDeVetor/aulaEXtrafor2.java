import java.util.Scanner;

public class aulaEXtrafor2{
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		double valorTotal =30000;
		        
        for(int parcela = 1 ; parcela <= valorTotal; parcela++){
        double valorParcela = valorTotal/parcela;
		if(valorParcela < 1000){
			break;
			 
		}
		System.out.println("Parcela " + parcela + " R$ " + valorParcela);	
		}
		
	}
}