package practicals;
public class temperature {
    public static void main(String[] args)
    {
        // temperature in fahrenheit
        double f = 50.0, c = 0.0;

        // calculate celsius temperature
        c = (f - 32) / 1.8;

        // print the celsius temperature
        System.out.println(
            "value of temperature in celsius:" + c);
    }
}

