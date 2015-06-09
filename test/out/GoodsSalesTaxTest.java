package out;


import org.junit.Assert;
import org.junit.Test;

public class GoodsSalesTaxTest {
    @Test
    public void ShouldReturnZeroSalesTaxPercentageForFood() {
        GoodsSalesTax goodsSalesTax = new GoodsSalesTax();
        String FirstGoods = "Chocolate Bar";

        double actualSalesTax = goodsSalesTax.SalesTaxForExcumption(FirstGoods);

        Assert.assertEquals(0.0d, actualSalesTax, 0.0d);

    }

    @Test
    public void ShouldReturnTenSalesTaxPercentageForOthers() {
        GoodsSalesTax goodsSalesTax = new GoodsSalesTax();
        String FirstGoods = "music CD";

        double actualSalesTax = goodsSalesTax.SalesTaxForExcumption(FirstGoods);

        Assert.assertEquals(0.1d, actualSalesTax, 0.0d);

    }


}