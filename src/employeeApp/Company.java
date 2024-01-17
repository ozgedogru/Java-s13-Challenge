package employeeApp;
import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private int giro;
    private String[] developerNames;

    public Company(int id, String name, int giro) {
        this.id = id;
        this.name = name;
        this.giro = Math.max(0, giro); // Ensure giro is not below 0
        this.developerNames = new String[5]; // Assuming a fixed size of 5 for developerNames array
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

    public int getGiro() {
        return giro;
    }

    public void setGiro(int giro) {
        this.giro = Math.max(0, giro);
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Invalid index.");
            return;
        }

        if (developerNames[index] == null) {
            developerNames[index] = name;
        } else {
            System.out.println("Index is already occupied.");
        }
    }

    @Override
    public String toString() {
        return "Company [id=" + id + ", name=" + name + ", giro=" + giro + ", developerNames="
                + Arrays.toString(developerNames) + "]";
    }
}
