package this_super;

public class Employee extends Person{
    float salary = 4000f;
    String name = "Elon Musk";
    int age = 52;
    
    public void showInfosuper(){
        System.out.println("=======SUPER=======");
        System.out.println("Nama : " + super.name);
        System.out.println("Umur : " + super.age);
        System.out.println("Salary : $" + salary);
    }
    
    public void showInfothis(){
        System.out.println("=======THIS=======");
        System.out.println("Nama : " + this.name);
        System.out.println("Umur : " + this.age);
        System.out.println("Salary : " + salary);
    }
}
