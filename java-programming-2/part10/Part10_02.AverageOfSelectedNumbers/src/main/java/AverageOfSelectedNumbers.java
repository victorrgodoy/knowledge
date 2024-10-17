import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input numbers, type \"end\" to stop.");
        String input;
        double pAverage;
        double nAverage;

        ArrayList<String> numbers = new ArrayList<>();
        while (true){
            input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            numbers.add(input);
        }

        pAverage = numbers
                .stream() //filter elements of list
                .mapToInt(s -> Integer.valueOf(s)) //transform string to int
                .filter(s -> s > 0) //filter positive elements
                .average() //take average
                .getAsDouble(); //get double result

        nAverage = numbers
                .stream()
                .mapToInt(Integer :: valueOf)
                .filter(s -> s < 0)
                .average()
                .getAsDouble();

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        input = scanner.nextLine();

        if (input.equals("n")){
            System.out.println("Average of the negative numbers: " + nAverage);
        }

        if (input.equals("p")){
            System.out.println("Average of the negative numbers: " + pAverage);
        }

    }
}
