package streams;

public class Student {
	
	private String Name;
	private int age;
	private double phoneNum;
	private Mark mark;
	
	
	
	public Student() {
	}
	public Student(String name, int age, double phoneNum, Mark mark) {
		super();
		Name = name;
		this.age = age;
		this.phoneNum = phoneNum;
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", age=" + age + ", phoneNum=" + phoneNum + ", mark=" + mark + "]";
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(double phoneNum) {
		this.phoneNum = phoneNum;
	}
	public Mark getMark() {
		return mark;
	}
	public void setMark(Mark mark) {
		this.mark = mark;
	}
	
}
