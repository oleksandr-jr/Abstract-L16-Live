package org.example;

import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact){
        contacts.add(contact);
    }

    public void removeContact(Contact contact){
        contacts.remove(contact);
    }

    public ArrayList<Contact> getAllContact(){
        return contacts;
    }

    public ArrayList<Contact> find(String searchValue){
        ArrayList<Contact> resultList = new ArrayList<>();

        for (Contact contact : contacts) {
            if (contact.getName().contains(searchValue) || contact.getPhoneNumber().equals(searchValue)){
                resultList.add(contact);
            }
        }

        return resultList;
    }
}
