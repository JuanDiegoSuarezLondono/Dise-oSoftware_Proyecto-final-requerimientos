/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import Company.Bill;

/**
 *
 * @author suare
 */
public class Employee extends User{
    
    private int idEmployee;
    private Bill bill;

    public Employee(int myIdEmployee, String myNick, String myPassword, int myStatus,int myId, String myName, String myDocument) {
        idEmployee = myIdEmployee;
        nick = myNick;
        password = myPassword;
        status = myStatus;
        id = myId;
        name = myName;
        document = myDocument;        
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int myIdEmployee) {
        idEmployee = myIdEmployee;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill myBill) {
        bill = myBill;
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
