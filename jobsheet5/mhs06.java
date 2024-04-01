package jobsheet5;

public class mhs06 {
    String name;
    int year, age;
    double ipk;

    mhs06(String n, int t, int u, double i){
        name = n;
        year = t;
        age = u;
        ipk = i;
    }

    void show(){
        System.out.println("Name : "+ name);
        System.out.println("Year : "+ year);
        System.out.println("Age : "+ age);
        System.out.println("IPK : "+ ipk);
    }
}