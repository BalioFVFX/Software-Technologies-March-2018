package BookLibraryModification;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;



class BookLibraryModification {

    public static class Book{
        public String title;
        public String author;
        public String publisher;
        public String date;
        public String isbnNumber;
        public double price;

        Book(String title, String author, String publisher, String date, String isbnNumber, double price){
            this.title = title;
            this.author = author;
            this.publisher = publisher;
            this.date = date;
            this.isbnNumber = isbnNumber;
            this.price = price;
        }
    }

    public static class Library{
        public String name;
        public List<Book> books;

        Library(){
            this.books = new ArrayList<Book>();
        }

    }

    public static void main(String[] args) {

        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            Book book = new Book(input[0], input[1], input[2], input[3], input[4], Double.parseDouble(input[5]));
            library.books.add(book);
        }

        TreeMap<String, LocalDate> booksMap = new TreeMap<>();
        String[] dateAfter = scanner.nextLine().split("\\.");
        for (Book book : library.books) {
            final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate date = LocalDate.parse(book.date, DATE_FORMAT);
            LocalDate afterDate = LocalDate.of(Integer.parseInt(dateAfter[2]), Integer.parseInt(dateAfter[1]), Integer.parseInt(dateAfter[0]));
            if(date.isAfter(afterDate)) {
                if(booksMap.containsKey(book.title)){
                    booksMap.replace(book.title, date);
                }
                else{

                }
                    booksMap.put(book.title, date);
                }
            }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        booksMap.entrySet().stream().sorted((a1, a2) -> a1.getValue().compareTo(a2.getValue())).forEach(a-> System.out.printf("%s -> %02d.%02d.%d\n", a.getKey(), a.getValue().getDayOfMonth(), a.getValue().getMonthValue(), a.getValue().getYear()));

        }

}
