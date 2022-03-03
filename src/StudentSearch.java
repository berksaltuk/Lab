import java.util.ArrayList;

public class StudentSearch {
    public boolean studentExists(ArrayList<Student> students, String id) throws Exception {
        if (students.isEmpty()) {
            throw new Exception("Students list should not be empty!");
        }
        for (Student student: students)
            if (student.getId().equals(id))
                return true;

        return false;
    }

    public Student findOne(ArrayList<Student> students, String name) throws Exception {
        for (Student student: students)
            if (student.getName().equals(name))
                return student;
        
        throw new Exception("There is no student with the given name!");
    }

    public ArrayList<Student> findAll(ArrayList<Student> students, String name) throws Exception { // COMMENT
        ArrayList<Student> result = new ArrayList<Student>();
        for (Student student: students) // ALSO COMMENT
            if (student.getName().equals(name)) {
                result.add(student);
            }

        if (result.isEmpty()) { // DETAILED COMMENT
            throw new Exception("There is no student with the given name!");
        }
        return result;
    }

}
