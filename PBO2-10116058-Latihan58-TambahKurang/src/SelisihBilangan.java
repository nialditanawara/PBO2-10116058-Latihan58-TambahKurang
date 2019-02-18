/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan58.tambahkurang;

public class SelisihBilangan extends Bilangan {

    public void tampilSelisih() {
        int a;
        int b;
        
        a=getX();
        b=getY();
        
        System.out.println("Hasil Selisih "+a+" - "+b+" = "+ (a-b));

    }

}