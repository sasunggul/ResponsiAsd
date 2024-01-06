/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package responsi;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author unggul
 */
public class Responsi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Ketikkan Nama Anda? : ");
        String nama = inp.nextLine();
        System.out.print("Ketikkan Saldo : ");
        int saldo = inp.nextInt();
        int batas = 5;
        do {            
            System.out.print("\n===========================\n"
                    + "Menu Transaksi : \n"
                + "1. Penarikan\n"
                + "2. Menabung\n"
                + "Pilih Transaksi [1/2] : ");
            int pilih = inp.nextInt();
            System.out.println("===========================\n");
            if (pilih == 1) {
                System.out.println("Anda akan melakukan penarikan tunai\n"
                        + "Saldo anda sebesar Rp. "+ saldo );
                System.out.print("Masukkan jumlah penarikan : ");
                int tarik = inp.nextInt();
                int hasil = saldo - tarik;
                if (hasil < 5000) {
                    System.out.println("Maaf saldo tidak mencukupi");
                    hasil += tarik;
                }else if (tarik < 2000) {
                    System.out.println("Penarikan minimal 2000");
                }else{
                    System.out.println("\n===========================\n"
                            + "Sisa saldo anda sebesar Rp. "+ hasil+
                            "\n===========================\n");
                }
                batas --;
                System.out.println("Sisa transaksi anda sebanyak "+batas);
                saldo = hasil;
                System.out.print("Apakah anda akan bertransaksi lagi [y/n]? : ");
                String lanjut = inp.next();
                if ("y".equalsIgnoreCase(lanjut)) {
                    
                }else if ("n".equalsIgnoreCase(lanjut)) {
                    System.out.println("Terima kasih sudah bertransaksi di ATM unggul");
                    System.exit(0);
                }
                System.out.println("Sisa transaksi anda masih "+batas);
            }else if (pilih == 2) {
                System.out.println("Anda akan melakukan setor tunai\n"
                        + "Saldo anda sebesar Rp. "+ saldo );
                System.out.print("Masukkan jumlah setor : ");
                int setor = inp.nextInt();
                if (setor < 2000) {
                    System.out.println("Jumlah setor tunai minimal Rp.2000");
                }else {
                    System.out.println("Saldo awal Rp. "+saldo+
                            "\nJumlah setoran Rp. "+setor);
                    saldo += setor;
                    System.out.println("\n===========================\n"
                            + "Sisa saldo anda sebesar Rp. "+ saldo+
                            "\n===========================\n");
                    
                }
                batas --;
                System.out.println("Sisa transaksi anda sebanyak "+batas);
                System.out.print("Apakah anda akan bertransaksi lagi [y/n]? : ");
                String lanjut = inp.next();
                if ("y".equalsIgnoreCase(lanjut)) {
                    
                }else if ("n".equalsIgnoreCase(lanjut)) {
                    System.out.println("Terimakasih sudah bertransaksi di ATM unggul");
                    System.exit(0);
                }
                System.out.println("Sisa transaksi anda masih "+batas);
            }else{
                System.out.println("Maaf pilihan menu anda salah");
                System.out.print("Lanjutkan transaksi [y/n]? : ");
                String lanjut = inp.next();
                if ("y".equalsIgnoreCase(lanjut)) {
                    
                }else if ("n".equalsIgnoreCase(lanjut)) {
                    System.out.println("Terimakasih sudah bertransaksi di ATM unggul");
                    System.exit(0);
                }
            }
        } while (batas > 0);
    }
    
}
