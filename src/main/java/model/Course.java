package model;

import java.util.List;
import java.util.Locale;

import javax.validation.constraints.NotNull;


/**
 * Objet course décrivant un cours à l'université de Paris Dauphine.
 * Inspiré par le fichier référentiel de l’Offre de Formation (ROF) 
 * mais de façon simplifié
 * https://raw.githubusercontent.com/oliviercailloux/projets/master/Voeux/OF_MEA5STI.xml
 *  @author tuzam
 */
public class Course {
	
	@NotNull(message="l'id du cours ne peut pas être vide")
	/**
	 *  Identifiant course ne pouvant pas
	 *  être null.
	 */
	private String courseId;
	
	/**
	 *  Déscription de l'enseignement 
	 */
	private String courseDescription;
	
	/**
	 *  le nom de l'enseignement exemple : Agilité
	 */
	private String courseName;
	
	/**
	 *  Langage du cours
	 *  Utilisation de l'objet Locale pour eviter de faire
	 *  une enumeration de type FR : FRANCAIS
	 *                          EN : ANGLAIS
	 */
	private Locale  instructionLanguage;

	/**
	 *  List des crédits concernant le cours 
	 *  Exemple TP 36h
	 *          CM 20h ...
	 */
	private List<CourseCredit> credits;
	
	
	
	
	public Course(String courseId, String courseDescription, String courseName, Locale instructionLanguage,
			List<CourseCredit> credits) {
		super();
		this.courseId = courseId;
		this.courseDescription = courseDescription;
		this.courseName = courseName;
		this.instructionLanguage = instructionLanguage;
		this.credits = credits;
	}



	@Override
	/**
	 *  Rédefinition du toString pour avoir un affichage textuelle d'un cours
	 */
	public String toString() {
		return "Course [courseId=" + courseId + ", courseDescription=" + courseDescription + ", courseName="
				+ courseName + ", instructionLanguage=" + instructionLanguage + ", credits=" + credits + "]";
	}
		
	
	
	// GET ET SET
	
	
	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Locale getInstructionLanguage() {
		return instructionLanguage;
	}

	public void setInstructionLanguage(Locale instructionLanguage) {
		this.instructionLanguage = instructionLanguage;
	}

	public List<CourseCredit> getCredits() {
		return credits;
	}

	public void setCredits(List<CourseCredit> credits) {
		this.credits = credits;
	}


	
	
	
	

}
