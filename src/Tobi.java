public class Tobi extends Akatsuki {
    private String namaAsli;

    public Tobi(String nama, String status, String asalDesa, String namaCincin, String posisiCincin) {
        super(nama, status, asalDesa, namaCincin, posisiCincin);
    }

    public void setNamaAsli(String namaAsli) {
        this.namaAsli = namaAsli;
    }

    @Override
    public void tampilData() {
        System.out.println("Nama asli : " + namaAsli);
        super.tampilData();
    }
}
