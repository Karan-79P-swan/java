public class findOccurance {
    public static int first = -1;
    public static int last = -1;

    public static void ocurrance(String str,int idx,char element){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
           return ;
        }
        char currentchar = str.charAt(idx);
        if(currentchar==element)
        {
            if(first== -1)
            {
                first = idx;
            }
            else{
                last=idx;
            }
        }
        ocurrance(str,idx+1,element);
    }

    public static void main(String args[]){
        String str = "aajdhaadshaad";
        ocurrance(str,0,'a');
    }
    
}
