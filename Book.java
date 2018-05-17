public class Book extends Item {
    int copyAmount;
    String author, title;

    public Book(String author, String title, int isbn) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.checkedOut = false;
        this.onHold = false;
        this.dueDate = createDueDate();
    }
    
    @Override 
    public int createDueDate() {
        //books can be taken out for two weeks at a time
        return 14;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setCopyAmount(int amount) {
        this.copyAmount = amount;
    }

    public int getCopyAmount() {
        return copyAmount;
    }




}
