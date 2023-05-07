/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Company;

import java.io.Serializable;
import static java.util.Collections.list;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author suare
 */
public class Company implements Serializable{
    private String name;
    private int idCompany;
    private List<Headquarter> headquartersList;

    public Company(String myName, int myIdCompany) {
        name = myName;
        idCompany = myIdCompany;
        headquartersList = new LinkedList<Headquarter>();
    } 

    public String getName() {
        return name;
    }

    public void setName(String myName) {
        name = myName;
    }

    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int myIdCompany) {
        idCompany = myIdCompany;
    }

    public List<Headquarter> getHeadquartersList() {
        return headquartersList;
    }

    public void setHeadquartersList(List<Headquarter> myHeadquartersList) {
        headquartersList = myHeadquartersList;
    }
    
    public void addHeadquarters(Headquarter myHeadquarter) {
        headquartersList.add(myHeadquarter);
    }
    
    public void editHeadquarters(Headquarter myOldHeadquarter,Headquarter myHeadquarter) {
        headquartersList.set(headquartersList.indexOf(myOldHeadquarter), myHeadquarter);
    }
    
    public void deleteHeadquarters(Headquarter myHeadquarter) {
        headquartersList.remove(myHeadquarter);
    }
    
    public String[] listHeadquarters() {
        if(!headquartersList.isEmpty()) {
            String[] list = new String[headquartersList.size()];
            for(int i=0 ; i<list.length;i++) {
                list[i] = headquartersList.get(i).getSectorName();
            }
            return list;
        }
        else {
            return new String[]{""};
        }
    }
    
}
