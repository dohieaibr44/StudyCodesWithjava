public class Computer {
    public static void main(String[] args) {
        Nvidia nvidia =new Nvidia();
        Amd yes=new Amd();
        Mainboard m =new Mainboard();
        String strCPU = "";
        m.setCpu(yes);
        m.setVc(nvidia);
        m.run();

    }
}
