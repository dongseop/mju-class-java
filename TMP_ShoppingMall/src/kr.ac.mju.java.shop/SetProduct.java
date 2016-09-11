package kr.ac.mju.java.shop;

/**
 * Created by dongseop on 2016-09-11.
 */
public class SetProduct extends Product {
    private Product baseProduct;
    private int numInPackage;
    public SetProduct(Product product, int numInPackage) {
        super(product.getName() + " SET(" + numInPackage + ")", product.getPrice() * numInPackage, 0);
        this.baseProduct = product;
        this.numInPackage = numInPackage;
    }
}
