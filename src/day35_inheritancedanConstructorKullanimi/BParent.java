package day35_inheritancedanConstructorKullanimi;

public class BParent extends AGrandParent {
    protected String isim = "Parent isim belirtilmedi";
    protected String parentKlupAdi = "Parent Klubu";

    BParent() {
        System.out.println("Parent constructor calisti");
    }


}
