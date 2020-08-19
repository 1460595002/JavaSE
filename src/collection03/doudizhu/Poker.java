package collection03.doudizhu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/6/19 0019
 * Time: 16:14
 * E-mail:1460595002@qq.com
 * 类说明:
 */
public class Poker {

    public static void main(String[] args) {
        //1.准备配操作
        //1.1创建牌盒
        ArrayList<String> pokerBox = new ArrayList<>();
        //1.2创建花色集合
        ArrayList<String> colors = new ArrayList<>();

        //1.3创建数字集合
        ArrayList<String> numbers = new ArrayList<>();

        //1.4 分别给花色 以及  数字集合添加元素
        colors.add("♥");
        colors.add("♦");
        colors.add("♠");
        colors.add("♣");

        for (int i = 0; i <=10 ; i++) {
            numbers.add(i+"");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");

        //1.5 创建牌  拼接牌的操作
        for (String color : colors) {
            //每一个花色
            //遍历数字集合
            for (String number : numbers) {
                //集合
                String card = color + number;
                //存储在牌盒子中
                pokerBox.add(card);
            }
        }

        //1.6大王小王
        pokerBox.add("小☺");
        pokerBox.add("大☠");
        System.out.println(pokerBox);//查看盒子里的牌
        //洗牌 是不是就是将  牌盒中 牌的索引打乱
        // Collections类  工具类  都是 静态方法
        // shuffer方法
        /*
         * static void shuffle(List<?> list)
         *     使用默认随机源对指定列表进行置换。
         */
        //2:洗牌
        Collections.shuffle(pokerBox);

        //3.发牌
     //  3.1创建三个玩家集合 创建一个底牌的集合
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        //比例 牌盒 必须知道索引
        for (int i = 0; i < pokerBox.size(); i++) {
            //获取 牌面
            String card = pokerBox.get(i);
            //留出三张底牌 存在底牌的集合中
            if (i>51){//存在底牌集合中
                dipai.add(card);
            }else {
                //玩家1 %3 ==0
                if (i%3==0){
                    player1.add(card);
                }else if (i%3==1){
                    player2.add(card);
                }else {//玩家三
                    player3.add(card);
                }
            }
        }

        //看看
        System.out.println("令狐冲："+player1);
        System.out.println("田伯光："+player2);
        System.out.println("绿竹翁："+player3);
        System.out.println("底牌："+dipai);
    }
}


