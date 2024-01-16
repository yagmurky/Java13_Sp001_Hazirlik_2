package com.yagmur.Zoru.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Urun {

    private int id;
    private String ad;
    private Marka marka;
    private Model model;
    private Kategoriler kategori;
    private Fiyat sonFiyat;
    private List<Fiyat> fiyatList;


    public void fiyatGuncelle(int id, int fiyat, String tarih, String siteLink) {
        List<Fiyat> tempList = new ArrayList<>();
        Fiyat yeniFiyat = new Fiyat(id,fiyat,tarih,siteLink);
        tempList.add(yeniFiyat);

        fiyatList.add(yeniFiyat);

        this.sonFiyat = yeniFiyat;

    }


}
