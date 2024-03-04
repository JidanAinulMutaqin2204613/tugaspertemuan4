/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan nilai n
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        // Validasi inputan n
        if (n < 1) {
            System.out.println("nilai yang anda masukkan tidak valid.");
            return;
        }

        // Menampilkan bilangan dari 1 hingga n
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        input.close();
    }
}

