import java.util.HashMap;
import java.util.Scanner;

public class Menu{

    Scanner console;

    public Menu(Scanner console){
        this.console = console;
        menu();
    }

    /*
    Дальше страшно...
     */

    public int menu(){
        SingleData singleData = new SingleData(console);
        SetData setData = new SetData(console);

        System.out.println("Доступны следующие операции:");
        System.out.println("\t 1) с одним числом");
        System.out.println("\t 2) с большим количеством цифр");
        System.out.print("Выберите тип операции: ");
        int choice = console.nextInt();

        switch (choice){
            case 1:
                System.out.println("Доступны следующие операции:");
                System.out.println("\t 1) sin (синус)");
                System.out.println("\t 2) cos (косинус)");
                System.out.println("\t 3) sqrt (квадратный корень)");
                System.out.println("\t 4) pow (возведение в степень)");

                singleData.setOperation();
                switch (singleData.getOperation())
                {
                    case 1:
                        singleData.setNumber();
                        System.out.print(String.format("Sin числа %s: %s ", singleData.getNumber(), Math.sin(singleData.getNumber())));
                        return 0;
                    case 2:
                        singleData.setNumber();
                        System.out.print(String.format("Cos числа %s: %s", singleData.getNumber(), Math.cos(singleData.getNumber())));
                        return 0;
                    case 3:
                        singleData.setNumber();
                        System.out.print(String.format("Корень квадратный числа %s: %s", singleData.getNumber(), Math.sqrt(singleData.getNumber())));
                        return 0;
                    case 4:
                        singleData.setNumber();
                        singleData.setDegreeNumber();
                        HashMap powHashMap = (HashMap) singleData.setPowMap();
                        if(powHashMap.containsKey(singleData.getNumber()))
                            System.out.println(powHashMap.get(singleData.getNumber()));
                        else
                        System.out.print(String.format("Число %s в степени %s: %s", singleData.getNumber(), singleData.getDegreeNumber(), Math.pow(singleData.getNumber(), singleData.getDegreeNumber())));
                        return 0;

                    default:
                        System.out.println("Некорректный ввод. Повторите ещё раз: ");
                        return 0;
                }
            case 2:
                System.out.println("Доступны следующие операции:");
                System.out.println("\t1) + (сложение)");
                System.out.println("\t2) - (вычитание)");
                System.out.println("\t3) * (умножение)");
                System.out.println("\t4) / (деление)");
                System.out.println("\t5) % (вычисление процента)");

                double count = 1;

                setData.setOperation();
                switch (setData.getOperation())
                {
                    case 1:
                        setData.setNumberDigits();
                        count--;
                        for (int i = 0; i < setData.getNumberDigits(); i++) {
                            setData.setNumber();
                            count += setData.getNumber();
                        }
                        System.out.print(String.format("Сумма чисел: %s ", count));
                        return 0;

                    case 2:
                        setData.setNumberDigits();
                        count++;
                        for (int i = 0; i < setData.getNumberDigits(); i++) {
                            setData.setNumber();
                            count -= setData.getNumber();
                        }
                        System.out.print(String.format("Разница чисел: %s ", count));
                        return 0;

                    case 3:
                        setData.setNumberDigits();
                        for (int i = 0; i < setData.getNumberDigits(); i++) {
                            setData.setNumber();
                            count *= setData.getNumber();
                        }
                        System.out.print(String.format("Произведение чисел: %s ", count));
                        return 0;

                    case 4:
                        setData.setNumberDigits();
                        if(setData.getNumberDigits() < 2){
                            System.out.println("Введенно слишком мало цифр!");
                            return 0;
                        }

                        setData.setNumber();
                        count *= setData.getNumber();
                        for (int i = 0; i < setData.getNumberDigits()-1; i++) {
                            setData.setNumber();
                            count /= setData.getNumber();
                        }
                        System.out.print(String.format("Частное чисел: %s ", count));
                        return 0;

                    case 5:
                        setData.setNumberDigits();
                        for (int i = 0; i < setData.getNumberDigits(); i++) {
                            setData.setNumber();
                            setData.setModulusNumber();
                            count += setData.getNumber() % setData.getModulusNumber();
                        }
                        System.out.print(String.format("Остаток: %s ", count));
                        return 0;
                    default:
                        System.out.println("Некорректный ввод. Повторите ещё раз: ");
                        return 0;
                }
        }
        return 0;
    }
}