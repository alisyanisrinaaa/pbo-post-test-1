/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;
import java.util.ArrayList; //Import Statement yang digunakan untuk mengimport kelas ArrayList

/**
 *
 * @author ACER
 */
public class PostTest1 {

    public static void main(String[] args) {
        // Arraylist untuk menyimpan objek Laptop
        ArrayList<Laptop> listLaptop = new ArrayList<>();
       
        // Inisialisasi 5 objek Laptop
        Laptop laptop1 = new Laptop("Acer Swift 3", 14.0f, 2019, 11949000, 5);
        Laptop laptop2 = new Laptop("Acer Aspire 3 Spin 14", 14.0f, 2022, 8499000, 3);
        Laptop laptop3 = new Laptop ("Asus VivoBook Ultra 15", 15.0f, 2021, 9999000, 12);
        Laptop laptop4 = new Laptop ("Asus Zenbook S 13", 13.3f, 2022, 19499000, 7);
        Laptop laptop5 = new Laptop ("Apple Macbook Pro M2", 13.0f, 2022, 19499000, 8 );
        
        // Menambahkan objek - objek Laptop ke Arraylist
        listLaptop.add(laptop1);
        listLaptop.add(laptop2);
        listLaptop.add(laptop3);
        listLaptop.add(laptop4);
        listLaptop.add(laptop5);
        
        // Perulangan untuk menampilkan daftar list Laptop
        for (Laptop laptop : listLaptop) {
            System.out.println("\n >>>>>>>>>>>>>>> Informasi Laptop <<<<<<<<<<<<<<<");
            String merk = "Merk : " + laptop.getMerk() + ", ";
            String ukuranLayar = " Ukuran Layar : " + laptop.getUkuranLayar() + " inch ";
            String tahunRilis = " Tahun Rilis : " + laptop.getTahunRilis();
            String harga = " Harga : " + laptop.getHarga();
            String stock = " Stock Barang : " + laptop.getStock();
            
            // String Concatenation untuk memberikan informasi mengenai Laptop
            System.out.println(merk.concat(ukuranLayar));
            System.out.println(merk.concat(tahunRilis));
            System.out.println(merk.concat(harga));
            System.out.println(merk.concat(stock));
        }
    }
}
