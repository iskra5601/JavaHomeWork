package com.pb.iskra.hw11;

import java.util.Date;

public class Telephone {

    private String fio;
    private String birthDate;
    private int [] phone;
    private String adress;
    private String dateEdit;
    private String id;



    public String getBirthDate() {
        return birthDate;
    }


    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setPhone(int[] phone) {
        this.phone = phone;
    }
    public int[] getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = this.phone;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getDateEdit() {
        return dateEdit;
    }

    public void setDateEdit(String dateEdit) {
        this.dateEdit = dateEdit;
    }



    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }




}


