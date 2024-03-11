public class Dog extends Animal {

    private boolean hasWalkedWith;
    private boolean fetched;

    public Dog(String name, int age, boolean vaccinated) {
        super(name, age, vaccinated);
    }

    public void walk() {
        hasWalkedWith = true;
    }

    public void fetch() {
        fetched = true;
    }

    public void gimmie() {
        fetched = false;
    }
}
