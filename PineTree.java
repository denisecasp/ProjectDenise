public class PineTree {


    private int numOfcones;

    private List<Squirrel> squirrels;

    private Owl ulla;

    private int weigth;

    // contructor 1
    public PineTree(int numOfcones, List<Squirrel> squirrels) {
        this.numOfcones = numOfcones;
        this.squirrels = squirrels;
    }

    public int getNumOfcones() {
        return numOfcones;
    }

    public void setNumOfcones(int numOfcones) {
        this.numOfcones = numOfcones;
    }

    // constructor 2
    public PineTree(int numOfcones, List<Squirrel> squirrels, Owl ulla) {
        this.numOfcones = numOfcones;
        this.squirrels = squirrels;
        this.ulla = ulla;
    }

    public List<Squirrel> getSquirrels() {
        return squirrels;
    }

    public int getNumofSquirrelsInNest() {
        return squirrels.size();
    }

    public void setSquirrels(List<Squirrel> squirrels) {
        this.squirrels = squirrels;
    }

    public Owl getUlla() {
        return ulla;
    }

    public void setUlla(Owl ulla) {
        this.ulla = ulla;
    }

    public boolean fall(int age, int height, int windSpeed) {
        return age > 500 && height > 35 && windSpeed > 170;
        }

        static class PineCone {

        }
    }
}