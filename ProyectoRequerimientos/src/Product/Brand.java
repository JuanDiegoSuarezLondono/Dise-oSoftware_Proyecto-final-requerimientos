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
public abstract class Brand extends Product{
    
    protected String brandName;
    protected int idBrand;

    public abstract String getBrandName();

    public abstract void setBrandName(String brandName);

    public abstract int getIdBrand();

    public abstract void setIdBrand(int idBrand);
   
}
