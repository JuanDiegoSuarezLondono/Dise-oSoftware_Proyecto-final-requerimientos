/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Company;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author suare
 */
public class Report {
    private List<Bill> billList;

    public Report() {
        billList = new LinkedList<Bill>();
    }

    public List<Bill> getBillList() {
        return billList;
    }

    public void setBillList(List<Bill> myBillList) {
        billList = myBillList;
    }
    
    public void addBill(Bill myBill) {
        billList.add(myBill);
    }
    
    public void editBill(Bill myOldBill,Bill myBill) {
        billList.set(billList.indexOf(myOldBill), myBill);
    }
    
    public void deleteBill(Bill myBill) {
        billList.remove(myBill);
    }
    
    public void generateReport() {
        
    }
}
