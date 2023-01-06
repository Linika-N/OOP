package Practice_2;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;


public class JSONFileWriter extends FileWriterH{
    private String extension = ".json";
    private String textFile;

    public JSONFileWriter(String filename, List<Student> students) {
        super(filename, students);
    }
    
    @Override
    public void writeStudents() {
        textFile = super.getFilename() + extension;
        String filePath = System.getProperty("user.dir") + "\\Practice_2\\" +textFile;
        try {
            FileWriter fw = new FileWriter(filePath,StandardCharsets.UTF_8);
            List<Student> students = super.getStudents();
            fw.append(jsonStart());
            for (int i = 0; i < students.size(); i++) {
                Student student = students.get(i);
                if (i!= students.size()-1)
                    fw.append("\t\"" + this.stringFormat(student)+"\":" + Float.toString(student.getMiddleScore()) + ",\n"); 
                else
                fw.append("\t\"" + this.stringFormat(student)+"\":" + Float.toString(student.getMiddleScore()) + "\n"); 
            }
            fw.append(jsonEnd());
            fw.close();
            System.out.println("Файл записан");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String stringFormat(Student student){
        return student.getName() + " " + student.getSurname();
    }
    public String jsonStart(){
        return "{\n";
    }
    public String jsonEnd(){
        return "}";
    }
}
