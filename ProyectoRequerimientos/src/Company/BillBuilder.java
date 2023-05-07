/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Company;

/**
 *
 * @author suare
 */
public abstract class BillBuilder {
    private Bill bill;

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill myBill) {
        bill = myBill;
    }
    
    public void buildBill(){};
    public void buildDate(){};
    public void buildClient(){};
    public void buildSale(){};
}
