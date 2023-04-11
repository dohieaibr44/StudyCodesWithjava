public class Record {
    Student s=new Student();
    MyException myException=new MyException();
    void inputScore(Student s){
        s.setScore();
        System.out.println("成绩修改完毕");
    }
    void getScore(Student s){
        for(int i=0;i<=2;i++){
            try{
                myException.ifFailed(s.getScore()[i]);
            }catch (ScoreFailException scoreFailException){
                System.out.println(scoreFailException.getMessage());
                s.setScore(0,i);
                System.out.println("成绩修改完毕");
            }
        }
        System.out.println("学号："+s.getId()+"，姓名："+s.getName()+"，成绩：语文"+s.getScore()[0]+"，数学"+s.getScore()[1]+"，英语"+s.getScore()[2]);

    }
}
class MyException{
    public void ifFailed(int scores) throws ScoreFailException{
        if(scores<60&&scores>=0){
            throw new ScoreFailException("成绩不合格");
        }
    }
}