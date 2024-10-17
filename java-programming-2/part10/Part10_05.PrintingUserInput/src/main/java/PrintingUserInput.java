
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();

        while (true){
            String input = scanner.nextLine();

            if (input.equals("")){
                break;
            }

            arrayList.add(input);

        }

         arrayList.forEach(System.out::println);

    }
}
