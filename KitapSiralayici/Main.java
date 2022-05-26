import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args){

        Book book1 = new Book("Suç ve Ceza",500,"Dostoevsky");
        Book book2 = new Book("Alacakaranlık", 400, "Stephenie Meyer");
        Book book3 = new Book("Şu Çılgın Türkler", 1212, "Turgut Özakman");
        Book book4 = new Book("Dokuzuncu Hariciye Koğuiu", 200, "Peyami Safa");
        Book book5 = new Book("Elveda Gülsarı", 140, "Cengiz Aytmatov");

        TreeSet<Book> bookListTreeSet = new TreeSet<Book>();

        bookListTreeSet.add(book1);
        bookListTreeSet.add(book2);
        bookListTreeSet.add(book3);
        bookListTreeSet.add(book4);
        bookListTreeSet.add(book5);

        System.out.println("A-Z YE SIRALANIŞ ");
        for (Book book:bookListTreeSet) {
            System.out.printf("Kitap Ismi: %-25s Sayfa: %5d\n", book.getName(), book.getPageNumber());
        }

        System.out.println("----------------------");
        System.out.println("");
        System.out.println("SAYFA SAYISINA GÖRE SIRALANIŞ");

        TreeSet<Book> bookSetPageNum = new TreeSet<>(new Comparator<Book>() {

            @Override
            public int compare(Book b1, Book b2) {
                return b1.getPageNumber() - b2.getPageNumber();
            }
        }.reversed());

        bookSetPageNum.add(book1);
        bookSetPageNum.add(book2);
        bookSetPageNum.add(book3);
        bookSetPageNum.add(book4);
        bookSetPageNum.add(book5);

        for (Book book:bookSetPageNum) {
            System.out.printf("Kitap Ismi: %-25s Page: %5d\n", book.getName(), book.getPageNumber());
        }

    }

}
