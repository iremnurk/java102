public class Book implements Comparable<Book> {

    private final String name;
    private final int pageNumber;
    private final String writer;

    public Book(String name, int pageNumber, String writer) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.writer = writer;
    }
    public String getName() {
        return name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public String getWriter() {
        return writer;
    }


    @Override
    public int compareTo(Book o) {
        return (this.getName()).compareTo(o.getName());
    }
}
