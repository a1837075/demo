package flowControlL.itheima_02;

import java.util.Scanner;

/**
 * @author dawnStamp
 * @date 2020/8/28 10:25
 */
public class IfTest2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入学生的考试成绩");
        int score=sc.nextInt();

        if(score>100 ||score<=0){
            System.out.println("您输入的成绩有误");
        }else if(score>=90 &&score<=100){
            System.out.println("优秀");
        }else  if(score>=80&&score<=90){
            System.out.println("好");
        }else  if(score>=70&&score<=80){
            System.out.println("良");
        }else  if(score>=60&&score<=70){
            System.out.println("及格");
        }else {
            System.out.println("不及格");
        }
    }
}
