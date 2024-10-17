package Student;

public class TestStudent {
	  public static void main(String[] args) {
	      Student student = new Student("Maksym", "Lesyuk", 99999, 2023);

	      student.printStudentInfo();
	      
	      Student student1 = new Student("Luigi", "Gentile", 1015, 2019);
	      Student student2 = new Student("Simone", "Bianchi", 1016, 2018);
	      Student student3 = new Student("Andrea", "Bracci", 1017, 2017);
	      
	      student1.printStudentInfo();
	      student2.printStudentInfo();
	      student3.printStudentInfo();
	      /*
	       * Creare dei nuovi oggetti relativi agli studenti:
	       *
	       * - Nome: Luigi Cognome: Gentile id: 1015, matriculationYear: 2019
	       * - Nome: Simone Cognome: Bianchi id: 1016, matriculationYear: 2018
	       * - Nome: Andrea Cognome: Bracci id: 1017, matriculationYear: 2017
	       *
	       * Stampare a video le informazioni relative a ciascuno studente.
	       */
	  }
	}