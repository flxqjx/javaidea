package cn.zxr.idea;

public class Demo {

    public static  void main(String[] args)
    {
        System.out.println("aa");
    }

    public void Show(String name,int age,String grade,int num)
    {
        this.name=name;
        this.age=age;
        this.grade=grade;
        this.num=num;
    }

    /**
     * 数量
     */

    public  int num;
    /**
     * 姓名
     */
    public  String name;
    /**
     * 年龄
     */
    public int age;
    /**
     * 班级
     */
    public String grade;
}
