package org.college;

public class College extends Student {

	public void collegeName() {
    System.out.println("College Name: SNS");
	}
	
	public void collegeCode() {
    System.out.println("College Code: 2761");
    
	}
	
	public void collegeRank() {
   System.out.println("College Rank: 5");
   
	}
	
	public static void main(String[] args) {

		
		College c = new College();
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		c.studentName();
		c.studentId();
		c.studentDept();
		c.hostelName();
		c.deptName();
		
		
	}

}
