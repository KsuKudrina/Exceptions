package Sem_3.HomeWork_3.Program;
import Sem_3.HomeWork_3.Exception.NotValidDateException;
import Sem_3.HomeWork_3.Exception.*;
import java.io.*;
import java.nio.file.FileSystemException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Run {

    public static void ReadingData() throws ConsoleException, IOException, NotValidDateException {

        while (true) {


            System.out.println("Введите Фамилию, Имя, Отчество, дату рождения(в формате dd.mm.yyyy), " +
                    "номер телефона (число без пробелов) и пол(символ латиницей f или m), разделенные пробелом");

            String text;

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                text = br.readLine();

            if(text.isEmpty())
                break;

            String[] arr = text.split(" ");
            if (arr.length != 6) throw new ConsoleException("Введено неверное количество параметров");
            String surname = arr[0];
            String name = arr[1];
            String patronymic = arr[2];

            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

            Date birthdate = null;

            try {
                birthdate = format.parse(arr[3]);
            } catch (ParseException e) {
                System.out.println("Ошибка при вводе данных.");
            }

            String phone;

            phone = arr[4];

            String gender = arr[5];
            if (!gender.equalsIgnoreCase("m") && !gender.equalsIgnoreCase("f")) {
                System.out.println("Ошибка при вводе данных. Укажите пол символом 'f' или 'm'!");
            }

            if (!isValidDate(birthdate)) {
                System.out.println("Проблема с датой");
                break;
            } else if (!isValidNumberPhone(phone)) {
                System.out.println("Проблема с телефоном");
                break;
            }

            String fileName = surname.toLowerCase() + ".txt";
            String str = surname + " " + name + " " + patronymic + " " + format.format(birthdate) + " " + phone + " " + gender;
            try (BufferedWriter wr = new BufferedWriter(new FileWriter(fileName, true))) {
                wr.write(str);
                wr.newLine();
            } catch (IOException e) {
                throw new FileSystemException("Возникла ошибка при работе с файлом");
            }
        }
    }
    private static boolean isValidNumberPhone(String phone){
        final String patterns = "^\\d{11}$";
        boolean isValid = phone.matches(patterns);
        if(!isValid) {
            try {

                throw new NumberPhoneException(phone);
            } catch (NumberPhoneException e) {
                e.numPhoneEx(phone);
            }
        }
        return true;
    }

    private static boolean isValidDate(Date date) throws NotValidDateException {

        Calendar cal = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);
        cal.set(1900, 0, 1); // установить минимальный диапазон года до 1900
        Date minDate = cal.getTime();
        cal.set(currentYear, 11, 31); // установить максимальный диапазон года до текущего года
        Date maxDate = cal.getTime();
        cal2.setTime(date);
        int month = cal2.get(Calendar.MONTH) + 1;
        cal2.set(Calendar.MONTH, 0);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        int maxMonth = cal.getActualMaximum(Calendar.MONTH) + 1;

        if (date.before(minDate) || date.after(maxDate))
            throw new NotValidDateException("Год должен быть в диапазоне от 1900 до " + currentYear);
        if (month < 1 || month > maxMonth)
            throw new NotValidDateException("Месяц должен быть в диапазоне от 1 до " + maxMonth);
        if (day < 1 || day > maxDay) throw new NotValidDateException("День должен быть в диапазоне от 1 до 31");
        return true;
    }
}
