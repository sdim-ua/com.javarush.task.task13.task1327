/* 
Репка
*/

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<Person>();
        plot.add(new Person("Репка", "Репку"));
        plot.add(new Person("Дедка", "Дедку"));
        plot.add(new Person("Бабка", "Бабку"));
        plot.add(new Person("Внучка", "Внучку"));
        RepkaStory.tell(plot);
    }
}

public class Person implements RepkaItem  {
    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePadezh() {
        return namePadezh;
    }

    public void setNamePadezh(String namePadezh) {
        this.namePadezh = namePadezh;
    }
    
    public void  pull(Person person){
        System.out.println(this.name + " за " + person.namePadezh);
    }
    
}


public interface RepkaItem {
    public String getNamePadezh();
}

public class RepkaStory {
    static void tell(List<Person> items) {
        Person first;
        Person second;

        for (int i = items.size() - 1; i > 0; i--) {
            first = items.get(i -1);
            second = items.get(i );
            second.pull(first);
            
            
        }
    }
}

