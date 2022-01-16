package com.codegym;

public class XeDap extends PhươngTienDiChuyen {
    public XeDap(HangSanXuat hangSanXuat) {
        super("Xe Đạp", hangSanXuat);
    }

    @Override
    public double layVanToc() {
        return 40;
    }
}
