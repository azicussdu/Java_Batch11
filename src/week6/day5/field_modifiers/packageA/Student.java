package week6.day5.field_modifiers.packageA;

/*
Also you can use access modifiers for class fields.
For the fields we have 4 access modifiers:
    public: you can access this field from anywhere inside your project.
    default: you can access this field only from the same package. (default = package-private)
    private: you can access this field only from the same class. (private = class-private)
    protected: quite the same as default one (we will talk about protected after we learn what is "inheritance")
 */
public class Student {
    public String name;
    int age; //default (package-private)
    private double gpa;
    protected String university;

    public void methodPublic(){
        System.out.println("I am in public method");
    }

    void methodDefault(){
        System.out.println("I am in default method");
    }

    protected void methodProtected(){
        System.out.println("I am in protected method");
    }

    private void methodPrivate(){
        System.out.println("I am in private method");
    }
}
