public class Main {
    public static void main(String[] args) {
        PersonModel<Student> st = new PersonModel<>();
        st.add(new Student("123", "K", 21));
        st.display();

        PersonModel<Employee> em = new PersonModel<>();
        em.add(new Employee("e164", "J", 10000000));
        em.display();
    }
}
