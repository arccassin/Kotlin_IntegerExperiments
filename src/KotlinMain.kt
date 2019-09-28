/**
 * Created by User on 28 Сент., 2019
 */

fun sumDigits(int: Int): Int{
    val str: String = int.toString();
    var intRes: Int = 0;
    for (c in str){
        intRes += Character.getNumericValue(c);
    }
    return intRes;
}