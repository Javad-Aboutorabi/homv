package com.company;

public class contact {
    private String name;
    private String family;
    private int mobilenumber;
    private int homenumber;
    private String email;
    private String address;
    private String relationship;


    public contact(String name, String family, int mobilenumber, int homenumber, String email, String address, String relationship) {
        this.name = name;
        this.family = family;
        this.mobilenumber = mobilenumber;
        this.homenumber = homenumber;
        this.email = email;
        this.address = address;
        this.relationship = relationship;
    }

        public String getName(){return name ;}
        public String getFamily(){return family ;}
        public int getMobilenumber(){return mobilenumber ;}
        public int getHomenumber(){return homenumber ;}
        public String getEmail(){ return email ;}
        public String getAddress(){ return address ;}
        public String getRelationship(){return relationship ;}

}