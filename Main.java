import java.sql.*;

public class Main {

    public static void main(String[] args) {
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