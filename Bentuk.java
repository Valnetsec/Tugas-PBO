public class Bentuk{
    public String Warna;

    public Bentuk(String Warna){
        this.Warna = Warna;
    }

    public String getwarna(){
        return Warna;
    }
    public void setwarna(String Warna){
        this.Warna = Warna;
    }

    public void printInfo(){
        System.out.println("Bentuk berwarna " + Warna);
    }
}
