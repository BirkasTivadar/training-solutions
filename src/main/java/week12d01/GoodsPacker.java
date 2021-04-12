package week12d01;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsPacker {

    public int packGoods(int[][] types, int capacity) {
        List<Goods> temp = loadList(types);
        Collections.sort(temp);
        return getMaxValue(temp, capacity);
    }

    private int getMaxValue(List<Goods> temp, int capacity) {
        int result = 0;
        int remainCapacity = capacity;
        for (Goods good : temp) {
            int db = remainCapacity / good.getWeight();
            remainCapacity -= db * good.getWeight();
            result += db * good.getPrice();
        }
        return result;
    }

    private List<Goods> loadList(int[][] types) {
        List<Goods> goods = new ArrayList<>();
        for (int i = 0; i < types.length; i++) {
            goods.add(new Goods(types[i][0], types[i][1]));
        }
        return goods;
    }
}
