import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(-10);
        System.out.println(positive(arrayList));

    }

    public static List<Integer> positive(List<Integer> numbers){
        ArrayList<Integer> arrayList =  numbers.stream() 
                                        .filter(n -> n > 0)
                                        .collect(Collectors.toCollection(ArrayList::new)); // create a new list with numbers of filter

        return arrayList;
    }

}
