public enum Book {
    Book0(0,"アジャイル開発概論","西村直樹",BookType.Technical),
    Book1(1,"基本料理術","西村直樹",BookType.Cook),
    Book2(2,"インフェルノ","ダン・ブラウン",BookType.Mystery),
    Book3(3,"野球のススメ","藍染惣右介",BookType.Sports),
    Book4(4,"Java入門","市村正親",BookType.Technical),
    Book5(5,"リーダブルコード","角政則",BookType.Technical),
    Book6(6,"天皇の料理番","西村正親",BookType.Cook),
    Book7(7,"新約中華料理","西村直樹",BookType.Cook),
    Book8(8,"サッカー概論","ジョン・ジョーン",BookType.Sports),
    Book9(9,"卓球","門直美",BookType.Sports),
    Book10(10,"上級アジャイル開発","西村直樹",BookType.Technical);

    private int bookId;
    private String bookTitle;
    private String bookAuthor;
    private BookType bookType;

    Book(int bookId, String bookTitle, String bookAuthor, BookType bookType) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookType = bookType;
    }

    public void printBook(){
        System.out.print("No." + bookId + "　タイトル：" + bookTitle + "　著者：" + bookAuthor);
        System.out.println(" ジャンル：" + bookType.getBookTypeName());
    }

    //ゲッター（本の情報取得）
    public int getBookId() {
        return bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookType() {
        return bookType.getBookTypeName();
    }
}
