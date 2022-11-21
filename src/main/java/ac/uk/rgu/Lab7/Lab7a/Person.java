package ac.uk.rgu.Lab7.Lab7a;

import java.util.Comparator;

public class Person  implements Comparable<Person>{
    public int age; 
    
    public int getAge() {
        return age;
    }

    public String surname, firstname;

    public String getSurname() {
        return surname;
    }

    public String getFirstname() {
        return firstname;
    }
    

    public Person(int age, String surname, String firstname) {
        this.age = age;
        this.surname = surname;
        this.firstname = firstname;
    }

    @Override
    public int compareTo(Person o) {
        // TODO Auto-generated method stub
        //return 0;
        String otherSurname = o.surname; 

        int position = this.surname.compareTo(otherSurname); 
        if(position > 0){
            return -1; 
        }
        else if(position == 0){
            return 0; 
        }
        else{
            return 1;
        }

    }

    public static class PersonComparator implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            // TODO Auto-generated method stub
            //return 0;

            if(o1.age < o2.age){
                return -1; 
            }else if(o1.age == o2.age){
                return 0; 
            }
            else{
                return 1;
            }

        }

    }

    @Override
    public String toString() {
        return "Person [ age = " + age + ", surname = " + surname + ", firstname = " + firstname + " ]";
    }

    

   
    
    
}
