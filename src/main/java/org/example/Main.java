package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        PhoneBook myPhoneBook = new PhoneBook();

        Contact contact1 = new Contact("John Smith", "123-123");
        Contact contact2 = new Contact("John ASd", "123-123");
        Contact contact3 = new Contact("Maria Smith", "123-125");

        myPhoneBook.addContact(contact1);
        myPhoneBook.addContact(contact2);
        myPhoneBook.addContact(contact3);

        ArrayList<Contact> allContact = myPhoneBook.getAllContact();
        for (Contact contact : allContact) {
            System.out.println(contact.getName() + " " + contact.getPhoneNumber());
        }

        ArrayList<Contact> foundContacts = myPhoneBook.find("M");

        for (Contact foundContact : foundContacts) {
            System.out.println("Found contact: " +  foundContact.getName() + " " + foundContact.getPhoneNumber());
        }



    }
}