package exercise;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 2020/8/17 0017
 * Time: 21:16
 * E-mail:1460595002@qq.com
 * ��˵��:
 */
//�ַ�����ת
public class StringDemo {

    //��ʽһ��
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

    //��ʽ����ʹ���ַ���ƴ��
    public String reverse2(String str,int startIndex,int endIndex){

      if(str!=null){
          //��һ����
          String substring = str.substring(0, startIndex);
          //�ڶ�����
          for (int i = endIndex; i >=startIndex ; i--) {
             substring += str.charAt(i);

          }

          //��������
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
