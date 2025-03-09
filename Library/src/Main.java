public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Dodawanie różnych książek
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien"));
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));

        library.addBook(new DigitalBook("Digital Fortress", "Dan Brown", "PDF"));
        library.addBook(new DigitalBook("The Martian", "Andy Weir", "EPUB"));
        library.addBook(new DigitalBook("Ready Player One", "Ernest Cline", "MOBI"));

        library.addBook(new AudioBook("Harry Potter", "J.K. Rowling", 10.5, "Stephen Fry"));
        library.addBook(new AudioBook("The Great Gatsby", "F. Scott Fitzgerald", 5.2, "Jake Gyllenhaal"));
        library.addBook(new AudioBook("Moby Dick", "Herman Melville", 24.0, "Richard Basehart"));

        // Wyświetlenie biblioteki
        System.out.println("Library contents:");
        library.displayLibrary();

        // Wyszukiwanie książek
        System.out.println("\nSearching for 'The Hobbit':");
        library.findBookByTitle("The Hobbit");

        System.out.println("\nSearching for 'Unknown Book':");
        library.findBookByTitle("Unknown Book");
    }
}