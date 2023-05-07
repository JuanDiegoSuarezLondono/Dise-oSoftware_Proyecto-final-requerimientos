/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import Company.Company;

/**
 *
 * @author suare
 */
public class Admin extends User{
    private int idAdmin;
    private Company company;

    public Admin(int myIdAdmin, String myNick, String myPassword, int myStatus,int myId, String myName, String myDocument) {
        idAdmin = myIdAdmin;
        nick = myNick;
        password = myPassword;
        status = myStatus;
        id = myId;
        name = myName;
        document = myDocument;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int myIdAdmin) {
        idAdmin = myIdAdmin;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company myCompany) {
        company = myCompany;
    }
    
    
    
    public String getNick() {
        return nick;
    }

    public void setNick(String myNick) {
        nick = myNick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String myPassword) {
        password = myPassword;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int myStatus) {
        status = myStatus;
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
