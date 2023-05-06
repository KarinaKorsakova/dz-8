import java.util.ArrayList;

public class Group {
    private Student leader(String name, String surname) {
    }

    public ArrayList<String> students() {
        return new ArrayList<>() {{
            add("Іван", "Іванов");
            add("Петро", "Петров");
        }}
    }

    public List<String> tasks() {
        return new ArrayList<>() {{
            add("вивчити інкапсуляцію");
            add("повторити enum");
        }}
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTask(Student task) {
        tasks.add(task);
    }
}



