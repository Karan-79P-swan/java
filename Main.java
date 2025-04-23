
import java.io.IOException;
import java.util.*;
 class d2 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and column ");

        int rows = sc.nextInt();
        int cols = sc.nextInt();
         int[][] arr = new int[rows][cols];

        System.out.println("Enter array elements ");

        for(int i=0;i<=rows;i++)
        {
            for(int j=0;j<=cols;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Array: ");

        for(int i=0;i<=rows;i++)
        {
            for(int j=0;j<=cols;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
