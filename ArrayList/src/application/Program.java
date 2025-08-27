package application;


import util.Register;
import java.text.ParseException;
import java.util.Locale;

//src17
public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Register.WorkerRegister();
    }
}