/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srm.model;

import java.sql.Timestamp;

/**
 *
 * @author HP
 */
public class Student extends AbstractModel {
    private long ma_sinh_vien;
    private String ho_ten;
    private String so_dien_thoai;
    private String dia_chi;
    private Timestamp ngay_sinh;
    private boolean gioi_tinh;
    private boolean trang_thai;

    public long getMa_sinh_vien() {
        return ma_sinh_vien;
    }

    public void setMa_sinh_vien(long ma_sinh_vien) {
        this.ma_sinh_vien = ma_sinh_vien;
    }

    public String getHo_ten() {
        return ho_ten;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
    }

    public String getSo_dien_thoai() {
        return so_dien_thoai;
    }

    public void setSo_dien_thoai(String so_dien_thoai) {
        this.so_dien_thoai = so_dien_thoai;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public Timestamp getNgay_sinh() {
        return ngay_sinh;
    }

    public void setNgay_sinh(Timestamp ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }

    public boolean isGioi_tinh() {
        return gioi_tinh;
    }

    public void setGioi_tinh(boolean gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    public boolean isTrang_thai() {
        return trang_thai;
    }

    public void setTrang_thai(boolean trang_thai) {
        this.trang_thai = trang_thai;
    }
}
