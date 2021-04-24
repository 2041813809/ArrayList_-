package ArrayList;
//ArrayList的基础使用方法

import java.util.ArrayList;

public class ArrayList_Demo02 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        //创建ArrayList集合 名为array

        array.add("hello");
        array.add("world");
        array.add("java");
        //给array添加元素

        System.out.println(array);
        //输出打印array

//        System.out.println(array.remove("world"));
//        //删除指定的元素，并返回 删除是否成功

//        System.out.println(array.remove(1));
//        //删除指定序号的元素，并返回被删除的元素

//        System.out.println(array.set(1,"hi"));
//        //替换掉指定序号中的元素，并返回被替换掉之前的元素

//        System.out.println(array.get(1));
//        //获取指定序号的元素，并返回

//       System.out.println(array.size());
//       //返回当前集合中元素的个数

        System.out.println(array);
        //输出打印array
    }
}
