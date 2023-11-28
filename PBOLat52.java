/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan52.siapakamu;

/**
 *
 * @author ACER
 */
// PBOLat52.java
// PBOLat52.java
public class PBOLat52 {
    private String nama;
    private int umur;

    public PBOLat52 (String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}

// Dosen.java
class Dosen extends PBOLat52 {
    private String nip;
    private String mataKuliah;

    public Dosen(String nama, int umur, String nip, String mataKuliah) {
        super(nama, umur);
        this.nip = nip;
        this.mataKuliah = mataKuliah;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
}

// Mahasiswa.java
class Mahasiswa extends PBOLat52 {
    private String nim;
    private String jurusan;

    public Mahasiswa(String nama, int umur, String nim, String jurusan) {
        super(nama, umur);
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}

// ContohPenggunaan.java
class ContohPenggunaan {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("Rizki Adam Kurniawan", 27, "41227829930", "PBO");
        Mahasiswa mahasiswa = new Mahasiswa("Nindi", 17, "10110269", "PBO2");

        System.out.println("NIP DOSEN: " + dosen.getNip());
        System.out.println("Saya Dosen");
        System.out.println("Saya " + dosen.getNama() + " umur " + dosen.getUmur() + " sedang mengajar mata kuliah " + dosen.getMataKuliah());
        System.out.println("");
        System.out.println("NIM MAHASISWA : " + mahasiswa.getNim());
        System.out.println("Saya Mahasiswa");
        System.out.println("Saya " + mahasiswa.getNama() + " umur " + mahasiswa.getUmur()+ " sedang belajar di kelas " + mahasiswa.getJurusan());
    }
}