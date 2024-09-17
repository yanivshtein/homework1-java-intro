package cities;

public class Road {
    // The two cities connected by the road
    private City city1, city2;
    // The length of the road
    private int length;

    // Constructor to create a road between two cities with a specified length
    public Road(City city1, City city2, int length) {
        this.length = length;
        this.city1 = city1;
        this.city2 = city2;
        // Connect this road to both cities
        this.city1.connect(this);
        this.city2.connect(this);
    }

    // Getter for the first city
    public City getCity1() {
        return this.city1;
    }

    // Getter for the second city
    public City getCity2() {
        return this.city2;
    }

    // Getter for the road length
    public int getLength() {
        return this.length;
    }
}
