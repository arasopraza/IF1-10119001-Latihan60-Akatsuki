public class Akatsuki {
    private String nama, namaCincin, posisiCincin,
            status, asalDesa, kekuatan, rekan;

    public Akatsuki(String nama, String status, String asalDesa,
                    String namaCincin, String posisiCincin) {
        this.nama = nama;
        this.status = status;
        this.asalDesa = asalDesa;
        this.namaCincin = namaCincin;
        this.posisiCincin = posisiCincin;
    }

    public void setKekuatan(String kekuatan) {
        this.kekuatan = kekuatan;
    }

    public void setRekan(String rekan) {
        this.rekan = rekan;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama);
        System.out.println("Asal Desa : " + asalDesa);
        System.out.println("Status : " + status);
        System.out.println("Nama Cincin : " + namaCincin);
        System.out.println("Posisi Cincin : " + posisiCincin);
        System.out.println("Kekuatan : " + kekuatan);
        System.out.println("Rekan : " + rekan);
        System.out.print("\n");
    }
}
