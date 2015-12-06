package edu.iut.app;

public class Classroom {
	
	public Classroom() {
		classRoomNumber="not affected";
	}
	/**
	 * 
	 * @param classRoomNumber
	 * Affectation de la classe
	 */
	public Classroom(String classRoomNumber) {
		/* EX2: AFFECTATION */;
		this.classRoomNumber = classRoomNumber;
	}
	
	public void setClassroomNumber(String number) {
		/* EX2: AFFECTATION */;
		this.classRoomNumber = number ;
	}
	/**
	 * 
	 * @return number 
	 * Renvoie le numero de la salle
	 */
	public String getClassRoomNumber() {
		return classRoomNumber;
	}
	
	protected String classRoomNumber;
}
