public class Mainboard {
    Videocard vc;
    Cpu cpu;
    String product_name="This is superMainboard";
    String made_date="2020.2.20";
    void showInfo(){//显示主板信息
        System.out.println(product_name);
        System.out.println(made_date);
    }
    void setInfo(String product_name,String made_date){//更改主板出厂信息
        this.made_date=made_date;
        this.product_name=product_name;
    }
    void setVc(Videocard vc){//设置显卡
        this.vc=vc;
    }
   void setCpu(Cpu cpu){//设置cpu
        this.cpu=cpu;
   };
    void run(){
        vc.display();
        System.out.println(vc.getName());
        System.out.println(cpu.getName());
        showInfo();
        System.out.println("the board is working");
        vc.boost();
        vc.rgb();
        vc.RTXOn();
        vc.setAgreement("HDMI2.2/DP");
        vc.showAgreement();
        cpu.boost();
    }
}
