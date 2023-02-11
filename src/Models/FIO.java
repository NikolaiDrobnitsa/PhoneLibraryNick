package Models;

public class FIO {
    protected String First_Name;
    protected String Last_Name;
    protected String Surname;

    public String getFirst_Name() {
        return First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }
}
