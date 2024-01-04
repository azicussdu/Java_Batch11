package week11.day1;

abstract class Planet {
    protected void revolve(){}
    abstract void rotate();
}

/*
in child classes overriden methods should
have more strong access privilege(or the same privilege)
than in parent class.

private -> default -> protected -> public
 */

class Earth extends Planet {
//    void revolve(){} // at least it should be protected (or can be public)

    protected void rotate(){}
}

public class Q_6 {
}
