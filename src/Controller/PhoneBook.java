package Controller;
import Models.*;

import java.util.ArrayList;
import java.util.Scanner;
public class PhoneBook {
    Scanner console = new Scanner(System.in);
    protected ArrayList<Contact_Phone> Contacts = new ArrayList<Contact_Phone>();

    public void AddContact(){
        FIO fio = new FIO();
        System.out.println("Enter First Name:");
        fio.setFirst_Name(console.nextLine());
        System.out.println("Enter Last Name:");
        fio.setLast_Name(console.nextLine());
        System.out.println("Enter Surname:");
        fio.setSurname(console.nextLine());

        Phone_Number phoneNumber = new Phone_Number();
        System.out.println("Enter phone number:");
        phoneNumber.setNumber(console.nextLine());

        Category category = ChoiseCategory();

        Contact_Phone contact_phone = new Contact_Phone();
        contact_phone.setFio(fio);
        contact_phone.setPhoneNumber(phoneNumber);
        contact_phone.setCategory(category);
        Contacts.add(contact_phone);
    }

    private Category ChoiseCategory(){
        System.out.println("Enter num category:");
        System.out.println("1 - Parents, 2 - Work, 3 - Other");
        int choice = console.nextInt();
        if(choice == 1){
            return new Parents_Category();
        }
        else if(choice == 2) {
            return new Work_Category();
        }
        else {
            return new Other_Category ();
        }

    }
    public void ShowContacts(){
        if(Contacts.size() == 0){
            System.out.println("Contact list empty!");
        }
        for (var contact: Contacts) {
            System.out.println(contact);
        }
    }
    public void Remove(){
        System.out.println("Enter number phone:");
        String phone_number = console.nextLine();
        Contact_Phone contact = Find(phone_number);
        if(contact == null) System.out.println("Contact not found");
        else {
            Contacts.remove(contact);
            System.out.println("Contact delete");
        }
    }

    private Contact_Phone Find(String phone_number){
        for (var contact: Contacts) {
            if(contact.getPhoneNumber().getNumber().equals(phone_number)) return contact;
        }
        return null;
    }

}
