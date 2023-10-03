import java.util.Arrays;
class Bookshelf {
    private Book[] books;
    private int numBooks;

    public Bookshelf(int capacity) {
        books = new Book[capacity];
        numBooks = 0;
    }

    public void addBook(Book book) {
        if (numBooks < books.length) {
            books[numBooks] = book;
            numBooks++;
        } else {
            System.out.println("Книжная полка заполнена.");
        }
    }

    public Book getLatestBook() {
        if (numBooks == 0) {
            return null;
        }

        Book latestBook = books[0];
        for (int i = 1; i < numBooks; i++) {
            if (books[i].getYear() > latestBook.getYear()) {
                latestBook = books[i];
            }
        }
        return latestBook;
    }

    public Book getEarliestBook() {
        if (numBooks == 0) {
            return null;
        }

        Book earliestBook = books[0];
        for (int i = 1; i < numBooks; i++) {
            if (books[i].getYear() < earliestBook.getYear()) {
                earliestBook = books[i];
            }
        }
        return earliestBook;
    }
    public void sortBooksByYear() {
        Arrays.sort(books, 0, numBooks, (book1, book2) -> Integer.compare(book1.getYear(), book2.getYear()));
    }

    public void displayBooks() {
        for (int i = 0; i < numBooks; i++) {
            System.out.println(books[i].to_String());
        }
    }
}