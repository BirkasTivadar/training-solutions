package week12d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodsPackerTest {

    @Test
    void testWithNullGoods() {
        GoodsPacker goodsPacker = new GoodsPacker();
        int[][] goods = null;

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> goodsPacker.packGoods(goods, 1));
        assertEquals("Types must not be null", iae.getMessage());
    }

    @Test
    void testWithNullGood() {
        GoodsPacker goodsPacker = new GoodsPacker();
        int[][] goods = {{7, 160}, null, {2, 15}};

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> goodsPacker.packGoods(goods, 1));
        assertEquals("Every element of types must not be null.", iae.getMessage());
    }

    @Test
    void testWithMinusCapacity() {
        GoodsPacker goodsPacker = new GoodsPacker();
        int[][] goods = {{7, 160}, {3, 90}, {2, 15}};

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> goodsPacker.packGoods(goods, -1));
        assertEquals("Capacity must be larger than zero.", iae.getMessage());
    }

    @Test
    void testGoodsSort() {
        GoodsPacker goodsPacker = new GoodsPacker();
        int[][] goods = {{7, 160}, {3, 90}, {2, 15}};

        assertEquals(555, goodsPacker.packGoods(goods, 20));
    }

    @Test
    void testGoodsSortWithRemainCapacity() {
        GoodsPacker goodsPacker = new GoodsPacker();
        int[][] goods = {{7, 160}, {3, 90}, {2, 15}};

        assertEquals(540, goodsPacker.packGoods(goods, 19));
    }

}