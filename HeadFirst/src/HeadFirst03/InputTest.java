package HeadFirst03;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args){
        InputTest inputTest = new InputTest();
        inputTest.test();
    }

    public void test(){
        int c;
        try{
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                getClass().getResourceAsStream("test.txt")));
            while ((c = in.read()) > 0){
                System.out.print((char)c);
            }
            System.out.println();
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
