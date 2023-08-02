package management;

public class Director extends Manager{

    private double budget;
    public Director(String name, String NInumber, int salary, String deptName, double budget) {
        super(name, NInumber, salary, deptName);
        this.budget = budget;

    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
