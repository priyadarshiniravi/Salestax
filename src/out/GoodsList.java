package out;

import java.util.ArrayList;

public class GoodsList {
    ArrayList<Goods> goodsArrayList = new ArrayList<>();

    public GoodsList(ArrayList<Goods> goodsArrayList) {
        this.goodsArrayList = goodsArrayList;
    }

    double ComputeTotalPrice() {
        double total = 0.0d;
        for (Goods goods : goodsArrayList) {
            total = total + goods.computeSalesTaxAddedToPrice() + goods.computeImportExportDuty();
        }
        return total;

    }


}
