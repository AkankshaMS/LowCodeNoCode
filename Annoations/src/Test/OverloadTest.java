package Test;
import customAnnotation.Overload;

public class OverloadTest {
	@Overload
    public static void foo(){
    }
	
    @Overload
    public static void foo(String s){

    }

    @Overload
    public static void foosss(String s){

    }

}
