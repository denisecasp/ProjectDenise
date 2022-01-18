public class Squrriel {

    private int weight;

    private int numOfConesInNest;
    private String name;


    // constructor 1
    public Squrriel(int weight) {
        this.weight = weight;
    }

    // constructor 2
    public Squrriel(int weight, int numOfConesInNest, String name) {
        this.weight = weight;
        this.numOfConesInNest = numOfConesInNest;
        this.name = name;
    }



    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumOfConesInNest() {
        return numOfConesInNest;
    }

    public void setNumOfConesInNest(int numOfConesInNest) {
        this.numOfConesInNest = numOfConesInNest;
    }

    public boolean eat(PineTree pineTree){
        return pineTree.getNumOfCones () > 0;

        }
}
