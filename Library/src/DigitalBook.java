public class DigitalBook {
    private Book book;
    private String fileFormat;

    // Konstruktor
    public DigitalBook(String title, String author, String fileFormat) {
        this.book = new Book(title, author);
        this.fileFormat = fileFormat;
    }

    void displayDetails() {
        System.out.println(book.getAuthor() + ": " + book.getTitle() + "." + fileFormat);
    }
}
