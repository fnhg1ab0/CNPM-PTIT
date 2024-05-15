/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Shisui
 */
public class ImportedMaterial implements Serializable {
    private int id;
    private int quantity;
    private double unitPrice;
    private Material material;

    public ImportedMaterial() {
        super();
    }

    public ImportedMaterial(int id, int quantity, double unitPrice, Material material) {
        super();
        this.id = id;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.material = material;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "ImportedMaterial{" + "id=" + id + ", quantity=" + quantity + ", unitPrice=" + unitPrice + ", material=" + material + '}';
    }
}
