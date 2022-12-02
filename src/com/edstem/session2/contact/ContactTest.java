package com.edstem.session2.contact;

import java.util.ArrayList;

public class ContactTest {
    public static void main(String[] args) {
//        List<Contact> myInitialContacts = new ArrayList<>();
        Contact aravind = new Contact("Aravind", "Sankar", "aravind.sankar@edstem.com", "9961506821");
//        Contact aravind2 = new Contact("Aravind", "Sankar", "aravind.sankar@gmail.com", "99999999");
        Contact govind = new Contact("Govind", "Sankar", "govind.sankar@gmail.com", "995931433");
        Contact aneesha = new Contact("Aneesha", "Sankar", "aneesha.s@gmail.com", "9961506821");
        Contact daliya = new Contact("Daliya", "Chacko", "daliya.chacko@gmail.com", "9961506821");
        Contact anu = new Contact("Anu", "Thomas", "anu.thomas@gmail.com", "9961506821");

        AddressBook myAddressBook1 = new AddressBook(null);
        myAddressBook1.printContacts();

        AddressBook myAddressBook = new AddressBook(new ArrayList<>());

        myAddressBook.addContact(aravind);
        myAddressBook.addContact(govind);
        System.out.println("-----------------------------------");
        myAddressBook.printContacts();
        System.out.println("-----------------------------------");
        myAddressBook.removeContact(aravind);
        myAddressBook.printContacts();
        System.out.println("-----------------------------------");

        myAddressBook.addContact(aravind);
        myAddressBook.addContact(aneesha);
        myAddressBook.addContact(daliya);
        myAddressBook.addContact(anu);
        myAddressBook.printContacts();
        System.out.println("-----------------------------------");
        myAddressBook.sortContacts();
        myAddressBook.printContacts();
        System.out.println("-----------------------------------");
    }
}
