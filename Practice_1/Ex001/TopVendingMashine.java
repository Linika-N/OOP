package Practice_1.Ex001;

public class TopVendingMashine extends VendingMashine {
    /**
     * 
     * @param name-           наименование автомата
     * @param productsCodes   - интервал кодов для продуктов
     * @param typeProductFrom - минимальный код товара для данного автомата
     * @param typeProductTo   - максимальный код товара для данного автомата
     */

    private int typeProductFrom;
    private int typeProductTo;

    public TopVendingMashine(String name, String productsCodes) {
        super(name, productsCodes);
        if (!checkCodes(productsCodes))
            throw new IllegalArgumentException("Нельзя создать данный тип автомата - Интервал кодов может быть от 1 до 100");
     
    }

    public boolean checkCodes(String interval) {
        String[] toCheck = interval.trim().split("-");
        if (toCheck.length > 2)
            return false;
        else if (Integer.parseInt(toCheck[0]) < 1 || Integer.parseInt(toCheck[1]) < 100)
            return false;
        else {
            typeProductFrom = Integer.parseInt(toCheck[0]);
            typeProductTo = Integer.parseInt(toCheck[1]);
            return true;
        }

    }

    @Override
    public void addProduct(int code, Product product, int productCode) {
        if (productCode < typeProductFrom || productCode > typeProductTo)
            throw new IllegalArgumentException(
                    "Код товара не подходит для данного типа автомата. Коды товаров для автомата - от 1 до 50");
        else
            super.addProduct(code, product);
    }

    @Override
    public String toString() {
        return "OneKindVendingMashine [name= " + super.getName() + "productsCodes= " + super.getProductsCodes() + "]";
    }

}
