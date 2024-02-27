public class Garis {
    //Nama : Naufal Alwi Ramadhani
    //NIM : 24060122140154
    //deskripsi : membuat atribut, konstruktor dan method yang ada pada garis

    private Titik2 titikAwal;
    private Titik2 titikAkhir;

    public Garis(Titik2 titikAwal, Titik2 titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    public Garis(){
        this(new Titik2(), new Titik2());
    }

    public void setTitikAwal(Titik2 titikAwal){
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(Titik2 titikAkhir){
        this.titikAkhir = titikAkhir;
    }    
    
    public Titik2 getTitikAwal(){
        return this.titikAwal;
    }

    public Titik2 getTitikAkhir(){
        return this.titikAkhir;
    }

    public double getPanjang(){
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public double getGradien(){
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return dy/dx;
    }

    public Garis getRefleksiY(){
        Titik2 t1RefleksiY = new Titik2(titikAwal.getAbsis(), -titikAwal.getOrdinat());
        Titik2 t2RefleksiY = new Titik2(titikAkhir.getAbsis(), -titikAkhir.getOrdinat());
        return new Garis(t1RefleksiY, t2RefleksiY);
    }

    public boolean isTegakLurus(Garis g){
        return Math.abs(this.getGradien() * g.getGradien()) == 1;
    }

}
