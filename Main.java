import java.sql.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Patron[] patrons = new Patron[4];

        BigMoney jessica = new BigMoney("Jessica Jones");
        patrons[0] = jessica;
        jessica.setEmail("jessica@AliasPI.com");
        jessica.setDonationAmount(200000);
        jessica.setAge(30);
        jessica.setLibraryNumber(100000001);
        jessica.setRenew(100);
        System.out.println(jessica.patronInfo());

        FriendOfTheLibrary daffy = new FriendOfTheLibrary("Daffy Duck");
        patrons[1] = daffy;
        daffy.setLibraryNumber(123456789);
        System.out.println("Daffy's Library number is: " + daffy.getLibraryNumber());

        RegularCustomer john = new RegularCustomer("John Smith");
        patrons[2] = john;
        john.setEmail("johnsmith@gmail.com");
        john.setLibraryNumber(123456789);
        System.out.println("John Smith's email is: " + john.getEmail());

        RegularCustomer jane = new RegularCustomer("Jane Doe");
        patrons[3] = jane;
        jane.setEmail("janedoe@gmail.com");
        jane.setDonationAmount(500);
        jane.setLibraryNumber(100000000);

        Book HP1 = new Book("J.K. Rowling", "Harry Potter and the Philosopher's Stone");
        HP1.setCopyAmount(4);
        HP1.setISBN(0747532745);
        HP1.setLibraryRecordNumber(200000000);
        System.out.println("Harry Potter and the Philosopher's Stone was written by: " + HP1.getAuthor());
        System.out.println("The library has " + HP1.getCopyAmount() + " copies of Harry Potter ad the Philosopher's Stone");

        Book HP2 = new Book("J.K. Rowling", "Harry Potter and the Chamber of Secrets");
        Book HP3 = new Book("J.K. Rowling", "Harry Potter and the Prisoner of Azkaban");
        Book HP4 = new Book("J.K. Rowling", "Harry Potter and the Goblet of Fire");

        DVD JJ = new DVD("Jessica Jones");
        JJ.setLibraryRecordNumber(200000001);
        DVD avengers = new DVD("Avengers: Infinity Wars");
        Tape x = new Tape("ABC");

        for (Patron p: patrons) {
            System.out.println(p.patronInfo());
        }


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
