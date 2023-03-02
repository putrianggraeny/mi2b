/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

/**
 *
 * @author Lenovo
 */
public class Mahasiswa {
    String nama,nobp,kelas,prodi,jurusan;
    
    public static void main(String[] args)
    {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Putri Anggraeni";
        mhs.nobp = "2101092014";
        mhs.kelas = "B";
        mhs.prodi = "Manajemen Informatika";
        mhs.jurusan = "Teknologi Informasi";
        
        System.out.println("Nama     : " +mhs.nama+ "\n"
        + "No Bp    : " +mhs.nobp+ "\n"
        + "Kelas    : " +mhs.kelas+ "\n"
        + "Prodi    : " +mhs.prodi+ "\n"
        + "Jurusan  : " +mhs.jurusan);
        
        System.out.println("\n");
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama = "Lalisa";
        mhs2.nobp = "2101092027";
        mhs2.kelas = "B";
        mhs2.prodi = "Teknik Komputer";
        mhs2.jurusan = "Teknologi Informasi";
        
        System.out.println("Nama     : " +mhs2.nama+ "\n"
        + "No Bp    : " +mhs2.nobp+ "\n"
        + "Kelas    : " +mhs2.kelas+ "\n"
        + "Prodi    : " +mhs2.prodi+ "\n"
        + "Jurusan  : " +mhs2.jurusan);
    }
}
