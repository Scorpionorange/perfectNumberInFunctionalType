import fj.F;
import fj.data.List;
import static fj.data.List.range;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.IntStream.range;


/**
 * Created by ScorpionOrange on 2016/10/30.
 */
public class NumberClassifier {

    public List<Integer> factorsOf(final int number){
        return range(1, number + 1).filter(
                new F<Integer, Boolean>(){
                    public Boolean f(final Integer i) {
                        return number % i == 0;
                    }
                });
    }

    public static int aliquotSum(int number){
        return factorsOf(number).sum() - number;
    }

    public static boolean isPerfect(int number){
        return aliquotSum(number) == number;
    }

    public static boolean isAbundant(int number){
        return aliquotSum(number) > number;
    }

    public static boolean isDeficient(int number){
        return aliquotSum(number) < number;
    }
}
