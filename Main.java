import java.sql.*;

public class Main {


    public static void main(String[] args) {

        BigMoney jessica = new BigMoney("Jessica Jones");
        jessica.setEmail("jessica@AliasPI.com");

        FriendOfTheLibrary daffy = new FriendOfTheLibrary("Daffy Duck");
        daffy.setLibraryNumber(123456789);

        Book HP1 = new Book("J.K. Rowling", "Harry Potter and the Philosopher's Stone");
        DVD JJ = new DVD("Jessica Jones");



        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:/josh/LibraryDatabase");
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * From Customers");

            while (rs.next()) {
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String phoneNumber = rs.getString("PhoneNumber");
                System.out.println(firstName + " " + lastName + ": " + phoneNumber);
            }
        } catch (SQLException s) {
            System.out.println("Error!" + s.getErrorCode());
        }
    }



}
