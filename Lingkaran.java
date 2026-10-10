public class Lingkaran extends Bentuk{
    private double radius;
    public static final double PHI = 3.14159;

    public Lingkaran(double radius, String Warna){
        super(Warna);
        this.radius = radius;
    }

    public double setradius(){
        return radius;
    }
    public void setradius(double radius){
        this.radius = radius;
    }
    
    public double hitungLuas(){
        return PHI * radius * radius;
    }

    @Override 
    public void printInfo(){
        System.out.println("Lingkara " + Warna + ", luas = " + hitungLuas());
    }
}
