package flowControlL.itheima_05;

/**
while循环的语句格式：
    while(判断条件语句){
        循环语句;
 }
 扩展格式：
    初始化语句；
    while(判断条件语句){
        循环语句;
        控制条件语句；
 }
 */
public class WhileDemo {
    public static void main(String[] args) {
        /*for (int x=1;x<=10;x++){
            System.out.println("HelloWorle");
        }*/
        int x=1;
        while (x<=10){
            System.out.println("HelloWorle");
            x++;
        }
    }
}
