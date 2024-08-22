import java.util.Scanner;

public class exercicio4867p3{
	
	public static void main (String args[]) {
		Scanner s = new Scanner(System.in);
        int valor = 0; 
        int verNumero=0;
        int par=0;
        int impar= 0;
        double media = 0.0;
        double soma = 0.0;
        valor = s.nextInt();
        verNumero= valor;

        while (soma<=verNumero) {
            valor = s.nextInt();
            if(valor % 2 == 0){
                par++;
            }else{
                impar++;
            }
            soma+=valor;
            media = soma/(impar+par);
        
        System.out.println("Pares = "+ par);
        System.out.println("Impares = "+ impar);
        System.out.printf("media = %.2f\n",media);
        //finaliza programa
        s.close();
    }
}
}
