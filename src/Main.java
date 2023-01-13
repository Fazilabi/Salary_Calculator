public class Main {
    public static void main(String[] args) {
        Employee em1 =new Employee("A",2000,45,2020);
        Employee em2 =new Employee("B", 1000, 50, 2015);

        /*em1.tax();
        em1.raiseSalary();
        em1.bonus();

         */
        em1.toStringEmployee();
        em2.toStringEmployee();



    }
}