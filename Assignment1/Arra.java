import java.util.Scanner;

public class Arra 
{
    
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        int [] arr =new int [5];
        System.out.print("Enter the array element : ");     
        for(int i=0;i<5;i++)
            {
                arr[i] = sc.nextInt();
            }    
        for(int i=0; i<5;i++)
            {
               sum +=arr[i];
            }
        System.out.println("This is the sum of all element : " + sum);     // This is the sum of array
        int avg =sum/5;
        System.out.println("This is the avg of all element : " + avg);     // This is the avg of array
        
        int num =arr[0];
        for(int i=0;i<4;i++)
        {
            if(num<arr[i+1])
            {
                num=arr[i+1];
            }  
        }
        System.out.print("this is the largest element in array : "+num);   //This is the larger no array                                       
    }
}
    

