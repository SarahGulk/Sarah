public abstract class Item implements Library {
    String title;
    int ISBN;
    int libraryRecordNumber;
    boolean checkedOut;
    boolean onHold;
    int dueDate;
    
    public abstract int createDueDate();
    
    public void checkOut() {this.checkedOut = true;}
    
    public void hold() {this.onHold = true;}
    
    public void returnItem() {this.checkedOut = false;}
    
    public void takeOffHold() {this.onHold = false;}

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
