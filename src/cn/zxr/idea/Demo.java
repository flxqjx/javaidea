package cn.zxr.idea;

public class Demo {

    public static  void main(String[] args)
    {

        System.out.println("aa");
        System.out.println("qianjunxian");
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

    private  int num;
    /**
     * 姓名
     */
    private  String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 年龄
     */
    private int age;
    /**
     * 班级
     */
    private String grade;
}
