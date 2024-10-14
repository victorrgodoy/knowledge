import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        String file = "literacy.csv";
        readFile(file);

    }

    public static void readFile(String file){
        try {
            Files.lines(Paths.get(file)) // read the file
                    .map(s -> s.split(",")) // map all positions
                    .sorted(Comparator.comparing(x -> x[5])) // organized by comparing position 5
                    .forEach(v-> System.out.println(v[3] + " (" + v[4] + "), " + v[2].split(" ")[1].trim() + ", " + v[5])); // formated print
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
