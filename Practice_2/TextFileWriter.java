package Practice_2;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class TextFileWriter extends FileWriterH {
    private String extension = ".txt";
    private String textFile;


    public TextFileWriter(String filename, List<Student> students) {
        super(filename, students);
    }
    
    
    @Override
    public void writeStudents() {
        textFile = super.getFilename() +extension;
        String filePath = System.getProperty("user.dir") + "\\Practice_2\\" +textFile;
        try {
            FileWriter fw = new FileWriter(filePath,StandardCharsets.UTF_8);
            StringBuilder sb = new StringBuilder();
            List<Student> studentList = super.getStudents();
            for (Student student: studentList){
                String str = stringFormat(student);
                sb.append(str + "\n");
            }
            fw.write(sb.toString());
            fw.close();
            System.out.println("Файл записан");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String stringFormat(Student student){
        return student.getName() + " " + student.getSurname() + "=" + Float.toString(student.getMiddleScore());
    }  
}
