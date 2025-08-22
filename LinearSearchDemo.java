import java.util.Scanner;

public class LinearSearchDemo{
    public static void main (String a[]){
        Scanner s=new Scanner(System.in);
    System.out.println("enter size of array");
    int n=s.nextInt();
    System.out.println("enter elements of array");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
    }
        System.out.print("Enter the element to search: ");
        int target=s.nextInt();
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Element found at index: " + i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
    }
}

