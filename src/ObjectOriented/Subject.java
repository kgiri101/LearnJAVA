package ObjectOriented;

class SubjectD{
	
	private  String subID;
	private String name;
	private int maxMarks;
	private double marksObtain;
	
	//Property Methods
	
	public SubjectD(String subID, String name, int maxMarks) {
		this.subID =  subID;
		this.name = name;
		this.maxMarks = maxMarks;
	}
	
	public String getSubID() {
		return subID;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMaxMarks() {
		return maxMarks;
	}
	
	public double getMarksObtain() {
		return marksObtain;
	}
	
	public void setMarksObtain(double mk) {
		marksObtain = mk;
	}
	
	public String toString() {
		return "\nSubject ID: " + subID + "\nName: "+ name + "\nMarks Obtained: "+ marksObtain;
	}
}

public class Subject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubjectD s1 = new SubjectD("12ABF", "Fouth Wing", 300);
		s1.setMarksObtain(250);
		
		System.out.println("Subject ID: "+ s1.getSubID() + "\n"+ "Name: "+ s1.getName()+ "\n"+ "Maxmark: "+ s1.getMaxMarks()+ "\n"+ "Marks Obtained: "+ s1.getMarksObtain()+ "\n"
			);
		
		
		//Creating the Arrays of the Subjects
		
		SubjectD subs[] = new SubjectD[3];
		subs[0] = new SubjectD("COSC1010", "Intro to Python" , 100);
		subs[1] = new SubjectD("COSC2030", "C++", 100);
		subs[2] = new SubjectD("COSC3020", "Algorithms", 100);
		
		for(SubjectD s:subs) {
			System.out.println(s);
		}

	}

}
