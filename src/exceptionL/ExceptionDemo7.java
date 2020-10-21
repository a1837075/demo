package exceptionL;

/**
需求：写一个方法，接收考试成绩，如果考试成绩的范围在0-100之间属于正常，否则属于异常

 throws:处理异常的一种方式，把异常抛出，有调用者来处理
 throw：制造异常的方式，并且结束方法

 注意：如果抛出的（throw）是编译时期异常，必须在方法声明处抛出（throws）

 如何自定义一个异常类？
    写一个类去继承Exception或者RuntimeException，然后实现多个构造即可

 */
public class ExceptionDemo7 {
    public static void main(String[] args) {
        /*boolean flag=checkScore(-10);
        System.out.println(flag);*/

        try {
            checkScore(121);
        } catch (Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }

       //checkScore(110);
    }

    /*public static boolean checkScore(int score){
        if (score <0 || score >100){
            return false;
        }
        return true;
    }*/

    public static void checkScore(int score) throws Exception {
        if (score <0 || score >100){
            //throw new RuntimeException("不符合要求");
            //throw new Exception("不符合要求");
            throw new MyException("考试成绩不符合要求");
        }
        System.out.println("成绩合格");
    }
}

