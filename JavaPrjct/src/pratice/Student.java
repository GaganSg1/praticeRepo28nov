package pratice;

public class Student {
	private String Name;
	private int RollNo;
	
	public void setName(String Name)
	{this.Name=Name;
}
	public void setRollNo(int Rollno) {
		this.RollNo=Rollno;
	}
	public String getName()
	{return Name;
		
	}
	public int getRollNo()
	{return  RollNo;
		}
	class MainClass
	{
		public static void main(String[] args) {
			Student Std=new Student();
			Std.setName("GAGAN_SG");
			Std.setRollNo(307337);
			System.out.println( "Strudent Name is"+Std.getName()+"Roll No Is"+Std.getRollNo());
		}
	}
	}
	
