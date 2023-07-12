package ObjectOriented;


class Student{
	public int roll;
	public String name;
	public int course;
	public double m1,m2,m3;
	
	public double total() {
		return m1+m2+m3;
	}
	
	public double average() {
		return total()/course;
	}
	
	public String grade() {
		double perc = (total()/300 )*100;
		if (perc >=90) {
			return "A";
		}else if (perc>=80 && perc <=89) {
			return "B";
		}else if(perc >= 70 && perc < 80) {
			return "C";
		}else {
			return "F";
		}
		
	}
	
	public String toString() {
		return "Roll no: " + roll + "\n" + "Name: " + name + "\n"+ "course: " + course + "\n";
	}
	
}

public class StudentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Lets make a object of the above class
		//We will give the name of the student.
		Student kamal = new Student();
		kamal.roll = 11;
		kamal.name = "Kamal Giri";
		kamal.course = 3;
		kamal.m1 = 86;
		kamal.m2 =  90;
		kamal.m3 = 95;
		
		//print the output
		System.out.println("The Student Name is "+ kamal.name);
		System.out.println("The Roll Number is "+kamal.roll);
		System.out.println("The number of course is "+ kamal.course);
		System.out.println("The total obtained mark is "+ kamal.total());
		System.out.println("The average mark is "+ kamal.average());
		System.out.println("The Grade is "+ kamal.grade());
		
		//We are calling the reference to the object so it will print the pbject details.
		System.out.println("Details: \n" + kamal);
		

	}

}
