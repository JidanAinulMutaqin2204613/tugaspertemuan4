/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sisi = new int[3]; 

        // Memasukkan ketiga sisi
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan panjang sisi " + (i + 1) + ":");
            sisi[i] = scanner.nextInt();
        }

        // Memeriksa apakah semua sisi memiliki panjang yang lebih besar dari 0
        if (sisi[0] > 0 && sisi[1] > 0 && sisi[2] > 0) {
            if (sisi[0] == sisi[1] && sisi[1] == sisi[2]) {
                System.out.println("Termasuk Kubus");
            } else {
                System.out.println("Bukan Kubus");
            }
        } else {
            System.out.println("Panjang sisi harus lebih besar dari 0.");
        }

        scanner.close();
    }
}

