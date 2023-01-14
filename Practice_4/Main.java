package Practice_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

// Создайте интерфейс IsGood<T>. Внутри него содержится единственная функция:
// boolean isGood (T item);
// Смысл этого интерфейса: ему дают элемент, он его одобряет или не одобряет.
// Создайте следующие детские классы:
// • IsEven — ему дают целое число, он одобряет его, если оно чётное
// • IsPositive — ему дают целое число, он одобряет его, если оно положительное
// • BeginsWithA — ему дают строку, он одобряет её, если она начинается с буквы A
// • BeginsWith — в конструкторе запоминает строку. Ему дают строку, он проверяет, что она начинается с того, что он запомнил

// Создайте обобщённую функцию filter. Ей дают любую коллекцию любого типа, и одобрятель IsGood.
// Функция возвращает новую коллекцию, куда входят только одобренные элементы из коллекции.
// Продемонстрируйте, что это работает.
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();

        //Фильтр по одобрятелю IsEven
        ArrayList<Integer> list = arrayListInt(rnd);
        System.out.println(list);
        list = (ArrayList<Integer>) filter(list, new IsEven());
        System.out.println(list);

        //Фильтр по одобрятелю IsPositive
        ArrayList<Integer> list2 = arrayListInt(rnd);
        System.out.println(list2); 
        list2 = (ArrayList<Integer>) filter(list2, new IsPositive());
        System.out.println(list2); 

        //Фильтр по одобрятелю BeginWithA
        LinkedList<String> linkList = linkedListString(rnd);
        System.out.println(linkList);
        LinkedList<String> listA = (LinkedList<String>) filter(linkList, new BeginWithA());
        System.out.println(listA);

        //Фильтр по одобрятелю BeginWith
        LinkedList<String> linkList2 = linkedListString(rnd);
        System.out.println(linkList2);
        LinkedList<String> listB = (LinkedList<String>) filter(linkList2, new BeginWith("vpfou"));
        System.out.println(listB);

    }
    public static <T> Iterable<T> filter(Iterable<T> array, IsGood<T> isGood){
        Iterator<T> iterator = array.iterator(); 
        while (iterator.hasNext()) {
            if(!isGood.isGood(iterator.next())){
                iterator.remove();
            }
        }
        return array;
    }

    public static ArrayList<Integer> arrayListInt(Random rnd) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < rnd.nextInt(5,20); i++) {
            list.add(rnd.nextInt(-50,50));
        }
        return list;
    }
    public static LinkedList<String> linkedListString(Random rnd) {
        LinkedList<String> linkList = new LinkedList<String>();
        linkList.add("cbdhsf");
        linkList.add("abjk");
        linkList.add("cxlkhfsio");
        linkList.add("sytfgd");
        linkList.add("vpfou");
        linkList.add("adfeu");
        linkList.add("pogkl");
        linkList.add("arhlkg");
        linkList.add("vpfouidfjjgk");
        linkList.add("vpfoufoufkg");
        linkList.add("vpfousfp;jl;f");
        return linkList;
    }
}
