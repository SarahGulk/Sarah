public class Book extends Item {
    int copyAmount;
    String author, title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
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
