package sample;


import java.sql.*;

class UserInfo {
    String login;
    String password;
    String address;
    String birthday;
    String gender;
    String email;

    public UserInfo(String login, String password, String address, String birthday,String gender, String email) {
        this.login = login;
        this.password = password;
        this.address = address;
        this.birthday = birthday;
        this.gender = gender;
        this.email = email;
    }

    private UserInfo() {}

    public void loadCustomer(int id) {
        try {

            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:/avita/IdeaProjects/LibraryApplication/library.sqlite");
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT name, loginID, email From Patrons Where loginID =" + id);

            if (rs.next()) { // there was a result
                String name = rs.getString("name");
                email = rs.getString("email");
                //SSN = rs.getString("SSN");
                int loginID = id;

            }
        }
        catch (SQLException a) {
            System.out.println(a);
        }
    }    }

    public static class UserBuilder {
        UserInfo newUser = new UserInfo();


        public UserBuilder login (String login) {
            newUser.login = login;
            return this;
        }

        public UserInfo build() {
            return newUser;
        }

        public UserBuilder address(String address) {
            newUser.address = address;
            return this;
        }

        public UserBuilder email(String email) {
            newUser.email = email;
            return this;
        }

        public UserBuilder gender(String gender) {
            newUser.gender = gender;
            return this;
        }


        public UserBuilder password(String pw1) {
            newUser.password = pw1;
            return this;
        }
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public boolean isOK(String text) {
        if(password.equals(text))
            return true;
        return false;
    }
}