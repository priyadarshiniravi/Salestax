package out;

import java.util.ArrayList;

public class GoodsList {
    ArrayList<Goods> goodsArrayList = new ArrayList<>();

    public GoodsList(ArrayList<Goods> goodsArrayList) {
        this.goodsArrayList = goodsArrayList;
    }

    double ComputeTotalPrice() {
        double total = 0.0d;
        System.out.println();
        for (Goods goods : goodsArrayList) {
            total = total + goods.computeSalesTaxAddedToPrice() + goods.computeImportExportDuty();
            System.out.println(goods.toString() + (goods.computeSalesTaxAddedToPrice() + goods.computeImportExportDuty()));

        }
        System.out.println(total);
        return total;

    }


}
