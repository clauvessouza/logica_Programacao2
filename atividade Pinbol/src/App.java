import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int p = s.nextInt();
	    int r = s.nextInt();
	    
	    if(p==0 && r== 0||p==0 && r==1){
	        System.out.println("C");
	    } else if(p==1&&r==0){
	        System.out.println("B");
	     } else{
	         System.out.println("A");
	     }
}
}