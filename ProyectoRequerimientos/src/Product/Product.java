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
public abstract class Product implements Serializable{
    
    protected String productName;
    protected int price;
    protected int idProduct;
    protected boolean isTechnical;

    public abstract String getProductName();

    public abstract void setProductName(String myProductName);

    public abstract int getPrice();

    public abstract void setPrice(int price);

    public abstract int getIdProduct();

    public abstract void setIdProduct(int idProduct);
    
    public abstract boolean getIsTechnical();

    public abstract void setIsTechnical(boolean myIsTechnical);    
    
    
}
