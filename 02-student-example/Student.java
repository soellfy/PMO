class Student {

    // ... Aggiungere qui la definizione dei campi

	private String name;
	private String surname;
	private int id;
	private int matriculationYear;
	
    public Student(String name, String surname, int id, int matriculationYear) {
        // ... Inizializzazione dei campi della classe
    	this.name = name;
    	this.surname = surname;
    	this.id = id;
    	this.matriculationYear = matriculationYear;
    	
    }

    public void printStudentInfo() {
        /*
         * Aggiungere i comandi per la stampa delle informazioni sullo studente
         */
    	System.out.println("Student name : "+this.name);
    	System.out.println("Student surname : "+this.surname);
    	System.out.println("Student id : "+this.id);
    	System.out.println("Student matriculationYear : "+this.matriculationYear);
    }
}
