package Practice_1.Ex001;

import java.util.Scanner;

// Выявите и реализуйте классы для следующей задачи. Пропишите необходимый минимум полей и методов. Пока что оставьте методы пустыми.
// Торговый автомат содержит в себе набор товаров. Покупатель вводит номер товара. Автомат высвечивает стоимость товара. 
// Покупатель его оплачивает. Из лотка выпадает заказанный товар.

// Доработайте задание №1:
// Проверьте все модификаторы видимости в ваших классах.
// Пропишите тела методов. Напишите main(), который демонстрирует, как работает торговый автомат.

// Создайте несколько классов товаров. Они все наследуют от родительского класса Product. Товары обладают дополнительными характеристиками,
// которые отображаются в toString ().
// Загрузите в автомат много разнообразных товаров.

// Создайте три класса торговых автоматов. Используйте переопределение методов в детских классах.
// Большой торговый автомат — допускаются коды товаров от 0 до 99.
// Средний торговый автомат — допускаются коды товаров от 0 до 49.
// Торговый автомат, загруженный одним типом товаров. В этом случае нет нужды указывать код товара.

// При решении этих задач следуйте принципам абстракции, инкапсуляции, наследования, полиморфизма.
// Создайте унаследованный класс ГорячийНапиток с дополнительным полем int температура.
// Создайте класс АвтоматГорячихНапитков, реализующий интерфейс ТорговыйАвтомат и реализуйте перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт, соответствующий имени, объему и температуре.
// В main проинициализируйте несколько ГорячихНапитков и АвтоматГорячихНапитков и позвольте покупателю купить товар.
/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        hotDrinkMashine(scan);
        oneKindMashine(scan);
        topMashine(scan);
        middleMashine(scan);
        scan.close();
    }
    public static void hotDrinkMashine(Scanner scan) {
        System.out.println("Автомат горячих напитков");
        HotDrinkVendingMashine hd = new HotDrinkVendingMashine("HotDrink");
        HotDrink americano = new HotDrink("Американо", 119,6);
        americano.setVolume(0.3f);
        americano.setTemperature(62.5f);
        HotDrink cappuccino = new HotDrink("Капучино", 135,13);
        cappuccino.setVolume(0.4f);
        cappuccino.setTemperature(64.3f);
        HotDrink latte = new HotDrink("Латте", 170,8);
        latte.setVolume(0.4f);
        latte.setTemperature(63.7f);
        HotDrink fw = new HotDrink("Флет Уайт", 126,25);
        fw.setVolume(0.25f);
        fw.setTemperature(67.6f);

        
        hd.addProduct(1, (Product)americano);
        hd.addProduct(2, (Product) cappuccino);
        hd.addProduct(3, (Product) latte);
        hd.addProduct(4, (Product) fw);  
        
        deal(hd,scan);
    }
    public static void oneKindMashine(Scanner scan) {
        System.out.println("Автомат с одним типом товаров");
        OneKindVendingMashine okm = new OneKindVendingMashine("OneKind","0");
        okm.addProduct(1, new Product("Сок", 50,6),0);
        okm.addProduct(2, new Product("Печенье", 25,13),0);
        okm.addProduct(3, new Product("Вода", 43,8),0);
        okm.addProduct(4, new Product("Чипсы", 84,25),0);  
        
        deal(okm,scan);
    }
    public static void topMashine(Scanner scan) {
        System.out.println("Большой автомат");
        TopVendingMashine top = new TopVendingMashine("Top", "1-100");
        CarbonatedDrink fanta = new CarbonatedDrink("Фанта", 63,12);
        fanta.setVolume(0.5f);
        CarbonatedDrink sprite = new CarbonatedDrink("Спрайт", 72,9);
        sprite.setVolume(1f);
        CarbonatedDrink cocaCola = new CarbonatedDrink("Кока-кола", 57,17);
        cocaCola.setVolume(0.3f);
        
        top.addProduct(5, (Product) cocaCola,5);
        top.addProduct(6, (Product) fanta,6);
        top.addProduct(7, (Product) sprite,7);
        
        Juice apple = new Juice("Rich", 86, 7);
        apple.setComposition("Яблочный");
        Juice orange = new Juice("Добрый", 69, 13);
        orange.setComposition("Апельсиновый");
        Juice cherry = new Juice("Сады Придонья", 74, 11);
        cherry.setComposition("Вишневый");

        top.addProduct(58, (Product) apple,58);
        top.addProduct(59, (Product) orange,59);
        top.addProduct(60, (Product) cherry,60);
        deal(top,scan);

    }
    public static void middleMashine(Scanner scan) {
        System.out.println("Средний автомат");
        MiddleVendingMashine middle = new MiddleVendingMashine("Middle", "1-50");
        CarbonatedDrink fanta = new CarbonatedDrink("Фанта", 63,12);
        fanta.setVolume(0.5f);
        CarbonatedDrink sprite = new CarbonatedDrink("Спрайт", 72,9);
        sprite.setVolume(1f);
        CarbonatedDrink cocaCola = new CarbonatedDrink("Кока-кола", 57,17);
        cocaCola.setVolume(0.3f);
        
        middle.addProduct(5, (Product) cocaCola,5);
        middle.addProduct(6, (Product) fanta,6);
        middle.addProduct(7, (Product) sprite,7);
        
        Juice apple = new Juice("Rich", 86, 7);
        apple.setComposition("Яблочный");
        Juice orange = new Juice("Добрый", 69, 13);
        orange.setComposition("Апельсиновый");
        Juice cherry = new Juice("Сады Придонья", 74, 11);
        cherry.setComposition("Вишневый");

        middle.addProduct(28, (Product) apple,28);
        middle.addProduct(29, (Product) orange,29);
        middle.addProduct(30, (Product) cherry,30);

        Crisp lays = new Crisp("Lays", 115, 5);
        lays.setFlavour("С крабом");
        Crisp pringles = new Crisp("Pringles", 153, 9);
        pringles.setFlavour("С беконом");
        Crisp russianPotatoes = new Crisp("Русская картошка", 86, 25);
        russianPotatoes.setFlavour("С солью");
        
        middle.addProduct(41, (Product) lays,41);
        middle.addProduct(42, (Product) pringles,42);
        middle.addProduct(43, (Product) russianPotatoes,43);
        deal(middle,scan);
    }
    public static void deal(VendingMashine vm, Scanner scan) {
        System.out.println(vm.getProductSet());
        System.out.println("Добро пожаловать!");
        int userChoice=-1;
        while (userChoice!= 0) {
            System.out.println("Для покупки введите код товара, для отмены покупки введите \"0\":");
            userChoice = vm.buyerChoice(scan);
            if (userChoice!=0){
                Product userProduct = vm.showPrice(userChoice);
                vm.sale(userProduct, scan);
                vm.delivery(userProduct);
                vm.writeOff(userProduct);
            }
        }
    }

}