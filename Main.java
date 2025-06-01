public class Main {
    public static void main(String[] args) {
        Library library = new Library("City Library");

        Librarian librarian = new Librarian("Mr. Smith", new Account("librarian", "admin123"));
        Member member = new Member("John Doe", new Account("john", "1234"));

        Book book1 = new Book("1984", "George Orwell", "ISBN001");
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", "ISBN002");

        librarian.addBook(library, book1);
        librarian.addBook(library, book2);

        Book borrowedBook = library.findBookByISBN("ISBN001");
        member.borrowBook(borrowedBook);

        member.returnBook(borrowedBook);
    }
}
