public class Employee
{
    String name="ram";
    int age=23;
    long phno=738654298l;
    double sal=15000;
     void details()
    {
        System.out.println("Name of the employee : "+name);
        System.out.println("Name of the employee : "+age);
        System.out.println("Name of the employee : "+phno);
        System.out.println("Name of the employee : "+sal);

    }
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.details();
    }

}