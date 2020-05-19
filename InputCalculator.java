import java.util.Scanner;
 
class InputCalculator {
public static void main(String Args[]){
inputThenPrintSumAndAverage();
     }

public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double avg = 0;
        int count = 0;
        while(true){
            boolean isInt = scanner.hasNextInt();
            
            if(isInt){
                int number = scanner.nextInt();
                count++;
                sum = sum + number;
                avg = (double)sum / (double)count;

            }else{
                break;
            }
            scanner.nextLine();
        }
        //System.out.println(avg);
        System.out.println("SUM = " + sum + " AVG = " +  Math.round(avg));
        
    }

}