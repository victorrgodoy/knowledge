
public class Human implements Comparable<Human> {

    private final int wage;
    private final String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }


    @Override
    public String toString() {
        return name + " " + wage;
    }

    @Override
    public int compareTo(Human o) { 
        if (this.wage == o.getWage()) {
            return 0;
        } else if (this.wage < o.getWage()) {
            return 1;
        } else {
            return -1;
        }

    }
}
