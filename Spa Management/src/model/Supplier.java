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
public class Supplier implements Serializable {
    private int id;
    private String name;
    private String address;
    private String tel;
    private String taxCode;

    public Supplier() {
        super();
    }

    public Supplier(int id, String name, String address, String tel, String taxCode) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
        this.tel = tel;
        this.taxCode = taxCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTel() {
        return tel;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getTaxCode() {
        return taxCode;
    }
    
    @Override
    public String toString() {
        return "Supplier{" + "id=" + id + ", name=" + name + ", address=" + address + ", tel=" + tel + ", taxCode=" + taxCode + '}';
    }
}
