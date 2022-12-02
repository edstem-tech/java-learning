package com.edstem.session2.contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AddressBook {
    private final List<Contact> contacts;

    public AddressBook(List<Contact> contacts) {
        if (contacts == null) {
            this.contacts = new ArrayList<>();
        } else {
            this.contacts = contacts;
        }
    }

    public void addContact(Contact contact) {
        if (Objects.nonNull(contact) && !this.contacts.contains(contact)) {
            this.contacts.add(contact);
        }
    }

    public void removeContact(Contact contact) {
        if (Objects.nonNull(contact)) {
            this.contacts.remove(contact);
        }
    }

    public void sortContacts() {
        this.contacts.sort((final Contact a, final Contact b) -> a.getFirstName().compareTo(b.getFirstName()));
//        this.contacts.sort(Comparator.comparing(Contact::getFirstName));
    }

    public void printContacts() {
//        this.contacts.forEach(System.out::println);
        for (Contact contact : this.contacts) {
            System.out.println(contact);
        }
    }

}
