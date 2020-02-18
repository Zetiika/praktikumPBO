
import java.util.Scanner;
import Data.datapetugas;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class mainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("DATA TOKO");
        System.out.println("Menu");
        System.out.println("1.Input Petugas");
        System.out.println("2.Input Pelanggan");//nama
        System.out.println("3.Input barang");//stok,nama,jenis,harga
        System.out.println("Pilihan :");
        Scanner pil = new Scanner(System.in);
        int menu = pil.nextInt();
        switch(menu)
        {
            case 1:
                datapetugas dat=new datapetugas();
                datapetugas.data();
            case 2:
                System.out.println("Input Pelanggan");
                System.out.println("Masukkan Nama Pelanggan :");
                Scanner nama = new Scanner(System.in);
                String name=nama.nextLine();
                System.out.println("Alamat :");
                Scanner alamat = new Scanner(System.in);
                String addres=alamat.nextLine();
                System.out.println("No.Telp :");
                Scanner no = new Scanner(System.in);
                String phone=no.nextLine();
                break;
            case 3:        
                 Barang data=new Barang();
                Barang.data();
        }
        
    }
}
