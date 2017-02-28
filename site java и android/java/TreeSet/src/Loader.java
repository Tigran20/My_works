import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;


public class Loader
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TreeSet<String> set = new TreeSet<>();
        for(;;)
        {
            System.out.println("Введите следующий элемент: ");
            String command = reader.readLine().trim();
            if(command.equals("LIST"))
            {
                for(String s : set)
                {
                    System.out.println(s);
                }
            }
            else
            {
                set.add(command);
            }
        }
    }
}
