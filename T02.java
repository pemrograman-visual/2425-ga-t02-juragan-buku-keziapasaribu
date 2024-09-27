12S24009_Kezia Vania Pasaribu
12S24049_Rimanda Santa Risa Panjaitan

import java.util.*;
import java.lang.Math;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judulBuku, penulis, penerbit, formatBukuElektranik, kategori;
        int tahunTerbit, stok;
        double hargaPembelian, minimumMargin, rating;
        iSBN = input.nextLine();
        judulBuku = input.nextLine();
        penulis = input.nextLine();
        tahunTerbit = input.nextInt();
        penerbit = input.nextLine();
        formatBukuElektranik = input.nextLine();
        hargaPembelian = input.nextDouble();
        minimumMargin = input.nextDouble();
        stok = input.nextInt();
        rating = input.nextDouble();
        if (rating >= 4.7 && rating <= 5) {
            kategori = "Best Pick";
        } else {
            if (rating >= 4.5) {
                kategori = "Must Read";
            } else {
                if (rating >= 4.0) {
                    kategori = "Recommended";
                } else {
                    if (rating >= 3.0) {
                        kategori = "Average";
                    } else {
                        if (rating < 3.0) {
                            kategori = "Low";
                        } else {
                            kategori = "Error";
                        }
                    }
                }
            }
        }
        System.out.println(iSBN + "|" + judulBuku + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBukuElektranik + "|" + hargaPembelian + "|" + minimumMargin + "|" + stok + "|" + rating + "|" + kategori);
    }
}
