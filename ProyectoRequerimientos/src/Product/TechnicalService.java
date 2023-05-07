/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

/**
 *
 * @author suare
 */
public class TechnicalService extends Product{
    private String technicianName;
    private int tecnicPercentage;

    public TechnicalService(String myTechnicianName, int myTecnicPercentage, String myProductName, int myPrice, int myIdProduct,boolean myIsTechnical) {
        technicianName = myTechnicianName;
        tecnicPercentage = myTecnicPercentage;
        productName = myProductName;
        price = myPrice;
        idProduct = myIdProduct;
        isTechnical = myIsTechnical;
    }

    public String getTechnicianName() {
        return technicianName;
    }

    public void setTechnicianName(String myTechnicianName) {
        technicianName = myTechnicianName;
    }

    public int getTecnicPercentage() {
        return tecnicPercentage;
    }

    public void setTecnicPercentage(int myTecnicPercentage) {
        tecnicPercentage = myTecnicPercentage;
    }
    
    public String getProductName() {
        return productName;
    }

    public void setProductName(String myProductName) {
        productName = myProductName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int myPrice) {
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int myIdProduct) {
        idProduct = myIdProduct;
    }
    
    public boolean getIsTechnical() {
        return isTechnical;
    }

    public void setIsTechnical(boolean myIsTechnical) {
        isTechnical = myIsTechnical;
    } 
}
