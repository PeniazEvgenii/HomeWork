package home_work_3.runners;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorStringExpressionMain {
    public static void main(String[] args) {
        // проба в мэйне . позже переделать в культурный вид

        String exp = "4.1 + 15 * 7 + (28 / 5) ^ 2";

        // удалил пробелы
        exp = exp.replaceAll("\\s+", "");


        //динамический массив сначала символ и первая позиция. А может двумерный?
        ArrayList<Double> numbers = new ArrayList<Double>();
        ArrayList<String> operators = new ArrayList<String>();
        ArrayList<String> brackets = new ArrayList<String>();

        Pattern patternNumber = Pattern.compile("\\d+\\.?\\d+?");
        Pattern patternOperator = Pattern.compile("[-\\+\\*/\\^]");
        Pattern patternBracket = Pattern.compile("[()]");
        Matcher matcher = patternNumber.matcher(exp);

        // разберу строку по элементам
        //здесь все числа
        while (matcher.find()){
            numbers.add(Double.parseDouble(matcher.group()));
            //numbers.add((double)matcher.start());
            //numbers.add(matcher.end()-1.0);
        }

        //здесь все мат операторы
        matcher = patternOperator.matcher(exp);
        while (matcher.find()) {
            operators.add(matcher.group());
            int temp = matcher.start();
            operators.add(String.valueOf(temp));

            if ( ( !Character.isDigit(exp.charAt(temp - 1)) && exp.charAt(temp - 1)!= '(' && exp.charAt(temp - 1)!= ')' ) ||
                    ( !Character.isDigit(exp.charAt(temp + 1)) && exp.charAt(temp + 1)!= '(' && exp.charAt(temp + 1)!= ')' )) {
                System.out.println("Не пройдена валидация. У оператора отсутствует операнд");
                return;
            }
        }

        // здесь скобки и проверка что скобки норм
        int open = 0;
        int close = 0;
        matcher = patternBracket.matcher(exp);
        while (matcher.find()) {
            brackets.add(matcher.group());
            int temp = matcher.start();
            brackets.add(String.valueOf(temp));
            if(exp.charAt(temp) == '(') {
                open++;
            } else if (exp.charAt(temp) == ')') {
                close++;
            }
        }
        if(open != close) {
            System.out.println("Не пройдена валидация. Количество открытых и закрытых скобок не совпадает");

        }

        if (brackets.toArray().length != 0) {
            for (int i = Integer.parseInt(brackets.get(1)); i <= Integer.parseInt(brackets.get(3)); i++ ) {
                //что дает?


            }
        }


    }

}
