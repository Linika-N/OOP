package Practice_2;

public class Student {
    private String name, surname;
    private float middleScore;

    
    public Student(String name, String surname, float middleScore) {
        this.name = name;
        this.surname = surname;
        this.middleScore = middleScore;
    }


    @Override
    public String toString() {
        return "Student [name=" + name + ", surname=" + surname + ", middleScore=" + middleScore + "]";
    }


    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public float getMiddleScore() {
        return middleScore;
    }

    
}
