package io.github.sandra;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.Course;
import model.CourseCredit;
import model.TeachingType;

public class App {
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		new App().proceed();
		
		// Test création d'un crédit 
		CourseCredit courseCredit = new CourseCredit(TeachingType.CM, 36);
		// Creation d'une liste de credit et ajout de courseCredit
		List<CourseCredit> credits = new ArrayList<CourseCredit>();
		credits.add(courseCredit);
		
		// exemple creation de cours
		Course course = new Course("ID1", "description test", "Agilité", Locale.FRENCH, credits );
		
		// Exemple d'affichage de course : 
		LOGGER.info(course.toString());
		
	}

	public void proceed() {
		LOGGER.info("Hello World!");
	}
}
