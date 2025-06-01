public class Member extends User {
    public Member(String name, Account account) {
        super(name, account);
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.issue();
            System.out.println(name + " borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void returnBook(Book book) {
        book.returnBook();
        System.out.println(name + " returned the book: " + book.getTitle());
    }
}

