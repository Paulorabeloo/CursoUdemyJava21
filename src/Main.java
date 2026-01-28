import java.sql.SQLOutput;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        //referencia
        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        //objetos de formatação de data hora
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //DATA HORA LOCAL
        //instanciando a data
        LocalDate d01 = LocalDate.now();
        //instanciando a data-hora
        LocalDateTime d02 = LocalDateTime.now();

        //DATA HORA GLOBAL - (Z NO FINAL -> GMT) - horário de Londres 3 horas à frente
        Instant d03 = Instant.now();

        //TEXTO ISO 8601 -> Data-hora
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        //PADRÃO UTC(GLOBAL)
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        //3Horas adiantado (Horario de londres - horario adiantado, ex sp);
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");

        //formatação customizada usando DataTimeFormatter
        LocalDate d08 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);

        System.out.println("d01 = " + d01.toString());
        System.out.println("d02 = " + d02.toString());
        System.out.println("d03 = " + d03.toString());
        System.out.println("d04 = " + d04.toString());
        System.out.println("d05 = " + d05.toString());
        System.out.println("d06 = " + d06.toString());
        System.out.println("d07 = " + d07.toString());
        System.out.println("d08 = " + d08.toString());
        System.out.println("d09 = " + d09.toString());
        System.out.println("d10 = " + d10.toString());
        System.out.println("d11 = " + d11.toString());
    }
}