public class Silinder extends Lingkaran {
    private double tinggi;

    public Silinder(double tinggi, double radius, String Warna){
        super(radius, Warna);
        this.tinggi = tinggi;
    }

    public double gettinggi(){
        return tinggi;
    }
    public void settinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public double hitungVolume(){
        return super.hitungLuas() * tinggi;
    }

    @Override 
    public void printInfo(){
        System.out.println("Silinder Warna " + Warna + ", Voulume = " + hitungVolume());
    }
}
