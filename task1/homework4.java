import java.util.Scanner;
import java.util.Arrays;

public class homework4 {
    
    public static void main(String[] args) {
        
   
        Scanner sc = new Scanner(System.in);
        
        System.out.println("please enter the capacity of the array:");
        int capacity = sc.nextInt();    
        int[] arr = new int[capacity];
        System.out.println("the capacity of the array:" + arr.length);
        
        System.out.println("please enter the elements in the array:");
        System.out.println("------------------------------------------");
        boolean stop = false;
        int stock = 1; 
        String instruct; 
        
        while(!stop) {
            
            System.out.println("please the number " + stock + " element:");
            arr[stock-1] = sc.nextInt();
            System.out.println();
            System.out.println(Arrays.toString(arr));
            
            if(stock>=arr.length*4/5) {
                System.out.println("------------------------------------------");
                System.out.println("The storage capacity has reached 80% of the array capacity, which has been expanded to 1.5 times");
                
				int[] arr2 = new int[arr.length*3/2];
               
                for(int i=0; i<arr.length; i++) {
                    arr2[i] = arr[i];
                }
                arr = arr2; 
                System.out.println("the array capacity:" + arr.length + " (hss already stored :" + stock + ")");
                System.out.println("------------------------------------------");
            }
            
            System.out.println("------------------------------------------");
            System.out.println("whether to continue entering(y/n)");
            instruct = sc.next();
            stop = (instruct.equals("n")) ? true : false;
            
            if(stop){
                System.out.println("end of entering !" );
                System.out.println("the array now you get is :");
                System.out.println("------------------------------------------");
                System.out.println(Arrays.toString(arr));
                System.out.println("------------------------------------------");
                System.out.println("array capacity is :" + arr.length + "(has stored:" + stock + ")");
            }
            
            stock++;
        }
        
    }
}

