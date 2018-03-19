package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "KITAP")
public class Kitap {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "KITAP_AD")
    private String kitapAdi;

    @Column(name = "YAZAR")
    private String yazarAdi;

    @Column(name = "YAYINEVI")
    private String yayinevi;

    @Column(name = "DURUM")
    private String durum;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public String getYayinevi() {
        return yayinevi;
    }

    public void setYayinevi(String yayinevi) {
        this.yayinevi = yayinevi;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public Kitap(Long id, String kitapAdi, String yazarAdi, String yayinevi, String durum) {
        this.id = id;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.yayinevi = yayinevi;
        this.durum = durum;
    }
}
