/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: menampilkan daftar anggota Akatsuki
 * anime Naruto berbasis OOP dan implementasi pewarisan.
 */

public class Main {
    public static void main(String[] args) {
        Deidara deidara = new Deidara("Deidara (デイダラ)", "Bunuh diri",
                 "Iwagakure","Seiryū (Naga Biru/Hijau)", "Telunjuk kanan");
        deidara.setKekuatan("Memiliki kekkei genkai elemen ledakan");
        deidara.setRekan("Sasori dan Tobi");
        deidara.tampilData();


        Hidan hidan = new Hidan("Hidan (飛段)", "Disegel shikamaru",
                "Yugakure", "Santai (Tiga Tingkatan)", "Telunjuk kiri");
        hidan.setKekuatan("Mampu menangkap jinchūriki ekor dua dan tidak bisa mati");
        hidan.setRekan("Kakuzu");
        hidan.tampilData();

        Itachi itachi = new Itachi("Itachi Uchiha (団扇 鼬)", "Kehabisan Chakra",
                "Konohagakure", "Suzaku (Merah darah)", "Jari manis kanan");
        itachi.setKekuatan("Sangat mahir dalam semua keterampilan Ninja utama");
        itachi.setRekan("Kisame Hoshigaki");
        itachi.tampilData();

        Kakuzu kakuzu = new Kakuzu("Kakuzu (角都)", "Dibunuh Kakashi",
                "Takigakure", "Hokuto (Bintang Utara)", "Jari tengah kiri");
        kakuzu.setKekuatan("Tidak bisa mati");
        kakuzu.setRekan("Hidan");
        kakuzu.tampilData();

        Kisame kisame = new Kisame("Kisame Hoshigaki (干柿鬼鮫)", "Bunuh diri",
                "Kirigakure", "Nanju (Bintang Selatan)", "Jari manis kiri");
        kisame.setKekuatan("Ahli pedang");
        kisame.setRekan("Itachi Uciha");
        kisame.tampilData();

        Konan konan = new Konan("Konan (小南)", "Dibunuh Tobi",
                "Amegakure", "Byakko (Harimau Putih)", "Jari tengah kanan");
        konan.setKekuatan("Seorang kunoichi yang sangat kuat");
        konan.setRekan("Nagato");
        konan.tampilData();

        Pain pain = new Pain("Pain (ペイン)", "Dibunuh Naruto",
                "Amegakure", "Rei (Nol/Tidak ada)", "Jempol kanan");
        pain.setKekuatan("Anggota Akatsuki terkuat");
        pain.setNamaAsli("Nagato (長門)");
        pain.setRekan("Konan dan Yahiko");
        pain.tampilData();

        Sasori sasori = new Sasori("Sasori (サソリ)", "Bunuh diri",
                "Sunagakure", "Gyokunyo (Virgo)", "Jempol kiri");
        sasori.setKekuatan("Pengguna boneka yang sangat kuat");
        sasori.setRekan("Deidara");
        sasori.tampilData();

        Tobi tobi = new Tobi("Tobi (トビ)", "Dibunuh Kaguya",
                "Konohagakure", "Gyokunyo (Virgo)", "Jempol kiri");
        tobi.setKekuatan("Memiliki Sharingan yang dapat membuat tubuhnya tembus dari serangan");
        tobi.setNamaAsli("Obito Uchiha");
        tobi.setRekan("Deidara dan Zetsu");
        tobi.tampilData();

        Zetsu zetsu = new Zetsu("Zetsu (ゼツ)", "Dibunuh Sasuke",
                "Kusagakure", "Genbu (Kura-Kura)", "Kelingking Kanan");
        zetsu.setKekuatan("Mempunyai dua kepribadian");
        zetsu.setTypeZetsu("Zetsu Hitam dan Zetsu Putih");
        zetsu.setRekan("Tobi");
        zetsu.tampilData();

    }
}
