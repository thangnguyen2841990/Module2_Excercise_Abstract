package com.codegym;

public class XeOTo extends PhươngTienDiChuyen {
    private String loaiNhienLieu;

    public XeOTo(String loaiNhienLieu, HangSanXuat hangSanXuat) {
        super("Ô Tô", hangSanXuat);
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
        return 150;
    }
}
