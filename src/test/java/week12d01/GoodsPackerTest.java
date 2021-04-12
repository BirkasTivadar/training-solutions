package week12d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodsPackerTest {

    @Test
    void testGoodsSort() {
        GoodsPacker goodsPacker = new GoodsPacker();
        int[][] goods = {{7, 160}, {3, 90}, {2, 15}};
        assertEquals(555, goodsPacker.packGoods(goods, 20));

    }

}