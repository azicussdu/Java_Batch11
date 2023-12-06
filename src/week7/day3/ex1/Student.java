package week7.day3.ex1;

public class Student {
    private String name;
    private int age;
    private double gpa; // 0.0 - 4.0

    public String getName(){
        return name;
    }
    public void setName(String name){ //name = "mike"
        if(name.length() < 2 || name.length() > 20){
            System.out.println("The length should be in range: 2-20");
        }
        else{
            if(Character.isUpperCase(name.charAt(0)))
                this.name = name;
            else
                System.out.println("Name value should start from uppercase letter");
        }
    }

    public double getGpa(){
        return gpa;
    }

    public void setGpa(double gpa){
        if(gpa < 0 || gpa > 4.0)
            System.out.println("the gpa value is not valid");
        else
            this.gpa = gpa;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age <= 0)
            System.out.println("not valid age was given");
        else
            this.age = age;
    }

    public String toString(){
        return "name: " + name + "\nage: " + age + "\ngpa: " + gpa;
    }
}
