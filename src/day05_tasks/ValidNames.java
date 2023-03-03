package day05_tasks;

public class ValidNames {

    public static void main(String[] args) {

        boolean DAYOFWEEK = true;

        System.out.println( DAYOFWEEK);
        //we cannot. NAME SHOULD FOLLOW camelCase-----boolean 3DGRAPH = true;
        boolean JUNE1997  = true;
        System.out.println(JUNE1997);
        //ILLEGAL CHARACTER, we can use only $ and _ --- boolean MIXTURE#3 = true;
        //WE CANNOT HAVE SPACE ---  boolean WEEK DAY = true;
        boolean A$B = true;
        System.out.println(A$B);
        boolean _HELLOWORLD = true;  //can start only $ and _
        System.out.println(_HELLOWORLD);
        boolean TRUE = true;  //This true is ok because its CAPITAL TRUE.
        System.out.println(TRUE);
        boolean  PUBLIC = true;
        System.out.println(PUBLIC);
        // NAME CANNOT START WITH NUMBERS ---- boolean 1980_S = true;





    }



}
