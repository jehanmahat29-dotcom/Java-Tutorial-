class  Library{
    String[] books;
    int noOfBooks = 0;
     Library() {
        this.books = new String[100];
        this.noOfBooks = 0;
    }

    void addBook(String book) {
        this.books[noOfBooks] = book;
        noOfBooks++;
        System.out.println(book + " has been added");
    }

    void ShowAvailableBooks() {
        System.out.println("Available books are: ");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void issueBook(String book) {
        for(int i = 0; i < this.books.length; i++) {
            if(this.books[i].equals(book)) {
                System.out.println(book + " has been issued");
                this.books[i] = null;
                return;
            }
            System.out.println("* " + book);
        }
        System.out.println("The book is not available");
    }

    void returnBook(String book) {
        addBook(book);
    }
 }

public class Library1 {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook("Book 1");
        lib.addBook("Book 2");
        lib.addBook("Book 3");
        lib.ShowAvailableBooks();
        lib.issueBook("Book 1");
        lib.ShowAvailableBooks();
        lib.returnBook("Book 1");
        lib.ShowAvailableBooks();

    }
}
