/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectorequerimientos;

import Company.*;
import DataBase.ReadWriteObject;
import DesignWindows.Login;
import Product.Reference;
import User.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

/**
 *
 * @author suare
 */
public class ProyectoRequerimientos{

    /**
     * @param args the command line arguments
     */
    private static Client[] client;
    private static Admin[] admin;
    private static Employee[] employee;
    private static Company company;
    
    private static File bin=new File("Bin");
    private static File clientBin=new File("Bin","Client.bin");    
    private static File adminBin=new File("Bin","Admin.bin");
    private static File employeeBin=new File("Bin","Employee.bin");
    private static File companyBin=new File("Bin","Company.bin");
    
    private static ReadWriteObject rwo=new ReadWriteObject(); 
    
    
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        
        int length=50;
        admin=new Admin[length];
        client=new Client[length];
        employee=new Employee[length];        
        bin.mkdir(); 
        
        if(clientBin.createNewFile()) {
            rwo.write(clientBin,false,client);
        }        
        else {
            client=(Client[])rwo.read(clientBin, client);
        }
        
        if(adminBin.createNewFile()) {
            rwo.write(adminBin,false,admin);
        }        
        else {
            admin=(Admin[])rwo.read(adminBin, admin);
        }
        
        if(employeeBin.createNewFile()) {
            rwo.write(employeeBin,false,employee);
        }        
        else {
            employee=(Employee[])rwo.read(employeeBin, employee);
        }
        
        if(companyBin.createNewFile()) {
            rwo.write(companyBin,false,company);
        }        
        else {
            company=(Company)rwo.read(companyBin, company);
        }       
        
        //---------Datos Por defecto--------
        /*admin[0] = new Admin(0000, "admin", "admin", 0, 0000, "Dr.Juanito el frijol", "1049636949");
        Company company1 = new Company("Sianurito Feliz.inc", 666);
        company1.addHeadquarters(new Headquarter("Andromeda", "0000"));
        company1.addHeadquarters(new Headquarter("Galtrofia", "0001"));
        company1.addHeadquarters(new Headquarter("Usta Senturion", "0003"));
        company1.getHeadquartersList().get(0).getStock().addPoduct(new Reference("Gy756", 35434,3, "Nokia", 0000, "Movil", 300, 0001,false));
        company1.getHeadquartersList().get(1).getStock().addPoduct(new Reference("Gy756", 35434,3, "Nokia", 0000, "Movil", 300, 0001,false));
        company1.getHeadquartersList().get(2).getStock().addPoduct(new Reference("Gy756", 35434,3, "Nokia", 0000, "Movil", 300, 0001,false));
        admin[0].setCompany(company1);
        employee[0] = new Employee(0000, "Pepe", "Pepe", 1, 0001, "Pepito", "1048394569");
        employee[1] = new Employee(0001, "Maria", "Maria", 1, 0002, "Marianita", "1023849567");
        employee[2] = new Employee(0002, "Ivan", "Ivan", 1, 0003, "Ivancho", "1023849546");        
        rwo.write(companyBin,false,company1);
        rwo.write(adminBin,false,admin);
        rwo.write(employeeBin,false,employee);*/
        Login login = new Login(client,admin,employee,company);
        
    }
    
}
