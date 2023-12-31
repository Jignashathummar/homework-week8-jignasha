package carpet_cost_calculator17;

public class Calculator {
    Floor floor;
    Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        double area = floor.getArea();
        double costPerSquareMeter = carpet.getCost();
        return area * costPerSquareMeter;
    }

}
