package employeeApp;


public class Main
{
    private static void workWithData() {

        Healthplan healthplan = new Healthplan(1, "MyHealthPlan", PlanType.PREMIUM);


        Employee employee = new Employee(101, "John Doe", "john@example.com", "pass123");
        employee.addHealthplan(0, "BasicHealth");

        Company company = new Company(1001, "ABC Corp", 5000);
        company.addEmployee(0, "Alice Smith");

        System.out.println("Healthplan Info: " + healthplan.toString());
        System.out.println("Employee Info: " + employee.toString());
        System.out.println("Company Info: " + company.toString());
    }


    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
