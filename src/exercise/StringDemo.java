package exercise;

/**
 * Created with IntelliJ IDEA.
 * User: 郭金荣
 * Date: 2020/8/17 0017
 * Time: 21:16
 * E-mail:1460595002@qq.com
 * 类说明:
 */
//字符串反转
public class StringDemo {

    //方式一：
    public static String reverse(String str,int startIndex,int endIndex){


        if (str !=null){

            char[] arr = str.toCharArray();

            for (int x = startIndex,y = endIndex;x<y;x++,y--) {
                char temp=arr[x];
                arr[x]=arr[y];
                arr[y]=temp;

             return new String(arr);
            }

        }
        return null;
    }

    //方式二：使用字符串拼接
    public String reverse2(String str,int startIndex,int endIndex){

      if(str!=null){
          //第一部分
          String substring = str.substring(0, startIndex);
          //第二部分
          for (int i = endIndex; i >=startIndex ; i--) {
             substring += str.charAt(i);

          }

          //第三部分
          substring +=str.substring(endIndex+1);


       return substring;
      }

      return null;

    }
    public static void main(String[] args) {
        String str="abcdefgl";

        String reverse = reverse(str, 1, 4);

        System.out.println(reverse);
    }
}
