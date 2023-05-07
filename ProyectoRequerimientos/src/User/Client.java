/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author suare
 */
public class Client extends Person{
    
    private String addres;
    private int tephone;

    public Client(String myAddres, int myTephone, int myId, String myName, String myDocument) {
        addres = myAddres;
        tephone = myTephone;
        id = myId;
        name = myName;
        document = myDocument;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String myAddres) {
        addres = myAddres;
    }

    public int getTephone() {
        return tephone;
    }

    public void setTephone(int myTephone) {
        tephone = myTephone;
    }

    public int getId() {
        return id;
    }

    public void setId(int myId) {
        id = myId;
    }

    public String getName() {
        return name;
    }

    public void setName(String myName) {
        name = myName;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String myDocument) {
        document = myDocument;
    }    
    
}
