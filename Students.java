package week3.day1;

public class Students {
	public static void main(String[] args) {
		Students students=new Students();
		students.studentInfo(1029);
		students.studentInfo(1029,"Vaishnavi");
		students.studentInfo("vaish09nithi@gmail.com",9998876541L);
	}
public void studentInfo(int id)
{
	System.out.println("The ID is" + " "+id);
}
public void studentInfo(int id, String name)
{
	System.out.println("The ID and name is" + " "+ id + " " + "and" + " " + name);
}
public void studentInfo(String emailid, long phno)
{
	System.out.println("The email id and phone no. is" + " "+ emailid + " " + "and" + " "+ phno);
}
}
