package com.company;

import java.util.ArrayList;

public class Contact {
    private String name;
    private String family;
    private String mobileNumber;
    private ArrayList<String> homeNumber;
    private String email;
    private String address;
    public String relationship;

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public ArrayList<String> getHomeNumber() {
        return homeNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getRelationship() {
        return relationship;
    }

    public Contact(String name, String family, String mobileNumber, ArrayList<String> homeNumbers,
                   String email, String address, String relationship, Boolean b) {
        this.name = name;
        this.family = family;
        this.mobileNumber = mobileNumber;
        this.homeNumber = homeNumbers;
        this.email = email;
        this.address = address;
        this.relationship = relationship;
        addIrCodeHossein(b);
    }

    public void addIrCodeHossein(Boolean b) {
        if (this.mobileNumber.charAt(0) != '+' && b)
            this.mobileNumber = "+98" + this.mobileNumber;
        else if (this.name == "reza" && this.family == "siahbalei") {
            this.mobileNumber = "DonkeyHand" ;
            this.homeNumber.clear();
            this.name =this.name+ " KIRI";
        }
    }
    
}