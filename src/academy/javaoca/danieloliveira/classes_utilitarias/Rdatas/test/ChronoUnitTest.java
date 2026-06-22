package academy.javaoca.danieloliveira.classes_utilitarias.Rdatas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1990, Month.OCTOBER,31,12,0,0  );
        LocalDateTime now = LocalDateTime.now();
        System.out.println("DIAS: " + ChronoUnit.DAYS.between(aniversario,now));
        System.out.println("SEMANAS: " + ChronoUnit.WEEKS.between(aniversario,now));
        System.out.println("MESES: " + ChronoUnit.MONTHS.between(aniversario,now));
        System.out.println("ANOS: " + ChronoUnit.YEARS.between(aniversario,now));
    }
}
