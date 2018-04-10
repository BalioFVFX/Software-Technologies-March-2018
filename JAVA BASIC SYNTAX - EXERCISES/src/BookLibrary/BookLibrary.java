package BookLibrary;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;



class BookLibrary {

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

        TreeMap<String, Double> booksMap = new TreeMap<>();

        for (Book book : library.books) {
            if(booksMap.containsKey(book.author)){
                booksMap.put(book.author, booksMap.get(book.author) + book.price);
            }
            else{
                booksMap.put(book.author, book.price);
            }
        }
        booksMap.entrySet().stream().sorted((a1, a2) -> Double.compare(a2.getValue(), a1.getValue())).forEach(a-> System.out.printf("%s -> %.2f\n",a.getKey(), a.getValue()));
    }
}
