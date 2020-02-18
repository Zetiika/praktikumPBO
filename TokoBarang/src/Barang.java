/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import Data.transaksi;
/**
 *
 * @author user
 */
public class Barang {
    public static void data() {
        System.out.println("Input Barang");
                System.out.println("Nama Barang :");
                Scanner bar = new Scanner(System.in);
                String brg=bar.nextLine();
                
                System.out.println("Stok :");
                Scanner stok = new Scanner(System.in);
                int stk=stok.nextInt();
                
                System.out.println("Jenis :");
                Scanner jenis = new Scanner(System.in);
                String jns=jenis.nextLine();
                
                System.out.println("Harga :");
                Scanner harga = new Scanner(System.in);
                int hrg=harga.nextInt();
                
                transaksi total=new transaksi();
                System.out.println("Total Harga Barang = " +total.total(stk,hrg));
                
                System.out.println("Bayar : ");
                 Scanner byr = new Scanner(System.in);
                int bayar=byr.nextInt();
                
               
                        
                            transaksi kmbli=new transaksi();
                                System.out.println("Kembalian = " +kmbli.kmbli(stk,hrg,bayar));
    }
}
