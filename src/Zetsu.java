public class Zetsu extends Akatsuki {
    private String typeZetsu;

    public Zetsu(String nama, String status, String asalDesa, String namaCincin, String posisiCincin) {
        super(nama, status, asalDesa, namaCincin, posisiCincin);
    }

    public void setTypeZetsu(String typeZetsu) {
        this.typeZetsu = typeZetsu;
    }

    @Override
    public void tampilData() {
        System.out.println("Zetsu bertype dua : " + typeZetsu);
        super.tampilData();
    }
}
