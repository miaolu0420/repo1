import java.util.Scanner;
public class homework1{
    public static void main(String[] args){
        
        int[] monthArr = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        Scanner sc = new Scanner(System.in);
        System.out.println("please input the year:");
        int year = sc.nextInt();
        if(year%4==0 &&year%100 !=0){
            monthArr[1] = 29;
        }
        System.out.println("please input the month:");
        int month = sc.nextInt();
        if(month<1||month>12){
            System.out.println("the information of the month is wrong ");
            return;
        }
        System.out.println("please input the day:");
        int day = sc.nextInt();
        if(day>monthArr[month-1]){
            System.out.println("the information of the day is wrong");
			return;
        }
		
        int days = 0;
        for(int i=0;i<month-1;i++){
            days+= monthArr[i];
        }
        days += day;
        
        System.out.println(year+"-year "+month+"-month "+day+"-day is the "+days+" day in this year");
    }
}

