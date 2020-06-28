public class Main {
    public static void main(String[] args){
        Book[] bookList = Book.values();
        System.out.println("本のリスト");
        for(Book book:bookList){
            book.printBook();
        }
    }
}
