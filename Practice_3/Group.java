package Practice_3;

import java.util.*;

public class Group  implements Iterable<Student>{
    private List<Student> studentGroup;

    public Group(List<Student> studentGroup) {
        this.studentGroup = studentGroup;
    }

    public List<Student> getStudentGroup() {
        return studentGroup;
    }
    public int groupLenght(){
        return this.studentGroup.size();
    }
    public Student getStudent(int index){
        return this.studentGroup.get(index);
    }
    public void removeStudent(int index){
        this.studentGroup.remove(index);
    }
    public void setStudent(int index,Student x){
        this.studentGroup.set(index, x);
    }
    public void addStudent(Student x){
        this.studentGroup.add(x);
    }
    
    public ListIterator<Student> listReverseIterator(){
        return new ReverseGroupListIterator(this);
    }


    @Override
    public ListIterator<Student> iterator() {
        return new GroupListIterator(this);
    }
    
}
