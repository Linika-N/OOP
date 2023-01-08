package Practice_3;

import java.util.ListIterator;

public class GroupListIterator implements ListIterator<Student>{
    private int index=-1;
    private Group studentGroup;


    public GroupListIterator(Group studentGroup) {
        this.studentGroup = studentGroup;
    }


    @Override
    public boolean hasNext() {
        return this.index < this.studentGroup.groupLenght()-1;
    }


    @Override
    public Student next() {
        this.index++;
        return this.studentGroup.getStudent(this.index);
    }


    @Override
    public int nextIndex() {
        return this.index++;
    }


    @Override
    public boolean hasPrevious() {
        // TODO Auto-generated method stub
        return false;
    }


    @Override
    public Student previous() {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public int previousIndex() {
        // TODO Auto-generated method stub
        return 0;
    }


    @Override
    public void remove() {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void set(Student e) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void add(Student e) {
        // TODO Auto-generated method stub
        
    }





}
