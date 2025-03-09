public class Library {
    Object[] books;
    private int count;

    void addBook(Object book) {

    }

    public void displayLibrary() {
        for (int i = 0; i < count; i++) {
            if (books[i] instanceof Book) {
                ((Book) books[i]).displayDetails();
            } else if (books[i] instanceof DigitalBook) {
                ((DigitalBook) books[i]).displayDetails();
            } else if (books[i] instanceof AudioBook) {
                ((AudioBook) books[i]).displayDetails();
            }
            System.out.println("-------------------");
        }
    }

    public void findBookByTitle(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i] instanceof Book && ((Book) books[i]).getTitle().equals(title)) {
                ((Book) books[i]).displayDetails();
                return;
            } else if (books[i] instanceof DigitalBook && ((DigitalBook) books[i]).book.getTitle().equals(title)) {
                ((DigitalBook) books[i]).displayDetails();
                return;
            } else if (books[i] instanceof AudioBook && ((AudioBook) books[i]).book.getTitle().equals(title)) {
                ((AudioBook) books[i]).displayDetails();
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }
}
