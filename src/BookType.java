public enum BookType {
    Technical(0,"専門書"),
    Cook(1,"料理本"),
    Mystery(2,"ミステリー"),
    Sports(3,"スポーツ");

    private int bookTypeId;
    private String bookType;

    BookType(int bookTypeId,String bookType){
        this.bookTypeId = bookTypeId;
        this.bookType = bookType;
    }

   public int getBookTypeId(){
        return bookTypeId;
   }

   public String getBookType(){
        return  bookType;
   }
}
