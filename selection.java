public class selection {

    public static void print(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main (String [] args)
    {
        int[] arr = {94,6,2,7,9,6,2,5};

        for(int i=0;i<arr.length;i++)
        {
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest] > arr[j])
                {
                    smallest = j;
                }
            }
            int temp;
            temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        print(arr);
    }
    
}
