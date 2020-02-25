public class TestAdd {

    private String name;
    private int empId;
    private int salary;

    public TestAdd(int id, String name, int salary){
        this.empId = id;
        this.name = name;
        this.salary = salary;
    }

    public boolean equals(Object obj){
        TestAdd employee = (TestAdd) obj;
        boolean status = false;
        if(this.name.equalsIgnoreCase(employee.name)
                && this.empId == employee.empId
                && this.salary == employee.salary){
            status = true;
        }
        return status;
    }

    public static String getEmpNameWithHighestSalary(){

        return "Ayabulela";
    }

    public static TestAdd getHighestPaidEmployee(){

        return new TestAdd(1, "Ayabulela", 15000);
    }

    public int hashCode(){
        return this.empId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

}