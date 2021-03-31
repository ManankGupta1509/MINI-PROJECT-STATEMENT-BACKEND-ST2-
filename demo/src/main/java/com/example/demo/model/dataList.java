package com.example.demo.model;


import javax.persistence.*;

@Entity
@Table(name = "datalist")
public class dataList {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;
    @Column(name = "mail")
    private String mail;
    @Column(name = "mobileNumber")
    private String mobileNumber;


    public dataList(String name, String mail, String mobileNumber) {
        this.name = name;
        this.mail = mail;
        this.mobileNumber = mobileNumber;
    }

    public dataList() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
