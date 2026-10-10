public class BujurSangkar extends Bentuk{
    private double sisi;

    public BujurSangkar(double sisi, String Warna){
        super(Warna);
        this.sisi = sisi;
    }

    public double setsisi(){
        return sisi;
    }
    public void getsisi(double sisi){
        this.sisi = sisi;
    }

    public double hitungLuas(){
        return sisi * sisi;
    }

    @Override 
    public void printInfo(){
        System.out.println("BujurSangkar Berwarna " + Warna + ", luas = " + hitungLuas());
    }
}
