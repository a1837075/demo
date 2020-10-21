package exceptionL;

/**
 * @author dawnStamp
 * @date 2020/9/21 22:07
 */
public class MyException extends /*RuntimeException*/ Exception {
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }

}
