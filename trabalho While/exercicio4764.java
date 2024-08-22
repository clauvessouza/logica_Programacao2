import java.util.Scanner;

public class exercicio4764{
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
				
				char sexo = 'm';
				int idade = Integer.MIN_VALUE;
				double salario = Integer.MIN_VALUE;
				char seguir= 's';

				double mediasal = 0.00;
				double totalSal = 0.00;
				int contSal = 0;
       			int contSalM = 0;

				int maior = Integer.MAX_VALUE;
				int menor = Integer.MIN_VALUE;
				
		while (seguir!= 'n') {
			// Ler os dados do entrevistado
			idade = s.nextInt();
			sexo = s.next().charAt(0);
			salario = s.nextDouble();
            seguir = s.next().charAt(0);

			 // acumula salario
			 totalSal+=salario;
			 contSal++;
			 //Fazendo média de salarios
			 mediasal=totalSal/contSal;

			if (idade > maior) {
                maior = idade;
			}
			if (idade < menor) {
                menor = idade;
            }
			if  (sexo=='f'&& salario>3000.00) {
                contSalM++;
            }
			}
  
 System.out.printf("Media salarios = R$ %.2f%n", mediasal);
 System.out.printf("Menor e maior idade = %d e %d%n", menor, maior);
 System.out.printf("Salarios de mulheres acima de R$ 3000.00 = "+contSalM);
 
}
}

