public class Person {
    String name;

    int age;

    int growth;

    int weight;



 public Person(String n, int a, int g, int w) {
     name = n;
     age = a;
     growth = g;
     weight = w;
 }
 public Person(){
 }

    public void infoperson() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(growth);
        System.out.println(weight);
    }

    public void gotowork(){
     if ( age < 18 || age > 70) {
         System.out.println("отдыхаю дома");
     }
     else {
         System.out.println("иду на работу");
     }
    }

}
