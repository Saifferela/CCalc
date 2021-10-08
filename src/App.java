import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        try
        {
            Menu menu = new Menu(console);
        }
        catch (Exception e)
        {
            System.out.println("Ошибка ввода!");
        }

    }
}
