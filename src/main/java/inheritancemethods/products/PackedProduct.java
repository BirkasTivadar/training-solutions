package inheritancemethods.products;


import java.math.BigDecimal;

public class PackedProduct extends Product {
    private int packingUnit;
    private BigDecimal weightOfBox;

    public PackedProduct(String name, BigDecimal unitWeight, int numberOfDecimals, int packingUnit, BigDecimal weightOfBox) {
        super(name, unitWeight, numberOfDecimals);
        this.packingUnit = packingUnit;
        this.weightOfBox = weightOfBox;
    }

    public int getPackingUnit() {
        return packingUnit;
    }

    public BigDecimal getWeightOfBox() {
        return weightOfBox;
    }

    @Override
    public BigDecimal totalWeight(int pieces) {
        int numberOfBoxes = 1;
        int restPieces = pieces;
        while(restPieces > packingUnit){
            numberOfBoxes++;
            restPieces -= packingUnit;
        }
        System.out.println(numberOfBoxes);
        return super.totalWeight(pieces).add(weightOfBox.multiply(new BigDecimal(String.valueOf(numberOfBoxes))));
    }
}
