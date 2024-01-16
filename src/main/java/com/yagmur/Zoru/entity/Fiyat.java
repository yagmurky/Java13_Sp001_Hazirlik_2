package com.yagmur.Zoru.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Fiyat {
    private int id;
    private int fiyat;
    private String tarih;
    private String siteLink;
}
