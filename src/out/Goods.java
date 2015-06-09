package out;

public class Goods {
    private boolean imported;
    private String name;
    private double price;

    Goods(boolean imported,String name,double price)
    {
        this.imported=imported;
        this.name=name;
        this.price=price;
    }

    public double computeSalesTaxAddedToPrice()
    {
        GoodsSalesTax salesTax=new GoodsSalesTax();
        return price+price*salesTax.SalesTaxForExcumption(name);

    }

    public double computeImportExportDuty(){
        if (imported)
        {
            return 0.05*price;
        }
        return 0.0d*price;
    }

}
