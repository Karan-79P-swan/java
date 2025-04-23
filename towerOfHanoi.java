class towerOfHanoi {
     public static void towerHanoi(int n,String src,String helper,String dest)
     {
        if(n == 1){
            System.out.println("Transfer disk "+n+" From "+src+" to "+dest);
            return;
        }
        towerHanoi(n-1,src,dest,helper);
        System.out.println("Transfer disk "+n+" From "+src+" to "+dest);
        towerHanoi(n-1,helper,src,dest);
     }

     public static void main(String[] args)
     {
        int n = 3;
        towerHanoi(n,"S","H","D");
     }
    
}
