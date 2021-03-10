package week08d02;

public class Country implements Comparable<Country>{
    private String name;
    private int population;
    private int coloursOfFlag;
    private int neighbours;

    public Country(String name, int population, int coloursOfFlag, int neighbours) {
        this.name = name;
        this.population = population;
        this.coloursOfFlag = coloursOfFlag;
        this.neighbours = neighbours;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public int getColoursOfFlag() {
        return coloursOfFlag;
    }

    public int getNeighbours() {
        return neighbours;
    }

    @Override
    public int compareTo(Country o) {
        return o.getPopulation()-this.getPopulation();
    }

    @Override
    public String toString() {
        return "Country name: " + name + '\n' + "population: " + population + '\n' + "coloursOfFlag: " + coloursOfFlag + '\n'+ "neighbours: " + neighbours;
    }
}
