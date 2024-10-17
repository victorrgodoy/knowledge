
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();


        while (true){
            int input = Integer.parseInt(scanner.nextLine());

            if (input < 0){
                break;
            }

            arrayList.add(input);

        }

        arrayList.stream()
                .filter(n -> n > 0 && n < 6)
                .forEach(System.out::println);


    }
}
