public class Cat extends Animal {

    private boolean hasPlayedWith;
    private boolean loaf;

    public Cat(String name, int age, boolean vaccinated, boolean isGovtSpy) {
        super(name, age, vaccinated, isGovtSpy);
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

    public void wasPlayed() {
        if (hasPlayedWith) {
            System.out.println("please play with me.... >:3");
        } else {
            System.out.println("ghhh you already played with me...");
        }
    }

    public void

}
