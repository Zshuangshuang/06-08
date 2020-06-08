import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: Test
 * @Author: 邹双双
 * Date: 2020/6/7 9:01
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Map<String , String > map = new HashMap<>();
        map.put("及时雨","宋江");
        map.put("玉麒麟","卢俊义");
        for (Map.Entry<String,String> entry: map.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getKey());
        }
        map.put("及时雨","晁盖");
        System.out.println(map);
    }

}
