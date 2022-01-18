public class Owl {
    private int wingSpan;
    private boolean hungry;
    private int age;
    private int weigth;

    public Owl(int wingSpan, boolean hungry, int age) {
        this.wingSpan = wingSpan;
        this.hungry = hungry;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWingSpan(){
        return wingSpan;
    }

    public void setWingSpan() {
        return wingSpan;
    }

    public boolean isHungry(){
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public boolean eat(PineTree pineTree){

        int numOfSquirrels = pineTree.getNumOfSqurrelsInNest();
        if (isHungry()){
            return numOfSquirrels < 10;
        }
        return false;
    }

}