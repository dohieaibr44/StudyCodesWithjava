import java.util.Scanner;
public class Student {
    int id;
    String name;
    int score[]=new int[3];
    Scanner input=new Scanner(System.in);
    Student(){}
    Student(int id,String name,int n1,int n2,int n3){
        this.id=id;
        this.name=name;
        this.score[0]=n1;
        this.score[1]=n2;
        this.score[2]=n3;
    }
    String getName(){
        return name;
    }
    int getId(){
        return id;
    }
    void setScore(){
        System.out.println("请输入语文成绩");
        int n1=input.nextInt();
        score[0]=n1;
        System.out.println("请输入数学成绩");
        int n2=input.nextInt();
        score[1]=n2;
        System.out.println("请输入英语成绩");
        int n3=input.nextInt();
        score[2]=n3;
    }
    void setScore(int scores,int i){
        this.score[i]=scores;
    }
    int[] getScore(){
        return score;
    }
}