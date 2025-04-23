// public class recursion {
//     public static void printNum(int n)
//     {
//         if (n > 5){
//             return;
//         }
//         System.out.println(n);
//         printNum(n+1);
//     }

//     public static void main (String[] args)
//     {
//         int n=1;
//         printNum(n);
//     }
    
// }

// import util.java.*;
class recursion{
     public static void print(int i,int n,int sum){
        
        if(i == n){
            sum+=i;
            System.out.println(sum);
            return;
        }
       sum+=i;
        print(i+1,n,sum);
        
 
     }
     public static void main(String[] args)
     {
        
        print(1,100,0);
     }
}