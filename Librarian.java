public class Librarian extends User {
    public Librarian(String name, Account account) {
        super(name, account);
    }

    public void addBook(Library library, Book book) {
        library.addBook(book);
        System.out.println("Librarian added book: " + book.getTitle());
    }

    public void removeBook(Library library, String isbn) {
        library.removeBook(isbn);
    }
}

