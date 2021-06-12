import model.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("19630192","Syahra","07-07-2007");
        m1.tampilkanAtribut();
        System.out.println(m1.getNama());

        System.out.println("MAAF PAK Banyak commit yang terulang");
    }
}