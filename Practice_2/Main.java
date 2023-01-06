package Practice_2;

import java.util.ArrayList;
import java.util.List;

/**
 * Имеются данные о группе студентов. У каждого студента есть средний балл (например, 4.6).
Создайте родительский класс ЗаписывательВФайл. Создайте три детских класса, которые записывают в файл информацию о студентах в разных формах:

Просто текст:

Иван Иванов=4.8
Мария Кузнецова=5.0
Степан Кузьмин=3.6

JSON:

{
"Иван Иванов": 4.8,
"Мария Кузнецова": 5.0,
"Степан Кузьмин": 3.6
}

XML:

<?xml version="1.0" encoding="utf-8" ?>
<students>
<student>
<name>Иван Иванов</name>
<grade>4.8</grade>
</student>
<student>
<name>Мария Кузнецова</name>
<grade>5.0</grade>
</student>
<student>
<name>Степан Кузьмин</name>
<grade>3.6</grade>
</student>
</students>
 */
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Иван", "Иванов", 4.8f));
        students.add(new Student("Мария", "Кузнецова", 5.0f));
        students.add(new Student("Степан", "Кузьмин", 3.6f));


        FileWriterH txt = new TextFileWriter("file", students);
        txt.writeStudents();
        FileWriterH xml = new XMLFileWriter("file", students);
        xml.writeStudents();
        FileWriterH json = new JSONFileWriter("file", students);
        json.writeStudents();
    }
}
