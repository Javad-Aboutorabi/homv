package com.company;

import java.util.ArrayList;

public class contact2 {
    public static void main(String[] args) {
        ArrayList<Contact> Contacts = new ArrayList<>();
        ArrayList<String> homeNumbers = new ArrayList<>();

        homeNumbers.add("01755889919");
        homeNumbers.add("02155902788");
        homeNumbers.add("01712234133");
        homeNumbers.add("01712221945");

        Contact hossein = new Contact("hossein", "movaghari","911111111", homeNumbers,
                "hm@gmail.com", "gorgan molaghati", "single",true);

        homeNumbers = new ArrayList<>();
        homeNumbers.add("01713131313");
        homeNumbers.add("0147852369");
        homeNumbers.add("664545455");
        homeNumbers.add("6589213255");

        Contact reza = new Contact("reza", "siahbalei","911222222", homeNumbers,
                "rs@gmail.com", "gorgan ojaben     ", "in rel",false);
        homeNumbers = new ArrayList<>();
        homeNumbers.add("65452121");
        homeNumbers.add("54541445");
        homeNumbers.add("544444545");
        homeNumbers.add("0009213255");

        Contact mamad = new Contact("mamad", "zakeri","911333333", homeNumbers, "mz@gmail.com",
                "gorgan sayyad", "    married",true);

//        hossein.addIrCodeHossein();
//        reza.addIrCodeHossein();
//        mamad.addIrCodeHossein();


        Contacts.add(hossein);
        Contacts.add(reza);
        Contacts.add(mamad);
        System.out.println("name:" + "\t \t" + "family:" + "\t\t " + "mobile number:" + "\t \t" + "home number:" + "\t \t" + "email:" + "\t \t " + "   address:" + "\t \t" + "        relationship:");
        for (int i = 0; i < Contacts.size(); i++) {
            System.out.println(Contacts.get(i).getName() + "\t \t" + Contacts.get(i).getFamily() + "\t \t" + Contacts.get(i).getMobileNumber() + "\t \t" + Contacts.get(i).getHomeNumber() + "\t \t " + Contacts.get(i).getEmail() + "\t \t" + Contacts.get(i).getAddress() + "\t \t" + Contacts.get(i).getRelationship() + "\t \t");
        }
    }
}
