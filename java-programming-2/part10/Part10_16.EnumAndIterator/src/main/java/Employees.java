import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private final ArrayList<Person> employeesList;

    public Employees() {
        this.employeesList = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        employeesList.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        for (int i = 0; i < peopleToAdd.size(); i++){
            employeesList.add(peopleToAdd.get(i));
        }
    }

    public void print(){
        Iterator<Person> iterator = employeesList.iterator(); 
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    public void print(Education education) {
        Iterator<Person> iterator = employeesList.iterator();
        while (iterator.hasNext()){
            Person person = iterator.next();
            if (person.getEducation().equals(education)) {
                System.out.println(person);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = employeesList.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }



}
