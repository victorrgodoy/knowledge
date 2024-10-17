
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Divisible {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(); // array list of numbers
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers); 

        divisible.stream()
                .forEach(num -> System.out.println(num)); // for each in stream
    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) { // // method to get the divisor numbers of 2,3 and 5 and return new list with numbers
        return numbers.stream() 
                .filter(n -> n % 2 == 0 || n % 3 == 0 || n % 5 == 0) // filter the numbers 
                .collect(Collectors.toCollection(ArrayList::new)); // collect numbers for put in the new array list 

    }

}
