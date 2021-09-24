import java.util.*;

class Student {
    int rollno;
    String name, address;
    public Student(int rollno, String name, String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
    public String toString()
    {
        return this.rollno + " " + this.name + " "
            + this.address;
    }
}
  
class Sortbyroll implements Comparator<Student> {
 
    public int compare(Student a, Student b)
    {
        return a.rollno - b.rollno;
    }
}
  
class Sortbyname implements Comparator<Student> {
  
    public int compare(Student a, Student b)
    {
        return a.name.compareTo(b.name);
    }
}

class CustomerSortingComparator implements Comparator<Student> {
  
        @Override
        public int compare(Student customer1,Student customer2)
        {
  
            // for comparison
            int NameCompare = customer1.name.compareTo(
                customer2.name);
            int AgeCompare = customer1.rollno - customer2.rollno;
  
            // 2-level comparison
            return (NameCompare == 0) ? AgeCompare
                                      : NameCompare;
        }
    }
public class Main {
	public static void main(String[] args) {
		System.out.println("Hello, World");
		        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "bbbb", "london"));
        ar.add(new Student(131, "aaaa", "nyc"));
        ar.add(new Student(121, "cccc", "jaipur"));
         ar.add(new Student(121, "aaa", "patna"));
  
  
        System.out.println("Unsorted");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
  
        Collections.sort(ar, new Sortbyroll());
  
        System.out.println("\nSorted by rollno");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
  
        Collections.sort(ar, new Sortbyname());
  
        System.out.println("\nSorted by name");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
            
        Collections.sort(ar, new CustomerSortingComparator());
        System.out.println("\nsorted by roll no first and then by name");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
	}
}
