import java.util.*;
/**
 * Created by ScorpionOrange on 2016/10/30.
 * 古希腊数学家Nicomachus发明了一种自然数的分类方法，任意一个自然数都唯一地被归类为过剩数（abundant）、
 * 完美数（perfect）或不足数（deficient）。一个完美数的真约数（即除了自身以外的所有正约数）之和，恰好等于它本身。
 * 例如6是一个完美数，因为 6=1+2+3 ；28也是一个完美数，因为 28=1+2+4+7+14 。
 */
public class PerfectNumberInFunctionalType {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("使用函数式模式实现：");
        System.out.print("请输入一个正整数，将判断它是否完美数：");
        int number = in.nextInt();
        while (number <= 0){
            System.out.println("输入错误，请重新输入");
            System.out.print("请输入一个正整数，将判断它是否完美数：");
            number = in.nextInt();
        }
        boolean isPerfect = new NumberClassifier().isPerfect(number);
        boolean isAbundant = new NumberClassifier().isAbundant(number);
        boolean isDeficient = new NumberClassifier().isDeficient(number);
        System.out.print("输入的数字是：" + number);
        if(isPerfect) System.out.println(" ，它是完美数。");
        if(isAbundant) System.out.println(" ，它是过剩数。");
        if(isDeficient) System.out.println(" ，它是不足数。");

    }
}
