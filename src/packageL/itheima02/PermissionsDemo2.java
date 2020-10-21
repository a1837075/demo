package packageL.itheima02;

/**
权限修饰符：

 */
public class PermissionsDemo2 {

    public static void main(String[] args) {
            PermissionsDemo pd=new PermissionsDemo();
            pd.publicMethod();
            pd.defaultMethod();
            //pd.privateMethod();
            pd.protectedMethod();
    }
}
