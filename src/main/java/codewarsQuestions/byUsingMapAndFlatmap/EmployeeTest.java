package codewarsQuestions.byUsingMapAndFlatmap;

public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeData employeeData = new EmployeeData();
        employeeData.readAll().stream().map(Employee::getEmpName)
                .forEach(System.out::println);

        employeeData.readAll().stream().map(Employee::getEmId)
                .forEach(System.out::println);

        employeeData.readAll().stream().flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

    }
}
