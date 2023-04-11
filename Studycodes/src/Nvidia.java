public class Nvidia implements Videocard{
    String name;
    String agreement;
    public Nvidia(){
        name = "RTX2050";
        agreement="HDMI/DP";
    }
    public void display(){
        System.out.println("Nvidia's videocard");
    }
    public String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }
    public void rgb(){
        System.out.println("这是红色");
        System.out.println("这是黄色");
        System.out.println("这是蓝色");
        System.out.println("rgb ON!");
    }
    public void boost(){
        System.out.println("Your videocard is overloading");
    }
    public void setAgreement(String agreement){
        this.agreement=agreement;
    }
    public void showAgreement(){
        System.out.println(agreement);
    }
    public void RTXOn(){
        System.out.println("now you can enjoy ray tracing! ");
    }
}
