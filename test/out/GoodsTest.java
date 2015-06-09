package out;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GoodsTest {

    @Test
    public void ShouldComputeSalesTaxForChocolate() {
        Goods chocolate = new Goods(false, "Chocolate Bar", 26);

        double actualSalesTax = chocolate.computeSalesTax();

        Assert.assertEquals(0.0d, actualSalesTax, 0.0d);

    }

    @Test
    public void ShouldComputeSalesTaxForOthers() {
        Goods perfume = new Goods(false, "Perfume", 10);

        double actualSalesTax = perfume.computeSalesTax();

        Assert.assertEquals(1.0d, actualSalesTax, 0.0d);

    }

    @Test
    public void ShouldComputeImportExportDutyForNotImported() {
        Goods perfume = new Goods(false, "Perfume", 10);

        double actualComputeImportExportDuty = perfume.computeImportExportDuty();

        Assert.assertEquals(0.0d, actualComputeImportExportDuty, 0.0d);

    }

    @Test
    public void ShouldComputeImportExportDutyForImported() {
        Goods perfume = new Goods(true, "Perfume", 20);

        double actualComputeImportExportDuty = perfume.computeImportExportDuty();

        Assert.assertEquals(1.0d, actualComputeImportExportDuty, 0.0d);

    }




}