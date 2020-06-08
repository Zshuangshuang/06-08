import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: ListTest
 * @Author: 邹双双
 * Date: 2020/6/8 10:53
 * @Description:
 */
public class ListTest {
    public static void main(String[] args) {
        //创建List实例
        List<String> list = new ArrayList<>();
        //2、新增元素
        list.add("C");
        list.add("Java");
        list.add("python");
        list.add("C++");
        //3、打印List
        System.out.println(list);
        //4、按下标访问
        System.out.println(list.get(2));
        list.set(2,"PHP");
        System.out.println(list);
        for (String s: list) {
            System.out.print(s+" ");
        }
        System.out.println("===========");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println(list.subList(2,4));
        List<String > list1 = new ArrayList<>(list);
        System.out.println("复制了一份list");
        System.out.println(list1);
        list.set(0,"C#");
        System.out.println(list1);
    }
}
