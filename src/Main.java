public class Main {

    public static void main(String[] args) {
        Student student = new Student("Zbyszek", "Ruczaj", 1530);
        Nauczyciel nauczyciel = new Nauczyciel("Januszek", "Bienias", 8567);


        nauczyciel.show();
        student.show();

    }
}
