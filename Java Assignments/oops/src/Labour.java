public class Labour extends Employee{
    int overtime;

    @Override
    public int getSalary() {
        return salary+=overtime;
    }
}
