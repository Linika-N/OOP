package Practice_2;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;


public class XMLFileWriter extends FileWriterH{
    
    private String extension = ".xml";
    private String textFile;
    
    public XMLFileWriter(String filename, List<Student> students) {
        super(filename, students);
    }
    
    @Override
    public void writeStudents() {
        textFile = super.getFilename() + extension;
        String filePath = System.getProperty("user.dir") + "\\Practice_2\\" +textFile;
        try {
            FileWriter fw = new FileWriter(filePath,StandardCharsets.UTF_8);
            List<Student> students = super.getStudents();
            fw.append(xmlStart());
            fw.append(xmlTitleTeg("students"));
            for (Student student: students){
                fw.append("\t" + xmlTitleTeg("student"));
                fw.append(xmlTeg("name")+ this.stringFormat(student)+xmlTeg("name", "/"));

                fw.append(xmlTeg("grade")+Float.toString(student.getMiddleScore())+xmlTeg("grade", "/"));
                fw.append("\t"+ xmlTitleTeg("student", "/"));
            }
            fw.append(xmlTitleTeg("students", "/"));
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
    public String xmlStart(){
        return "<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n";
    }
    public String xmlTitleTeg(String title, String end){
        return "\t<"+ end + title + ">\n";
    }
    public String xmlTitleTeg(String title){
        return "\t<" + title + ">\n";
    }
    public String xmlTeg(String teg, String end){
        return "<"+end + teg + ">\n";
    }
    public String xmlTeg(String teg){
        return "\t\t\t<" + teg + ">";
    }
}
