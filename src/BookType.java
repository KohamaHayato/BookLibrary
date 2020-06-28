//本のジャンル
public enum BookType {
    Technical(0,"専門書"),
    Cook(1,"料理本"),
    Mystery(2,"ミステリー"),
    Sports(3,"スポーツ");

    private int bookTypeId;
    private String bookTypeName;

    BookType(int bookTypeId,String bookTypeName){
        this.bookTypeId = bookTypeId;
        this.bookTypeName = bookTypeName;
    }

   //ゲッター（本のジャンル）
   public int getBookTypeId(){
        return bookTypeId;
   }

   public String getBookTypeName(){
        return  bookTypeName;
   }
}
