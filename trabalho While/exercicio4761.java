import java.util.Scanner;

public class exercicio4761{
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int voto=0;
        int v1 = 0, v2= 0, v3 = 0 , vb = 0 , vn = 0;

        while (voto>=0) {
            voto = s.nextInt();
            if(voto==1){
              v1++;
            } else if( voto==2){
                v2++;
            } else if(voto==3){
                v3++;
            } else if(voto==4){
                vn++;
            }else if (voto==5){
                vb++;
            }
            else {
                if(voto<0){
                break;
                }
                
            }
            }
            System.out.println("Candidato 1 : " + v1 + " voto(s)");
            System.out.println("Candidato 2 : " + v2 + " voto(s)");
            System.out.println("Candidato 3 : " + v3 + " voto(s)");
            System.out.println("Nulos : " + vn + " voto(s)");
            System.out.println("Brancos : " + vb + " voto(s)");
            s.close();
            
        }
		
		}
	
