package lesson9;

public class Park {
    private Attraction[] attractions;
    private int count;

    public Park(int attrNumber) {
        this.attractions = new Attraction[attrNumber];
        count = 0;
    }

    public class Attraction {
        private String name;
        private String workingHours;
        private double cost;

        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public String getWorkingHours() {
            return workingHours;
        }

        public double getCost() {
            return cost;
        }
    }

    public void addAttraction(String name, String workingHours, double cost) {
        if (count < attractions.length) {
            attractions[count++] = new Attraction(name, workingHours, cost);
        }
    }

    public void printAttrInfo() {
        for (Attraction attraction : attractions) {
            System.out.println(attraction.name + " - working hours: " + attraction.workingHours + "; cost: " + attraction.cost);
        }
    }
}
