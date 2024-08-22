import java.util.Scanner;

public class Main{
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int valor[] = new int[10];
		// indicar o tamanho do vetor
		for(int i=0; i < 10; i++){
			// indica o valor a ser lançado
		 valor[i] = s.nextInt();
		 // avalia a entrada
		if(valor[i]<=0){
			valor[i]=1;
	}
	
}	
	for(int i=0; i < 10; i++){

	System.out.println("X[" + i + "] = " + valor[i]);
	}
	}
}
// atenção criar local de transferencia ou armazenamento