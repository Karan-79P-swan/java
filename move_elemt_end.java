class move_elemt_end{
    public static void move(String str,int idx,int count,String newstr){
        if(idx== str.length()){
            for(int i=0;i<count;i++){
                newstr += 'x';
            }
            System.out.println(newstr);
            return;
        }

        char currentchar = str.charAt(idx);
        if(currentchar == 'x'){
            count++;
            move(str,idx+1,count,newstr);
        }
        else{
            newstr += currentchar;
            move(str,idx+1,count,newstr);
        }
    }

    public static void main(String[] args){
        String str = "akxxksxxhdx";
        move(str,0,0,"");
    }
}