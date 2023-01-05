
package Practice_1.Ex001;

public class OneKindVendingMashine extends VendingMashine{
/**
 * 
 * @param name- наименование автомата
 * @param productsCodes - интервал кодов для продуктов
 * @param typeProduct - тип товара для данного автомата
 */

    private int typeProduct;
    public OneKindVendingMashine(String name, String productsCodes) {
        super(name, productsCodes);
        if (!checkCodes(productsCodes))
            throw new IllegalArgumentException("Нельзя создать данный тип автомата - должен быть только один код товаров");
        
    }
    public boolean checkCodes(String interval) {
        String[] toCheck = interval.trim().split("-");
        if (toCheck.length>1){
            return false;
        }else {
            typeProduct=Integer.parseInt(toCheck[0]);
            return true;
        }
        
    }
    

    @Override
    public void addProduct(int code, Product product, int productCode) {
        if (productCode != typeProduct)
            throw new IllegalArgumentException("Код товара не подходит для данного типа автомата");
        else
            super.addProduct(code, product);
    }
    @Override
    public String toString() {
        return "OneKindVendingMashine [name= " + super.getName() + "productsCodes= " + super.getProductsCodes()+ "]";
    }
    
    
}
