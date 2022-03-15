package com.maxtrain.bootcamp.prs.model;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 30, nullable = false, unique = true)
    private String partNbr;

    @Column(length = 30, nullable = false)
    private String name;

    @Column(columnDefinition = "decimal(11,2) NOT NULL DEFAULT 0.0 ")
    private double price;

    @Column(length = 30, nullable = false)
    private String unit;

    private String photoPath;

    @ManyToOne(optional = false)
    @JoinColumn(name = "vendor_id")
    private Vendor vendor;

    public Product(){}

    public Product(int id, String partNbr, String name, double price, String unit, String photoPath, Vendor vendor) {
        this.id = id;
        this.partNbr = partNbr;
        this.name = name;
        this.price = price;
        this.unit = unit;
        this.photoPath = photoPath;
        this.vendor = vendor;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPartNbr() {
        return partNbr;
    }
    public void setPartNbr(String partNbr) {
        this.partNbr = partNbr;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public String getPhotoPath() {
        return photoPath;
    }
    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }
    public Vendor getVendor() {
        return vendor;
    }
    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }
}
