package com.codegym;

public class MayBay extends PhươngTienDiChuyen {
    private String loaiNhienLieu;

    public MayBay(String loaiNhienLieu, HangSanXuat hangSanXuat) {
        super("Máy bay", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 500;
    }
    public void catCanh(){
        System.out.println("Cất cánh....");
    }
    public void haCanh(){
        System.out.println("Hạ cánh....");
    }
}
