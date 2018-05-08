public abstract class Patron implements Library {
    String name;
    String email;
    int age;
    int libraryNumber;
    int donationAmount;
    int renew;

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLibraryNumber(int libraryNumber) {
        this.libraryNumber = libraryNumber;
    }

    public void setDonationAmount(int donationAmount) {
        this.donationAmount = donationAmount;
    }

    public void setRenew(int renew) {
        this.renew = renew;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public int getLibraryNumber() {
        return libraryNumber;
    }

    public int getDonationAmount() {
        return donationAmount;
    }

    public int getRenew() {
        return renew;
    }





}
