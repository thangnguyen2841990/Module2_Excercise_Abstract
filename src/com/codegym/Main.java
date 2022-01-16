package com.codegym;

public class Main {

    public static void main(String[] args) {
        HangSanXuat h1 = new HangSanXuat("Hãng 1", "Việt Nam");
        HangSanXuat h2 = new HangSanXuat("Hãng 2", "USA");
        HangSanXuat h3 = new HangSanXuat("Hãng 3", "JaPan");
        PhươngTienDiChuyen p1 = new MayBay("xăng", h2);
        PhươngTienDiChuyen p2 = new XeOTo("Xăng", h3);
        PhươngTienDiChuyen p3 = new XeDap(h1);

        System.out.println("Láy tên hãng sản xuất");
        System.out.println("p1: " + p1.layTenHangSanXuat());
        System.out.println("p2: " + p2.layTenHangSanXuat());
        System.out.println("p3: " + p3.layTenHangSanXuat());

        System.out.println("Bắt đầu");
        p1.batDau();
        p2.batDau();
        p3.batDau();

        System.out.println("Lấy vận tốc");
        System.out.println("p1: " + p1.layVanToc()+"(Km/h)");
        System.out.println("p2: " + p2.layVanToc()+"(Km/h)");
        System.out.println("p3: " + p3.layVanToc()+"(Km/h)");

        System.out.println("Cất cánh");
        if (p2 instanceof MayBay) {
            ((MayBay) p2).catCanh();
        }

    }
}
