package tugasQueue;

public class Patient06 {
    String name;
    int idNumber;
    char gender;
    int age;

    public Patient06(String name, int idNumber, char gender, int age) {
        this.name = name;
        this.idNumber = idNumber;
        this.gender = gender;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", ID Number: " + idNumber + ", Gender: " + gender + ", Age: " + age;
    }
}
