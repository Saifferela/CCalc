import java.util.InputMismatchException;
import java.util.Scanner;

public class SetData {
    private Scanner console;
    private double number;
    private int operation;
    private double degreeNumber;
    private int numberDigits;
    private double modulusNumber;

    public SetData(Scanner console)
    {
        this.console = console;
    }

    //Setter-Getter for Operation;
    public void setOperation() throws  InputMismatchException{
        System.out.print("Введите номер операции: ");
        operation = console.nextInt();
    }

    public int getOperation() {return operation;}

    //Setter-Getter for NumberDigits;
    public void setNumberDigits() throws InputMismatchException {
        System.out.print("Введите количество цифр:");
        numberDigits = console.nextInt();
    }

    public int getNumberDigits() {return numberDigits;}

    //Setter-Getter for number;
    public void setNumber() throws InputMismatchException{
        System.out.print("Введите число: ");
        number = console.nextDouble();
    }

    public double getNumber() {return number;}


    //Setter-Getter for DegreeNumber;
    public void setDegreeNumber() throws InputMismatchException {
        System.out.print("Введите степень числа: ");
        degreeNumber = console.nextDouble();
    }

    public double getDegreeNumber() {return degreeNumber;}

    //Setter-Getter for ModulusNumber;
    public void setModulusNumber() throws InputMismatchException
    {
        System.out.print("Введите модуль числа: ");
        modulusNumber = console.nextDouble();
    }

    public double getModulusNumber() {return modulusNumber;}
}
