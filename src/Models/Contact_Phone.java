package Models;

public class Contact_Phone {
    protected FIO fio;
    protected Phone_Number phoneNumber;
    protected Category category;

    public Models.FIO getFio() {
        return fio;
    }

    public  Models.Category getCategory() {
        return category;
    }

    public Models.Phone_Number getPhoneNumber() {
        return phoneNumber;
    }

    public void setCategory(Models.Category category) {
        this.category = category;
    }

    public void setFio(Models.FIO fio) {
        this.fio = fio;
    }

    public void setPhoneNumber(Models.Phone_Number phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "FIO: " + fio.getFirst_Name() + " " + fio.getLast_Name() + " " + fio.getSurname() + " Phone: " + phoneNumber.getNumber()  + " Category: " + category.getName_Category();
    }
}
