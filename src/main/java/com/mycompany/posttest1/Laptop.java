/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.posttest1;

/**
 *
 * @author ACER
 */
public class Laptop { //Deklarasi dari class "Laptop"
    // properti
    public String merk; //Deklarasi variabel public merk yang menggunakan tipe data string
    public float ukuranLayar; //Deklarasi variabel public ukuranLayar yang menggunakan tipe data float
    public int tahunRilis; //Deklarasi variabel public tahunRilis yang menggunakan tipe data integer
    public int harga; //Deklarasi variabel public harga yang menggunakan tipe data integer
    public int stock; //Deklarasi variabel public stock yang menggunakan tipe data integer
    
    // constructor
    public Laptop(String merk, float ukuranLayar, int tahunRilis, int harga, int stock) {
        this.merk = merk; //Inisialisasi merk dengan nilai dari parameter merk
        this.ukuranLayar = ukuranLayar; //Inisialisasi ukuranLayar dengan nilai dari parameter ukuranLayar
        this.tahunRilis = tahunRilis; //Inisialisasi tahunRilis dengan nilai dari parameter tahunRilis
        this.harga = harga; //Inisialisasi harga dengan nilai dari parameter harga
        this.stock = stock; //Inisialisasi stock dengan nilai dari parameter stock
    }
    
    // Method 
    public String getMerk(){ //Method getter / pengambil yang digunakan untuk mengambil nilai variabel "merk"
        return merk;
    }
    
    public float getUkuranLayar(){ //Method getter / pengambil yang digunakan untuk mengambil nilai variabel "ukuranLayar"
        return ukuranLayar;
    }
    
    public int getTahunRilis(){ //Method getter / pengambil yang digunakan untuk mengambil nilai variabel "tahunRilis"
        return tahunRilis;
    }
    
    public int getHarga(){ //Method getter / pengambil yang digunakan untuk mengambil nilai variabel "harga"
        return harga;
    }
    
    public int getStock(){ //Method getter / pengambil yang digunakan untuk mengambil nilai variabel "stock"
        return stock;
    }
}