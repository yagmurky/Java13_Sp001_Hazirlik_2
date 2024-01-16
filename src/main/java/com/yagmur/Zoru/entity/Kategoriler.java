package com.yagmur.Zoru.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Kategoriler {

    private String id;
    private String ad;
    private List<Urun> urun;


}
