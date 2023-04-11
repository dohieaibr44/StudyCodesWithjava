class Person {
    public void run(){
        System.out.println("人在跑步");
    }
    class Robot implements Machine{
        public void run(){
            System.out.println("机器运转");
        }
        public void show(){
            this.run();
            Person.this.run();
        }
    }
}
public class Test{
    public static void main(String[] args) {
        Person.Robot r=new Person().new Robot();
        r.show();


    }
}

