import java.util.ArrayList;

public class Student {
    private String name;
    private int id;
    private int age;
    private String dateOfBirth;
    private Course courses;
    private ArrayList<Module> modules = new ArrayList<Module>();

    public Student(String name, int id, int age, String dateOfBirth, Course courses, ArrayList<Module> modules) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.courses = courses;
        this.modules = modules;
    }

    public Student(String name, int id, int age, String dateOfBirth) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return name + age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Course getCourses() {
        return courses;
    }

    public void setCourses(Course courses) {
        this.courses = courses;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public void addModule(Module module){
        modules.add(module);
    }
}
