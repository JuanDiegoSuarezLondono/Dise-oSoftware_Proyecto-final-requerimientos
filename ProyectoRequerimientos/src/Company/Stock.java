/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Company;

import Product.*;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author suare
 */
public class Stock implements Serializable{
    private List<Product> productList;

    public Stock() {
        productList = new LinkedList<Product>();
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> myProductList) {
        productList = myProductList;
    }
    
    public void addPoduct(Product myProduct) {
        productList.add(myProduct);
    }
    
    public void editProduct(Product myOldProduct,Product myProduct) {
        productList.set(productList.indexOf(myOldProduct), myProduct);
    }
    
    public void deleteProduct(Product myProduct) {
        productList.remove(myProduct);
    }
    
    public String[] listProduct() {
        if(!productList.isEmpty()) {
            String[] list = new String[productList.size()];
            for(int i=0 ; i<list.length;i++) {
                list[i] = productList.get(i).getProductName();
            }
            return list;
        }
        else {
            return new String[]{""};
        }
    }
}
