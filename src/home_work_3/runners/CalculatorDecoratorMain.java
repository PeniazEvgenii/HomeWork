package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithCounterClassic;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {
       ICalculator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));

      double resultDegree =  calc.getPowerOfNumber(calc.getDivision(28, 5), 2);
      double resultMultiplication = calc.getMultiplicatin(15, 7);
      double result = calc.getAddition(calc.getAddition(4.1, resultMultiplication), resultDegree);

      System.out.printf("4.1 + 15 * 7 + (28 / 5) ^ 2 =  %.4f%n", result);
      System.out.printf("Количество операций = %d%n",((CalculatorWithCounterAutoDecorator)calc).getCountOperation());
      System.out.println((((CalculatorWithCounterAutoDecorator)calc).getCalculator()));

       if (calc instanceof CalculatorWithCounterAutoDecorator) {
          if ((((CalculatorWithCounterAutoDecorator) calc).getCalculator()) instanceof CalculatorWithMemoryDecorator) {
             ((CalculatorWithMemoryDecorator) ((CalculatorWithCounterAutoDecorator) calc).getCalculator()).save();
             System.out.println(((CalculatorWithMemoryDecorator) ((CalculatorWithCounterAutoDecorator) calc).getCalculator()).load());
          }
       }

      /**
       * Оператор instance of проверяет происхождение объекта. т.е. был ли объект, на который ссылается переманная, создан на основе какого-либо класса.
       * Мы создаем обобщенную ссылку calc типа ICalculator. В нашем случае у Icalculator нет абстрактных методов load(), save(), getCalculator().
       * Чтобы к ним обратиться нужно использовать приведение объекта к типу (классу) CalculatorWithMemoryDecorator, т.к. в нем эти методы
       * реализованы. С нисходящим приведением, мы должны быть уверены в принадлежности объекта, ведь если мы неверно приведем типы и вызовем метод, то возникнет ошибка компиляции.
       */


       //  System.out.println("Тест с сохранением рез-та после каждого действия с помощью приведения");
       //  calc.getDivision(28, 5);
       //  ((CalculatorWithMemoryDecorator)((CalculatorWithCounterAutoDecorator)calc).getCalculator()).save();                                    //??? у нас не объявлены методы в интерфейсе для функций памяти. объявить. что делать с остальными реализациями???
       //  calc.getPowerOfNumber(((CalculatorWithMemoryDecorator)((CalculatorWithCounterAutoDecorator)calc).getCalculator()).load(),2);           // дефолтный метод у интерфейса может?  В примерах есть абстрактный родитель и объкт создается его типа а обертки его наследники
       //  ((CalculatorWithMemoryDecorator)((CalculatorWithCounterAutoDecorator)calc).getCalculator()).save();                                    // если дефолтными сделать то load идет в интерфейс а не в memoryDecorate
       //  calc.getAddition(4.1, ((CalculatorWithMemoryDecorator)((CalculatorWithCounterAutoDecorator)calc).getCalculator()).load());
       //  ((CalculatorWithMemoryDecorator)((CalculatorWithCounterAutoDecorator)calc).getCalculator()).save();
       //  calc.getAddition(((CalculatorWithMemoryDecorator)((CalculatorWithCounterAutoDecorator)calc).getCalculator()).load(), calc.getMultiplicatin(15, 7));
       //  ((CalculatorWithMemoryDecorator)((CalculatorWithCounterAutoDecorator)calc).getCalculator()).save();
       //  System.out.printf("4.1 + 15 * 7 + (28 / 5) ^ 2 =  %.4f%n", ((CalculatorWithMemoryDecorator)((CalculatorWithCounterAutoDecorator)calc).getCalculator()).load());


    }
}
