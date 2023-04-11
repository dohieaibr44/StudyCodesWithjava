public class Students {

    public static void main(String[] args) {
        Student zhangsan=new Student(202301,"张三",90,80,65);
        Student lisi=new Student(202302,"李四",59,80,65);
        Student lisi2= new Student(202303,"李四",85,49,25);
        Record r=new Record();
        r.getScore(zhangsan);
        r.getScore(lisi);
        r.getScore(lisi2);

    }
}
