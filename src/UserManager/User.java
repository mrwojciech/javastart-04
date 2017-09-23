package UserManager;

public class User {
    private String pesel;
    private int age;
    private String name;
    private String Surname;

    public User(String pesel, int age, String name, String surname) {
        this.pesel = pesel;
        this.age = age;
        this.name = name;
        Surname = surname;
    }


    public String getPesel() {
        return pesel;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return Surname;
    }

    public User() {

    }

    public void showUser() {
        System.out.println("Podales pesel: " + this.getPesel() + " wiek: " + this.getAge()
                + " imie: " + this.getName() + " nazwisko: " + this.getSurname());

    }
}
