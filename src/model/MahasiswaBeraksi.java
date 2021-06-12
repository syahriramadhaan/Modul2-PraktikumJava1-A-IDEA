package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException {

        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19630190";
        mahasiswa.nama = "Syahri";
        mahasiswa.tanggalLahir = simpleDateFormat.parse("09-09-2009");

        System.out.println("Nama \t\t\t : " + mahasiswa.nama);
        System.out.println("NPM \t\t\t : " + mahasiswa.npm);
        System.out.println("Tanggal Lahir \t : " + mahasiswa.tanggalLahir);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.npm = "19630191";
        mahasiswa2.nama = "Ramadhan";
        mahasiswa2.tanggalLahir = simpleDateFormat.parse("08-08-2008");

        System.out.println("Nama \t\t\t : " + mahasiswa2.nama);
        System.out.println("NPM \t\t\t : " + mahasiswa2.npm);
        System.out.println("Tanggal Lahir \t : " + mahasiswa2.tanggalLahir);

        System.out.println("Nama \t\t\t : " + mahasiswa2.nama);
        System.out.println("NPM \t\t\t : " + mahasiswa2.npm);
        System.out.println("Tanggal Lahir \t : " + simpleDateFormat.format(mahasiswa2.tanggalLahir));

        mahasiswa.tampilkanAtribut();
        mahasiswa.menyapa();

        Mahasiswa mahasiswa1 = new Mahasiswa();
    }
}
