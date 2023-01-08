// Класс Группа содержит в себе коллекцию Студентов. По группе можно перемещаться с помощью итератора.
// (Это повторяет 1-ю задачу из классной работы). Остальные задачи надстраиваются поверх неё.
// Создайте класс GroupListIterator, который позволяет перемещаться по группе в обоих направлениях. Он реализует интерфейс ListIterator<Student>.
// Добавьте в Группу метод listIterator (), который позволяет начать итерацию с помощью GroupListIterator.

// Создайте класс ReverseIterator, который работает как итератор по группе в обратном направлении:
// • Он отслеживает текущую позицию в переборе
// • Он изначально выставлен на конечную позицию
// • Он движется справа налево
// Проверьте, как он работает.
package Practice_3;

import java.util.*;
// import java.util.Date;
// import java.util.List;



public class Main {
    public static void main(String[] args) {
        Student one = new Student("Иванов", 4.8f, "1985-04-01");
        Student two = new Student("Петров", 4.3f,"1985-08-01");
        Student three = new Student("Сидоров", 4.5f,"1985-04-01");

        List<Student> studentList = new ArrayList<>();
        studentList.add(one);
        studentList.add(two);
        studentList.add(three);

        Group studentGroup = new Group(studentList);

        Iterator<Student> groupIterator= new GroupListIterator(studentGroup);
        

        while(groupIterator.hasNext()){
            System.out.println(groupIterator.next());
        }
        System.out.println("_________________________________");
        Iterator<Student> groupReverseIterator = new ReverseGroupListIterator(studentGroup);
        
        
        while (groupReverseIterator.hasNext()) {
            System.out.println(groupReverseIterator.next());
        }
    }
    
}