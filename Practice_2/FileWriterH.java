package Practice_2;

import java.util.List;

public abstract class FileWriterH {
    private String filename;
    private List<Student> students;

    public FileWriterH(String filename, List<Student> students) {
        this.filename = filename;
        this.students = students;
    }

    public abstract void writeStudents();
    public abstract String stringFormat(Student student);


    public String getFilename() {
        return filename;
    }

    public List<Student> getStudents() {
        return students;
    }
}
