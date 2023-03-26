import java.util.Scanner;
import java.util.Calendar;
public class S{
	public static void main(String[] str){
		Scanner inweeks =new Scanner(System.in);
		String weeks = inweeks.next();
		switch(weeks){
			case "1":System.out.println("today is Monday");
					break;
			case "2":System.out.println("today is Tuseday");
					break;
			case "3":System.out.println("today is Wednesday");
					break;
			case "4":System.out.println("today is Thusday");
					break;
			case "5":System.out.println("today is Friday");
					break;
			case "6":
			case "7":System.out.println("let's go high!");
					break;
			default:System.out.println("what you input is wrong");
		}
		System.out.println("we say today is No."+weeks+" day in this week at class S");
		str[0]=weeks;
		A c=new A();
		c.main(str);
		
	}
}
class A{
	public static void main(String[] str){
		String[] weekDays = {"Sunday", "Monday", "Tuseday", "Wednesday", "Thusday", "Friday", "Saturday"};
		System.out.println("we say today is No."+str[0]+" day in this week at class A");
		Calendar cal = Calendar.getInstance();
		int today = cal.get(Calendar.DAY_OF_WEEK)-1;
		if(today<0)today=0;
		System.out.println("Artually today is "+weekDays[today]+"!!!");
		
}
}
/**
  *
  *
  */
