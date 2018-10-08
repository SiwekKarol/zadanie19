public class Nauczyciel extends UniversityPerson{

        private double salary;

        public Nauczyciel(String firstName, String lastName, double salary) {
            super(firstName, lastName);
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        @Override
        public void show() {
            super.show();
            System.out.println(salary);
        }
    }