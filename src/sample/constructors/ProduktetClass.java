package sample.constructors;

/**
 * Created by uran on 17-04-07.
 */
public class ProduktetClass {
    private String qmimi, zbritje, bc, emri, prodhuesi, kategoria, furnizuesi, njesia, foto, nrNjesia;
    private int id, sasia, sasiaKrit;
    private double qmimiStd, qmimiShumice;

    public ProduktetClass(String barcode, int id, String emri, String kategoria, String qmimi, double qmimiStd, int sasia, int sasiaKrit, String zbritje, String njesia,
                          String foto, double qmimiShumice, String nrNjesia) {
        this.emri = emri;
        this.id = id;
        this.kategoria = kategoria;
        this.qmimi = qmimi;
        this.sasia = sasia;
        this.zbritje = zbritje;
        this.bc = barcode;
        this.qmimiStd = qmimiStd;
        this.sasiaKrit = sasiaKrit;
        this.njesia = njesia;
        this.foto = foto;
        this.qmimiShumice = qmimiShumice;
        this.nrNjesia = nrNjesia;
    }

    public String getTotalNjesia() {
        return this.nrNjesia + " " + this.njesia;
    }

    public String getNrNjesia() {
        return nrNjesia;
    }

    public void setNrNjesia(String nrNjesia) {
        this.nrNjesia = nrNjesia;
    }

    public double getQmimiShumice() {
        return qmimiShumice;
    }

    public void setQmimiShumice(double qmimiShumice) {
        this.qmimiShumice = qmimiShumice;
    }

    public ProduktetClass(int id, String emri, String prodhuesi, String kategoria, String furnizuesi, String qmimi, int sasia) {
        this.emri = emri;
        this.id = id;
        this.prodhuesi = prodhuesi;
        this.kategoria = kategoria;
        this.sasia = sasia;
        this.furnizuesi = furnizuesi;
    }

    public String getNjesia() {
        return njesia;
    }

    public void setNjesia(String njesia) {
        this.njesia = njesia;
    }

    public String getBc() {
        return bc;
    }

    public void setBc(String bc) {
        this.bc = bc;
    }

    public int getSasiaKrit() {
        return sasiaKrit;
    }

    public void setSasiaKrit(int sasiaKrit) {
        this.sasiaKrit = sasiaKrit;
    }

    public double getQmimiStd() {
        return qmimiStd;
    }

    public void setQmimiStd(double qmimiStd) {
        this.qmimiStd = qmimiStd;
    }

    public String getZbritje() {
        return zbritje;
    }

    public void setZbritje(String zbritje) {
        this.zbritje = zbritje;
    }

    public String getFurnizuesi() {
        return furnizuesi;
    }

    public void setFurnizuesi(String furnizuesi) {
        this.furnizuesi = furnizuesi;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getProdhuesi() {
        return prodhuesi;
    }

    public void setProdhuesi(String prodhuesi) {
        this.prodhuesi = prodhuesi;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public String getQmimi() {
        return qmimi;
    }

    public void setQmimi(String qmimi) {
        this.qmimi = qmimi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSasia() {
        return sasia;
    }

    public void setSasia(int sasia) {
        this.sasia = sasia;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getFoto() {
        return this.foto;
    }
}
