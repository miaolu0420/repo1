import java.util.Random;
import java.util.Arrays;

public class homework3 {
    
    public static void main(String[] args) {
        
        int[] numList = new int[7]; 
            
        int redLimit = 33;
        Random ra = new Random();
        boolean isOverlap = false;
       
        for(int i=0; i<6; i++) {  
        
        
            do {    
                numList[i] = ra.nextInt(redLimit) + 1; 
                
                for(int j=0; j<i; j++) {
                    if(numList[i]==numList[j]) {
                        isOverlap = true;
                        break;
                    } else {
                        isOverlap = false;
                    }
                }
                
            } while(isOverlap);
            
        }
        
        System.out.println("-------------------------------");
       
        int blueLimit = 16;
        numList[6] = ra.nextInt(blueLimit) + 1;
            
        
        int[] RedNumList = new int[6];
        for(int i=0; i<numList.length-1; i++) {
            RedNumList[i] = numList[i];
        }
        int blueNum = numList[6];
        System.out.println("the winning numbers are :");
        System.out.println("red  red  red  red  red  red  blue");
        System.out.println(Arrays.toString(numList));
    }
}