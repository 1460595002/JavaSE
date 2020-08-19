package collection03.Map;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/20 0020
 * Time: 21:32
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class MapTest {

    public static void main(String[] args) {
        //友情提示
        System.out.println("请输入一个字符串：");
        String line = new Scanner(System.in).nextLine();

        findChar(line);
    }
    private static void findChar(String line){
        //1：创建一个集合 存储 字符以及其出现的次数
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            //判断 该字符是否在集合中
            if (!map.containsKey(c)){
                //那就是第一次
                map.put(c,1);
            }else {
                //先获取之前的次数
                Integer integer = map.get(c);
                //在存入更新
                map.put(c,++integer);

            }
        }
        System.out.println(map);
    }
}
