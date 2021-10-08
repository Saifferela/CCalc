import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class SingleData {
    private Scanner console;
    private double number;
    private int operation;
    private double degreeNumber;
    private Map powMap;

    public SingleData(Scanner console)
    {
        this.console = console;
    }

    //Setter-Getter for number;
    public void setNumber() throws InputMismatchException{
        System.out.print("Введите число: ");
        number = console.nextDouble();
    }

    public double getNumber() {return number;}

    //Setter-Getter for Operation;
    public void setOperation() throws  InputMismatchException{
        System.out.print("Введите номер операции: ");
        operation = console.nextInt();
    }

    public int getOperation() {return operation;}

    //Setter-Getter for DegreeNumber;
    public void setDegreeNumber() throws InputMismatchException {
        System.out.print("Введите степень числа: ");
        degreeNumber = console.nextDouble();
    }

    public double getDegreeNumber() {return degreeNumber;}

    //Setter-Getter for PowMap;
    public Map setPowMap()
    {
        Map<Integer, Integer> powMap = new HashMap<Integer, Integer>();
        for (int i = 2; i <= 10; i++) {
            powMap.put(i, i*i);
        }
        return powMap;
    }

    public Map getPowMap() {return powMap;}
}
