package Practice_3;

import java.time.LocalDate;

public class Student {
    private String name;
    private float middleScore;
    private LocalDate dateOfBirth;

    public Student(String name, float middleScore, String dateOfBirth) {
        this.name = name;
        this.middleScore = middleScore;
        this.dateOfBirth = LocalDate.parse(dateOfBirth);
    }

    public String getName() {
        return name;
    }

    public float getMiddleScore() {
        return middleScore;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", middleScore=" + middleScore + ", dateOfBirth=" + dateOfBirth + "]";
    }
    

    
}
