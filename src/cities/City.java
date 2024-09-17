package cities;

public class City {
    // The name of the city
    private String name;
    // Array to store connected roads
    private Road[] roads;
    // Number of roads connected to the city
    private int numRoads;

    // Constructor to initialize a city with a name
    public City(String name) {
        this.name = name;
        roads = new Road[10]; // Initial capacity for 10 roads
        numRoads = 0;
    }

    // Connect a road to the city
    public void connect(Road r) {
        if (numRoads < 10) { // Ensure the road count does not exceed the array capacity
            roads[numRoads] = r;
            numRoads++;
        } else {
            System.out.println("Too many roads!");
        }
    }

    // Find the nearest city connected by road
    public City nearestCity() {
        if (numRoads == 0)
            return null; // No roads connected
        
        int i = 1;
        Road nearest = roads[0]; // Initialize nearest with the length of the first road
        
        // Find the shortest road
        while (i < numRoads) {
            if (nearest.getLength() > roads[i].getLength()) {
                nearest = roads[i];
            }
            i++;
        }
        
        // Find the city connected by the shortest road
        return nearest.getCity1() == this ? nearest.getCity2() : nearest.getCity1();
    }

    // String representation of the city
    public String toString() {
        return this.name;
    }
}
