package com.example.myapplication;

import java.io.Serializable;

public class Nguoi implements Serializable {
    String hoten;
    String sdt;
    boolean gioitinh;
    String trinhdo;
    int tuoi;
    boolean thethao;
    String amnhac;



    public Nguoi(String hoten, String sdt, boolean gioitinh, String trinhdo, int tuoi, boolean thethao, String amnhac) {
        this.hoten = hoten;
        this.sdt = sdt;
        this.gioitinh = gioitinh;
        this.trinhdo = trinhdo;
        this.tuoi = tuoi;
        this.thethao = thethao;
        this.amnhac = amnhac;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getTrinhdo() {
        return trinhdo;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isThethao() {
        return thethao;
    }

    public void setThethao(boolean thethao) {
        this.thethao = thethao;
    }

    public String getAmnhac() {
        return amnhac;
    }

    public void setAmnhac(String amnhac) {
        this.amnhac = amnhac;
    }
}
