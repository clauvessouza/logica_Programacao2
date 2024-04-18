import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();
		double menor;
		double meio;
		double maior;
	 
	   if(a>=b && a>=c){
	    maior = a;
	    if (b>=c){
	        meio=b;
	        menor=c;}
	        else{
	            meio=c;
	            menor=b;}
	   } else if (b>=c && b>=a){
	     maior=b; 
	          if (c>=a){
	           meio=c;
	           menor=a;}
	          else {
	           meio=a;
	           menor=c;
	               }
	     }
	       else if (c>=a && c>=b){
	           maior=c;
	          if(a>=b){
	              meio=a;
	              menor=b;
	          } else{
	              meio=b;
	              menor=a;
	          }
	       }	 
	    if(a >= b + c){  
		    System.out.println("NAO FORMA TRIANGULO");}
		 
	    else{ 
	       if (Math.pow (a,2) == Math.pow (b,2) + Math.pow(c,2))
	    {    System.out.println("TRIANGULO RETANGULO");
	    }  if(Math.pow(a,2) > Math.pow(b,2) + Math.pow(c,2))
		{    System.out.println("TRIANGULO OBTUSANGULO");
		}  if( Math.pow(a,2) < Math.pow(b,2) + Math.pow(c,2))
		{    System.out.println("TRIANGULO ACUTANGULO");
		}  if (a==b && b==c)
		{    System.out.println("TRIANGULO EQUILATERO");
		} else if (a==b || b==c ||a==c)
		{    System.out.println("TRIANGULO ISOSCELES");
		}
	}
	}	    
}
	