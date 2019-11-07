/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118074.latihan42.tabungan;
    import java.util.Scanner;
/**
 *
 * @author ASUS
 * NAMA: fikri maulana
 * NIM : 1018074
 * KELAS: if2
 */
public class PBO210118074LATIHAN42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner scanner = new Scanner(System.in);
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan tabungan = new Tabungan(scanner.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        System.out.println("Saldo Anda Sekarang : "
                + tabungan.ambilUang(scanner.nextInt()));
        
        System.out.println("Developed by : fikri maulana");
    }
    
}

