public class User {
    String name;
    String phone;
    int yearOfBirthday;
    int actualYear = 2018;
    public User(String newName, String newPhone, int newYearOfBirthday){
        name = newName;
        phone = newPhone;
        yearOfBirthday = newYearOfBirthday;
    }
    public  void age (){
        int age = actualYear-yearOfBirthday;
        System.out.println(name);
        System.out.println(phone);
        System.out.println(age);
    }
}