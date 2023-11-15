
package vücutkütleindeksihesaplama;

import java.util.Scanner;

public class VücutKütleİndeksiHesaplama {

    public static void main(String[] args) {


        double boy,kilo,indeks;
            Scanner scn=new Scanner(System.in);
        System.out.print("Lutfen Boyunuzu Metre Cinsinden Giriniz : ");
        boy=scn.nextDouble();

        System.out.print("Lutfen Kilonuzu KG Cinsinden Giriniz : ");
        kilo=scn.nextDouble();
        
        indeks=kilo/(boy*boy);
        System.out.println("Vucut Kutle Indeksiniz : "+indeks);
    }
    
}
