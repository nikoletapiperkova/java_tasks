package beginner.one;

public class Book {
    private String title;
    private String author;
    private int  ISBN;
    private boolean isAvailable;

    public Book(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    public void borrowBook() {
        if(this.isAvailable) {
            isAvailable = false;
            System.out.println("Book has been borrowed.");
        }
        else{
            System.out.println("Book is not available at the moment.");
        }
    }
    public void returnBook(){
        if(!this.isAvailable) {
            isAvailable = true;
            System.out.println("Book has been returned.");
        }
        else{
            System.out.println("Book was not borrowed in the first place");
        }
    }
    public final String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public final int getISBN() {
        return ISBN;
    }
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    public final String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public final boolean isAvailable(){
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable){
        this.isAvailable = this.isAvailable;
    }
}
