public class AudioBook {
    Book book;
    double duration;
    final String narrator;

    public AudioBook(String title, String author, double duration, String narrator) {
        this.book = new Book(title, author);
        this.duration = duration;
        this.narrator = narrator;
    }

    void play() {
        System.out.println("Playing audiobook narrated by: " + this.narrator);
    }

    void displayDetails() {
        System.out.println(book.getAuthor() + ": " + book.getTitle() + "-" + duration + "red by - " + narrator);
    }

    public AudioBook clone() {
        return this;
    }
}
