package model;

public class CourseCredit {

	/**
	 *  Type de cours (enumeration faite à partir du fichier XML)
	 *  Pas de majuscule à teachingtype pour respecter le format du xml
	 */
	private TeachingType teachingtype;
	
	/**
	 *  valeur d'un crédit , il s'agit du volume horaire du type de cours :
	 *  Exemple pour un type CM  de valeur 36, il s'agit de 36 h de cours de type CM
	 */
	private int value;

	
	public CourseCredit(TeachingType teachingtype, int value) {
		super();
		this.teachingtype = teachingtype;
		this.value = value;
	}

	public TeachingType getTeachingtype() {
		return teachingtype;
	}

	public void setTeachingtype(TeachingType teachingtype) {
		this.teachingtype = teachingtype;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	/**
	 *  toString generé depuis eclipse representant sous forme textuelle un crédit
	 */
	public String toString() {
		return "CourseCredit [teachingtype=" + teachingtype + ", value=" + value + "]";
	}
	
	
	
}
