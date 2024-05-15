/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Shisui
 */
public class Invoice implements Serializable {
    private int id;
    private String No;
    private Date date;
    private double tax;
    private double totalAmount;
    private double paidAmount;
    private User buyer;
    private Supplier supplier;
    private ArrayList<ImportedMaterial> listMaterial;

    public Invoice() {
        super();
    }

    public Invoice(int id, String No, Date date, double tax, double totalAmount, double paidAmount, User buyer, Supplier supplier, ArrayList<ImportedMaterial> listMaterial) {
        super();
        this.id = id;
        this.No = No;
        this.date = date;
        this.tax = tax;
        this.totalAmount = totalAmount;
        this.paidAmount = paidAmount;
        this.buyer = buyer;
        this.supplier = supplier;
        this.listMaterial = listMaterial;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNo(String No) {
        this.No = No;
    }

    public String getNo() {
        return No;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setListMaterial(ArrayList<ImportedMaterial> listMaterial) {
        this.listMaterial = listMaterial;
    }

    public ArrayList<ImportedMaterial> getListMaterial() {
        if(listMaterial == null)
            listMaterial = new ArrayList<>();
        return listMaterial;
    }

    @Override
    public String toString() {
        return "Invoice{" + "id=" + id + ", No=" + No + ", date=" + date + ", tax=" + tax + ", totalAmount=" + totalAmount + ", paidAmount=" + paidAmount + ", buyer=" + buyer + ", supplier=" + supplier + ", listMaterial=" + listMaterial + '}';
    }
}
