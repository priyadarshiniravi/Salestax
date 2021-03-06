package out;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GoodsListTest {

    @Test
    public void ShouldReturnSumOfPriceWithSalesTaxAndImportDutyForAllNonImported() {
        Goods chocolate = new Goods(false, "Chocolate Bar", 0.85);
        Goods musicCd = new Goods(false, "music CD", 14.99);
        Goods book = new Goods(false, "book", 12.49);
        ArrayList<Goods> goodsList = new ArrayList<>();
        goodsList.add(chocolate);
        goodsList.add(musicCd);
        goodsList.add(book);
        GoodsList goodsListObject = new GoodsList(goodsList);

        double actualTotalCost = goodsListObject.ComputeTotalPrice();

        Assert.assertEquals(29.83d, actualTotalCost, 0.01d);

    }

    @Test
    public void ShouldReturnSumOfPriceWithSalesTaxAndImportDutyForAllImported() {
        Goods chocolate = new Goods(true, "Box of Chocolate", 10.0);
        Goods perfume = new Goods(true, "perfume", 47.50);

        ArrayList<Goods> goodsList = new ArrayList<>();
        goodsList.add(chocolate);
        goodsList.add(perfume);
        GoodsList goodsListObject = new GoodsList(goodsList);

        double actualTotalCost = goodsListObject.ComputeTotalPrice();

        Assert.assertEquals(65.15d, actualTotalCost, 0.05d);

    }

    @Test
    public void ShouldReturnSumOfPriceWithSalesTaxAndImportDutyForBothImportedAndExported() {
        Goods chocolate = new Goods(true, "chocolates", 11.25);
        Goods perfume = new Goods(false, "perfume", 18.99);
        Goods pills = new Goods(false, "headache pills", 9.75);
        Goods anotherPerfume = new Goods(true, "bottle of perfume", 27.99);


        ArrayList<Goods> goodsList = new ArrayList<>();
        goodsList.add(chocolate);
        goodsList.add(perfume);
        goodsList.add(anotherPerfume);
        goodsList.add(pills);
        GoodsList goodsListObject = new GoodsList(goodsList);

        double actualTotalCost = goodsListObject.ComputeTotalPrice();

        Assert.assertEquals(74.68d, actualTotalCost, 0.05d);


    }





}