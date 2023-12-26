package week10.day1.ex1;

public class PrimitiveVsReference_Round2 {
    public static void main(String[] args) {
//        int num = 5;
//        changePrimitive(num);
//        System.out.println("num = " + num); // 5

//        int[] arr = {10,20,30};
//        changeArray(arr);
//        System.out.println(Arrays.toString(arr)); //

        Student st1 = new Student("Hanna");
        changeStudent(st1);
        System.out.println("st1.name = " + st1.name); //
    }

    public static void changeStudent(Student stud){
        stud.name = "Polina";
    }

    public static void changeArray(int[] myarr){ // int[] myarr = arr
        myarr[0] = 1000;
        myarr[1] = 2000;
        myarr[2] = 3000;
    }

    public static void changePrimitive(int a){ // int a = num
        a = a + 1;
    }
}
