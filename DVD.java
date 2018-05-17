public class DVD extends Item {

    public DVD(String title, int isbn) {
        this.title = title;
        this.isbn = isbn;
        this.checkedOut = false;
        this.onHold = false;
        this.dueDate = createDueDate();
    }
    
    @Override
    public int createDueDate() {
        //DVD's can be taken out for 5 days
        return 5;
    }
}
