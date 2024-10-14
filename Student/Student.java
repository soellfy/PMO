package Student;

public class Student {

	private String 	name;
	private String	surname;
	private int		id,
					matriculationYear;
	
	public Student(String name, String surname, int id, int matriculationYear) {
		
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.matriculationYear = matriculationYear;
    }

    public void printStudentInfo() {
        System.out.println("Name : " + this.name);
        System.out.println("Surname : " + this.surname);
        System.out.println("id : " + this.id);
        System.out.println("matriculationYear : " + this.matriculationYear);
    }
}


