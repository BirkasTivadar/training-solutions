package isahasa.fleet;

public class CargoShip implements Ship, CanCarryGoods {
    private CanCarryGoods canCarryGoods;

    public CargoShip(int maxCarrygoods) {
        this.canCarryGoods = new CanCarryGoodsBehaviour(maxCarrygoods);
    }
}
