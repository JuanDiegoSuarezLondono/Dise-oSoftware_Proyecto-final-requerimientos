/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import java.io.Serializable;

/**
 *
 * @author suare
 */
public class Reference extends Brand implements Serializable{
    
    private String nameReference;
    private int idReference;
    private ReferenceState state;
    private int amount;

    public Reference(String myNameReference, int myIdReference, int myAmount,String myBrandName, int myIdBrand,String myProductName, int myPrice, int myIdProduct, boolean myIsTechnical) {
        nameReference = myNameReference;
        idReference = myIdReference;
        state = new Aviable();
        amount = myAmount;
        brandName = myBrandName;
        idBrand = myIdBrand;
        productName = myProductName;
        price = myPrice;
        idProduct = myIdProduct;
        isTechnical = myIsTechnical;
    }

    public String getNameReference() {
        return nameReference;
    }

    public void setNameReference(String myNameReference) {
        nameReference = myNameReference;
    }

    public int getIdReference() {
        return idReference;
    }

    public void setIdReference(int myIdReference) {
        idReference = myIdReference;
    }

    public ReferenceState getState() {
        return state;
    }

    public void setState(ReferenceState myState) {
        state = myState;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int myAmount) {
        amount = myAmount;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String myBrandName) {
        brandName = myBrandName;
    }

    public int getIdBrand() {
        return idBrand;
    }

    public void setIdBrand(int myIdBrand) {
        idBrand = myIdBrand;
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
        price = price;
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
