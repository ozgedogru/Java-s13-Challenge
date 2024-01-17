package employeeApp;

public class Healthplan {
    private int id;
    private String name;
    private PlanType plan;

    public Healthplan(int id, String name, PlanType plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlanType getPlan() {
        return plan;
    }

    public void setPlan(PlanType plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "Healthplan [id=" + id + ", name=" + name + ", plan=" + plan + "]";
    }
}

enum PlanType {
    BASIC, STANDARD, PREMIUM
}
