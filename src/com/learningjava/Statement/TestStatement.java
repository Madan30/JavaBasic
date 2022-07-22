package com.learningjava.Statement;

/**
 *
 * @author mrg1813
 */
public class TestStatement {

    public static void main(String args[]) {

        Statement st = new Statement();
        st.getCitizen(12);
        System.out.println("********************************************************");

        st.compareNumber(11, 30, 209);

        System.out.println("********************************************************");

        IfElseStatement ist = new IfElseStatement(21);
        ist.checkEvenOrOdd();

        System.out.println("********************************************************");

        SwitchCase swt = new SwitchCase(22);
        swt.showMonth();

        System.out.println("********************************************************");

       swt.mult(9);
    }

}
