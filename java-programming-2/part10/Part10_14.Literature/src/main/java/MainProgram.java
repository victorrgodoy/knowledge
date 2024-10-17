import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> arrayList = new ArrayList<>(); // to add books

        while (true) {
            System.out.print("Input the name of the book, empty stops:");
            String bookName = scanner.nextLine();

            if (bookName.isEmpty()){
                break;
            }

            System.out.print("Input the age recommendation:");
            int bookAge = Integer.parseInt(scanner.nextLine());

            Book book = new Book(bookName, bookAge);
            arrayList.add(book);
        }

        int amountBook = arrayList.size();
        System.out.println();
        System.out.println(amountBook + " books in total.");
        System.out.println();
        System.out.println("Books:");

        // compare data between the books
        Comparator<Book> comparator = Comparator.comparing(Book::getAge).thenComparing(Book::getName);
        arrayList.sort(comparator);

        for (Book e : arrayList){
            System.out.println(e);
        }

    }
}
