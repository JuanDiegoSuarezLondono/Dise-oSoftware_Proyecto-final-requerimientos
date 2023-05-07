/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Company;

import java.io.Serializable;

/**
 *
 * @author suare
 */
public class Headquarter implements Serializable{
    private String sectorName;
    private String idHeadquarters;
    private Stock stock;
    private Report report;

    public Headquarter(String mySectorName, String myIdHeadquarters) {
        sectorName = mySectorName;
        idHeadquarters = myIdHeadquarters;
        stock = new Stock();
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String mySectorName) {
        sectorName = mySectorName;
    }

    public String getIdHeadquarters() {
        return idHeadquarters;
    }

    public void setIdHeadquarters(String myIdHeadquarters) {
        idHeadquarters = myIdHeadquarters;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock myStock) {
        stock = myStock;
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report myReport) {
        report = myReport;
    }
    
}
