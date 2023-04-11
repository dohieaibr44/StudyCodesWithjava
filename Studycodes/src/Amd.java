public class Amd implements Cpu{
    String name;
    public Amd(){
        name="ThreadRipper";
    }
    public void boost(){
        System.out.println("Your cpu is overlocking");
    }
    public String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }

}
