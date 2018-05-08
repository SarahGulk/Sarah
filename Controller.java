package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.util.ArrayList;

public class Controller {
    public Button PatrenB;
    public Button NewPatrenB;
    public Button enterButton;
    public Button PatronGoButton;
    public TextField CurrentPatronID;
    public Button NewPatronNext;
    public ChoiceBox MaleFemale;
    public TextArea BirthdayBox;
    public TextArea AddressBox;
    public TextArea NameBox;
    public Button NextPW;
    public PasswordField VerifyPW;
    public PasswordField CreatePW;
    public PasswordField PatronPW;
    public Button Search;
    public Button HomeScreen;
    public TextField EmailNew;

    frmCurrentPatronView view = new frmCurrentPatronView();
    public void PatrenButton(ActionEvent actionEvent) {
        Main.getInstance().loadPatronScreen();
    }

    public void NewPatrenButton(ActionEvent actionEvent) {
        Main.getInstance().loadNewPatronScreen();
    }

    public void GreetingbuttonPress(ActionEvent actionEvent) {
        Main.getInstance().loadLoadCustomer();
    }

    public void PatronGo(ActionEvent actionEvent) {
        LoginInfo li = view.getUserNameAndPassword();
        if (li.isOK())
            Main.getInstance().loadGreetingsScreen();

    }

    class UserTable {
        ArrayList<LoginInfo> lia = new ArrayList<>();

        public UserTable() {
            lia = new ArrayList<>();
            lia.add(new LoginInfo("Jessica", "alias"));
            lia.add(new LoginInfo("Daffy", "quack"));
        }

        String getPassword(String login) {
            for (LoginInfo loginInfo : lia)
                if (loginInfo.getLogin().equals(login))
                    return loginInfo.getPassword();
            return "";
        }

    }

    class LoginInfo {
        String login, password;

        public LoginInfo(String login, String password) {
            this.login = login;
            this.password = password;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public boolean isOK() {
            UserTable t = new UserTable();
            if(password.equals(t.getPassword(login)))
                return true;
            return false;
        }
    }

    class frmCurrentPatronView {
        LoginInfo getUserNameAndPassword() {
            LoginInfo li = new LoginInfo(CurrentPatronID.getText(), PatronPW.getText());
            return li;
        }
    }

    public void CurrentIDBox(ActionEvent actionEvent) {
    }

    public void PatronNextNew(ActionEvent actionEvent) {
        Main.getInstance().loadNewPasswordScreen();
    }

    public void CreatePassword(ActionEvent actionEvent) {
    }

    public void VerifyPassWord(ActionEvent actionEvent) {
    }

    public void PatronPassword(ActionEvent actionEvent) {
    }

    public void HomeScreenButton(ActionEvent actionEvent) {
        Main.getInstance().loadHomeScreen();
    }

    public void PWNext(ActionEvent actionEvent) {
        Main.getInstance().loadPatronScreen();
    }

    public void EmailNewP(ActionEvent actionEvent) {
    }
}
