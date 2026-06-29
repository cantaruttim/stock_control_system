package br.com.stock_control.smart_control.model;

import br.com.stock_control.smart_control.model.enums.ProductType;

public class Product {
    
    private String productSKU;
    private String productName;
    private String productDescription;
    private String productBrand;
    private double productPrice;
    private int productQuantity;
    private ProductType productType;
    

    public Product() {}

    public Product(
        String productSKU, 
        String productName, 
        String productDescription, 
        String productBrand, 
        double productPrice, 
        int productQuantity, 
        ProductType productType) {
            this.productSKU = productSKU;
            this.productName = productName;
            this.productDescription = productDescription;
            this.productBrand = productBrand;
            this.productPrice = productPrice;
            this.productQuantity = productQuantity;
            this.productType = productType;
    }

    public String getProductSKU() {
        return productSKU;
    }

    public void setProductSKU(String productSKU) {
        this.productSKU = productSKU;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public double calculateTotalValue() {
        return productPrice * productQuantity;
    }

}
