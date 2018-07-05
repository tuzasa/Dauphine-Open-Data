package servlet;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.Course;
import model.CourseCredit;
import model.TeachingType;

/**
 * Servlet pour essayer de construire un cours
 * Servlet temporaire pour le développement
 * à supprimer par la suite
 */
@WebServlet("/course")
public class CourseServlet extends HttpServlet {

	/**
	 *  Ajout du système de log pour afficher dans log server
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CourseServlet.class);

	@Override
	/**
	 *  Redefinition du doGet afin de faire un affichage sur le navigateur
	 *  inspiré par l'exemple d'Olivier Cailloux
	 *  https://raw.githubusercontent.com/oliviercailloux/samples/master/JavaEE-Servlets/src/main/java/io/github/oliviercailloux/javaee_servlets/servlets/SayHelloServlet.java
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding(StandardCharsets.UTF_8.name());
		resp.setContentType(MediaType.TEXT_PLAIN);
		resp.setLocale(Locale.FRENCH);
		final ServletOutputStream out = resp.getOutputStream();

		// Test création d'un crédit 
		CourseCredit courseCredit = new CourseCredit(TeachingType.CM, 36);
		// Creation d'une liste de credit et ajout de courseCredit
		List<CourseCredit> credits = new ArrayList<CourseCredit>();
		credits.add(courseCredit);

		// exemple creation de cours
		Course course = new Course("ID1", "description test", "Agilité", Locale.FRENCH, credits );

		// Exemple de log affichage de course : 
		LOGGER.info("Affichage LOG d'un cours : "+ course.toString());

		out.println("Exemple d'affichage d'un cours sous forme textuelle ");
		
		out.println(course.toString());

	}
}