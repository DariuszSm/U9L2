public class Cat extends Animal {

    private boolean hasPlayedWith;
    private boolean loaf;

    public Cat(String name, int age, boolean vaccinated) {
        super(name, age, vaccinated);
    }

    public void play() {
        hasPlayedWith = true;
    }

    public void loaf() {
        loaf = true;
    }

    public void unloaf() {
        loaf = false;
    }

}
