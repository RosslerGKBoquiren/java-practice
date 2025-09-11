package review;

public class Library {

    private String[] books;

    public void setBooks(String[] books){
        this.books = books;
    }

    public int countBooks(){
        if(this.books == null){
            return 0;
        }
        return this.books.length;
    }

    public boolean searchBook(String bookTitle){

        if(this.books == null){
            return false;
        }
        for(int i=0; i<books.length; i++){
            if(books[i].equalsIgnoreCase(bookTitle)){
                return true;
            }
        }
        return false;
    }

}
