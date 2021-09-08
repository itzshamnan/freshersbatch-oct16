public class Manager extends Employee {
    int incentive;
    @Override
    public int getSalary() {
        return salary+=incentive;
    }
}