import java.util.Scanner;
public class practic {
   
       public static  int fact(int n){
         int fac=1;
         for(int i=1;i<=n;i++){
            fac = fac*i;
            // if(i == 0) return 1;
         }
          return fac;
        }
       
       public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         System.out.println("factorial is "+fact(n));
         sc.close();
       }
    
}
