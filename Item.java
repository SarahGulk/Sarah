public abstract class Item implements Library {
    String title;
    int ISBN;
    int libraryRecordNumber;

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    public void setLibraryRecordNumber(int num) {
        this.libraryRecordNumber = num;
    }
    public String getTitle() {
        return title;
    }
    public int getISBN() {
        return ISBN;
    }
    public int getLibraryRecordNumber() {
        return libraryRecordNumber;
    }
}
