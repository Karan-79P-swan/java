public class factorial {
    public static int facto(int n)
    {
       
        if(n == 0){
            return 1;
        }
        int fact = n*facto(n-1);
        return fact;
    }

    public static void main(String[] args)
    {
        int n =5;
        System.out.println(facto(n));
    }
    
}
