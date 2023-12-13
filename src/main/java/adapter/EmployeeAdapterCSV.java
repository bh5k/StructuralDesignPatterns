package adapter;

public class EmployeeAdapterCSV implements Employee {

    private final EmployeeCSV employeeFromCSV;
    public EmployeeAdapterCSV(EmployeeCSV employeeFromCSV) {
        this.employeeFromCSV = employeeFromCSV;
    }

    @Override
    public String getId() {
        return String.valueOf(employeeFromCSV.getId());
    }

    @Override
    public String getFirstName() {
        return employeeFromCSV.getFirstname();
    }

    @Override
    public String getLastName() {
        return employeeFromCSV.getLastname();
    }

    @Override
    public String getEmail() {
        return employeeFromCSV.getEmailAddress();
    }
}
