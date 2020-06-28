public class Library {
    Book[] bookList = Book.values();
    private int bookTypeCount;

    public Library(int bookTypeCount) {
        this.bookTypeCount = bookTypeCount;
    }
}
