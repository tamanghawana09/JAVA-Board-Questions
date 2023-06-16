import java.util.Scanner;

interface Calculation{
    void calculateSum(int[] numbers);
    void calculateAverage(int[] numbers);
}
class calculate implements Calculation{
    @Override
    public void calculateSum(int[] numbers) {
        int sum =0;
        for(int num : numbers){
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }

    @Override
    public void calculateAverage(int[] numbers) {
        int sum =0;
        for(int num : numbers){
            sum += num;
        }
        double average = (double) sum/ numbers.length;
        System.out.println("Average:" + average);
    }
}

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();

        int[] numbers = new int[n];
        System.out.print("Enter " + n + " numbers: ");
        for(int i=0;i<n;i++){
            numbers[i] = input.nextInt();
        }
        calculate cal = new calculate();
        cal.calculateSum(numbers);
        cal.calculateAverage(numbers);
    }
}