/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalprojek;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 *
 * @author astri
 */

// Kelas Pendaftaran untuk mengatur proses pendaftaran donor
class DaftarDonor {
    private List<Donor> daftarDonor;

    public DaftarDonor() {
        daftarDonor = new ArrayList<>();
    }

    public void tambahDonor(Donor donor) {
        daftarDonor.add(donor);
        System.out.println("Pendaftaran berhasil! Terima kasih, " + donor.getNama() + ".");
    }

    public void tampilkanDaftarDonor() {
        if (daftarDonor.isEmpty()) {
            System.out.println("Belum ada donor terdaftar.");
        } else {
            System.out.println("Daftar Donor (A-Z):");
            for (Donor donor : daftarDonor) {
                System.out.println("Nama: " + donor.getNama() + ", Golongan Darah: " + donor.getGolonganDarah());
             
            }
        }
    }
    
    
    
}







                   
