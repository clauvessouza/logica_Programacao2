public class exer1095 {
    public static void main(String[] args) throws Exception {
        /* 
        int i=1;
        
        for (int j = 60; j >=0 ; j = j-5) {
            
            System.out.println("I="+i+" "+"J="+j);
           i+=3;
           
        }
        */
        int j = 60;

        for (int i = 1; i <60&&j>=0 ; i+=3) {
            
            System.out.println("I="+i+" "+"J="+j);
            j-=5;
        }

    }
}