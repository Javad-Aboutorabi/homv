package com.company;

import javax.xml.namespace.QName;
import java.util.ArrayList;

public class contact2 {
    public static void main(String[] args) {
        ArrayList<contact> contacts = new ArrayList<>() ;
       contact hossein = new contact("hossein","movaghari",2020,170000000,"hm@gmail.com","gorgan molaghati","single") ;
       contact reza =new contact("reza","siahbalei",2345,171171717,"rs@gmail.com","gorgan ojaben     ","in rel");
       contact mamad = new contact("mamad","zakeri     ",1475,17465446,"mz@gmail.com","gorgan sayyad","    married");
       contacts.add(hossein);
       contacts.add(reza);
       contacts.add(mamad);
        System.out.println("name:"+"\t \t"+"family:"+"\t\t"+"mobile number:"+"\t"+"home number:"+"\t \t"+"email:"+"\t \t "+"   address:"+"\t \t"+"        relationship:" ) ;
        for(int i=0 ; i<contacts.size() ; i++ ){
            System.out.println(contacts.get(i).getName()+"\t \t"+ contacts.get(i).getFamily()+"\t \t"+ contacts.get(i).getMobilenumber()+"\t \t"+ contacts.get(i).getHomenumber()+"\t \t "+ contacts.get(i).getEmail()+"\t \t"+ contacts.get(i).getAddress()+"\t \t"+contacts.get(i).getRelationship()+"\t \t") ;
        }
    }
}
