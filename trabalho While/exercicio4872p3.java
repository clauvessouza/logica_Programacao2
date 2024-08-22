import java.util.Scanner;
public class exercicio4872p3{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double valor = 0.00;
        double soma = 0.00;
        double finaliza = 0.00;
        int contnumero = 0;  

        while (finaliza==0) {
            valor = s.nextDouble();
            if(valor>=0){
                contnumero++;
                soma+=valor;
            }else{
                finaliza = 1.00;
            }
        }
        System.out.printf("Soma = %.2f\n",soma);
        System.out.println("Quantidade = " + contnumero);
        
    }
}
