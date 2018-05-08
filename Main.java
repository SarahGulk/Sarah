package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    public static Main getInstance() {
        return uniqueInstance;
    }

    static Main uniqueInstance;
    Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        uniqueInstance = this;
        this.primaryStage = primaryStage;
        loadGreetScreen();
    }

    public void loadGreetScreen()  {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("frmGreeting.fxml"));
            primaryStage.setTitle("OOPS Library Application");
            primaryStage.setScene(new Scene(root, 700, 500));
            primaryStage.show();
        }
        catch (Exception e) {}

    }

    public void loadLoadCustomer()  {
        try {

            Parent root = FXMLLoader.load(getClass().getResource("frmLoadCustomer.fxml"));
            primaryStage.setTitle("OOPS Library Application - Load Customer");
            primaryStage.setScene(new Scene(root, 700, 500));
            primaryStage.show();
        }
        catch (Exception e) {}

    }

    public void loadPatronScreen()  {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("frmCurrentPatron.fxml"));
            primaryStage.setTitle("Current Patron - Enter ID");
            primaryStage.setScene(new Scene(root, 700, 500));
            primaryStage.show();
        }
        catch (Exception e) {}

    }

    public void loadNewPatronScreen()  {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("frmNewPatron.fxml"));
            primaryStage.setTitle("New Patron Information");
            primaryStage.setScene(new Scene(root, 700, 560));
            primaryStage.show();
        }
        catch (Exception e) {}

    }

    public void loadNewPasswordScreen()  {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("NewPatUsername.fxml"));
            primaryStage.setTitle("Create a Password");
            primaryStage.setScene(new Scene(root, 700, 500));
            primaryStage.show();
        }
        catch (Exception e) {}

    }

    public void loadGreetingsScreen()  {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("frmGreetingPage.fxml"));
            primaryStage.setTitle("Welcome!");
            primaryStage.setScene(new Scene(root, 700, 500));
            primaryStage.show();
        }
        catch (Exception e) {}

    }

    public void loadHomeScreen()  {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("frmHomeScreen.fxml"));
            primaryStage.setTitle("Welcome Patron!");
            primaryStage.setScene(new Scene(root, 700, 500));
            primaryStage.show();
        }
        catch (Exception e) {}

    }

    public static void main(String[] args) {
        launch(args);
    }
}