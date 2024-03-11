public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private boolean adopted;
    private boolean fed;
    private boolean eeping;
    private boolean governmentSpy;

    public Animal(String name, int age, boolean vaccinated, boolean isGovtSpy) {
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
        this.governmentSpy = isGovtSpy;
    }

    public void adopt() {
        adopted = true;
    }

    public void feed() {
        fed = true;
    }

    public void eep() {
        eeping = true;
    }

    public void wake() {
        eeping = false;
    }

    public void checkEep() {
        if (eeping) {
            System.out.println("zzzzzzzz...");
        } else {
            System.out.println("hi im awake!!!");
        }
    }

    public void checkAdopt() {
        if (adopted) {
            System.out.println("hi please adopt me");
        } else {
            System.out.println("hi im adopted!! don't kidnap me please");
        }
    }

    public void checkFed() {
        if (fed) {
            System.out.println("hi please feed me i haven't eaten in the last 2 nanoseconds im starving");
        } else {
            System.out.println("urghh.... im so full... i still demand more food");
        }
    }

    public void checkGovt() {
        if (governmentSpy) {
            System.out.println("uhhhh im not a govt spy i swear bzzzzt *KHZHKZGZH*");
        } else {
            System.out.println("what is a government? that sounds like a long word");
        }
    }

    public void checkVax() {
        if (vaccinated) {
            System.out.println("please vaccinate me!!!");
        } else {
            System.out.println("yaaaay i can fight diseases!!!!!");
        }
    }

}
