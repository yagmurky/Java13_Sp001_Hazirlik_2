package com.yagmur.Zoru;

import com.yagmur.Zoru.entity.*;

import java.util.ArrayList;
import java.util.List;

public class Zoru {
    /**
     * İnternet sitelerinden veri toplama yazılımı
     *
     * Ürünler belirli kategorilere ait olmalıdır. Her ürünün marka ve model bilgileri vardır.
     * Ürün fiyatında bağımsız tanımlanır son fiyat ürün içindeki fiyat alanında bulunabilir.
     *
     *
     * ğrğnlerin fiyatları günlük olarak tutulacaktır. Fiyat değişimleri tablosunda ürünün fiyat bilgileri olacak.
     * Örneğin A ürünün 12.01.2023 tarihli fiyat bilgisi olcak
     * bu bilginin hangi siteden alındığı olacak. Sitenin linki bilgisi de ayrıca olacak.
     *
     * REPORTS:
     * Bir ürün belli tarihler arasındaki fiyatları
     * belli kategorideki ürünlerin değişim yüzdeleri.
     * belli bir tarih aralığındaki ürünlerin değişim yüzdeleri.
     *
     *
     *
     * -Kategoriler
     * -Marka
     * -Model
     * -Urun
     * -Fiyat Değişimleri
     *
     */
    public static void main(String[] args) {

        Marka samsung = Marka.builder().ad("Samsung").build();
        Model s22 = Model.builder().ad("S22").build();

        Marka apple = Marka.builder().ad("Apple").build();
        Model iphone6 = Model.builder().ad("Iphone").build();

        Kategoriler cepTelefonları = Kategoriler.builder().ad("CepTelefonları").build();

       List<Fiyat> samsungFiyatList = new ArrayList<>();
       Fiyat samsungFiyat = Fiyat.builder().id(1).fiyat(1500).tarih("12.01.2021").siteLink("www.samsung.com").build();
       samsungFiyatList.add(samsungFiyat);

        Urun samsungGalaxyS22 = Urun.builder().ad("Samsung Galaxy S22")
                .marka(samsung)
                .kategori(cepTelefonları)
                .model(s22)
                .sonFiyat(samsungFiyat)
                .id(1)
                .build();


        List<Fiyat> iphone6FiyatList = new ArrayList<>();
        Fiyat iphone6Fiyat = Fiyat.builder().id(1).fiyat(2000).tarih("12.01.2021").siteLink("www.apple.com").build();
        iphone6FiyatList.add(iphone6Fiyat);

        Urun appleIphone6 = Urun.builder().ad("Apple Iphone 6")
                .marka(apple)
                .kategori(cepTelefonları)
                .model(iphone6)
                .fiyatList(iphone6FiyatList)
                .sonFiyat(iphone6Fiyat)
                .id(2)
                .build();


        samsungGalaxyS22.fiyatGuncelle(2,1600,"13.01.2021","www.samsung.com");
        samsungGalaxyS22.fiyatGuncelle(3,1700,"14.01.2021","www.samsung.com");
        samsungGalaxyS22.fiyatGuncelle(4,1800,"15.01.2021","www.samsung.com");
        samsungGalaxyS22.fiyatGuncelle(5,1900,"16.01.2021","www.samsung.com");
        samsungGalaxyS22.fiyatGuncelle(6,2000,"17.01.2021","www.samsung.com");


        appleIphone6.fiyatGuncelle(2,2100,"13.01.2021","www.apple.com");
        appleIphone6.fiyatGuncelle(3,2200,"14.01.2021","www.apple.com");
        appleIphone6.fiyatGuncelle(4,2300,"15.01.2021","www.apple.com");
        appleIphone6.fiyatGuncelle(5,2400,"16.01.2021","www.apple.com");
        appleIphone6.fiyatGuncelle(6,2500,"17.01.2021","www.apple.com");


        System.out.println(samsungGalaxyS22.getFiyatList());




    }


}
