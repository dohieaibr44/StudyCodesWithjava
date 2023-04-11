abstract class Employee {
    String name;
    int birthday;
    static int today;
    Employee(){};
    Employee(String name,int birthday){
        this.name=name;
        this.birthday=birthday;
    }
    public abstract void getSalary(int month);
    public static void putToday(int toDay){
        today=toDay;
        System.out.println("今天是"+today);
    };
    public static int getToday(){
        return today;
    }
}
class SalariedEmployee extends Employee{
    int monthlySalary;
    SalariedEmployee(String name,int birthday,int monthlySalary){
        super(name,birthday);
        this.name=name;
        this.birthday=birthday;
        this.monthlySalary=monthlySalary;
    }
    public void getSalary(int month) {
        if(getToday() ==birthday){
            System.out.println(name+"的工资为"+month*monthlySalary+100);
        }else{
            System.out.println(name+"的工资为"+month*monthlySalary);
        }
    }
}
class HourlyEmployee extends Employee{
    int salaryHourly;
    int hoursMonthly;
    HourlyEmployee(String name,int birthday,int salaryHourly,int hoursMonthly){
        super(name,birthday);
        this.name=name;
        this.birthday=birthday;
        this.salaryHourly=salaryHourly;
        this.hoursMonthly=hoursMonthly;
    }
    public void getSalary(int month) {
        if (getToday() == birthday) {
            if (hoursMonthly < 160) {
                System.out.println(name+"的工资为"+(salaryHourly * hoursMonthly + 100));
            } else {
                System.out.println(name+"的工资为"+(salaryHourly * 160 + salaryHourly * (hoursMonthly - 160) * 1.5+100));
            }
        }else{
            if (hoursMonthly < 160) {
                System.out.println(name+"的工资为"+(salaryHourly * hoursMonthly));
            } else {
                System.out.println(name+"的工资为"+(salaryHourly * 160 + salaryHourly * (hoursMonthly - 160) * 1.5));
            }
        }


    }
}
class SalesEmployee extends Employee{
    double salesAllMonthly;
    double salaryPersent;
    SalesEmployee(String name,int birthday,double salesAllMonthly,double salaryPersent){
        super(name,birthday);
        this.name=name;
        this.birthday=birthday;
        this.salesAllMonthly=salesAllMonthly;
        this.salaryPersent=salaryPersent;
    }
    public void getSalary(int month) {
        if(getToday()==birthday){
            System.out.println(name+"的工资为"+(month*salesAllMonthly*salaryPersent+100));
        }else{
            System.out.println(name+"的工资为"+(month*salesAllMonthly*salaryPersent));
        }
    }
}
class BasePlusSalesEmployee extends SalesEmployee{
    int baseSalary;

    BasePlusSalesEmployee(String name, int birthday, double salesAllMonthly, double salaryPersent,int baseSalary) {
        super(name, birthday, salesAllMonthly, salaryPersent);
        this.name=name;
        this.birthday=birthday;
        this.baseSalary=baseSalary;
    }
    public void getSalary(int month){
        if(getToday()==birthday){
            System.out.println(name+"的工资为"+(baseSalary+month*salesAllMonthly*salaryPersent+100));
        }else{
            System.out.println(name+"的工资为"+(baseSalary+month*salesAllMonthly*salaryPersent));
        }
    }
}
public class Employees{
    public static void main(String[] args) {
        Employee.putToday(20230403);
        SalariedEmployee ji=new SalariedEmployee("蔡徐坤",20040706,6000);
        HourlyEmployee lbw=new HourlyEmployee("卢本伟",20000101,60,180);
        SalesEmployee dvv=new SalesEmployee("邓伟为",20050104,100000,0.1);
        BasePlusSalesEmployee adai=new BasePlusSalesEmployee("晏泽君",20040101,100000,0.1,2000);
        ji.getSalary(12);
        lbw.getSalary(10);
        dvv.getSalary(12);
        adai.getSalary(12);
    }
}
