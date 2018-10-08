public class Student extends UniversityPerson {

    private int indexNumber;

    public Student(String firstName, String lastName, int indexNumber) {
        super(firstName, lastName);
        this.indexNumber = indexNumber;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    @Override
    public void show() {
        super.show();
        System.out.println(indexNumber);
    }
}