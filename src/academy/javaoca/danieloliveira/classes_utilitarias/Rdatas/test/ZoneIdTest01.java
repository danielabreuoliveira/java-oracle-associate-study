package academy.javaoca.danieloliveira.classes_utilitarias.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Locale;
import java.util.Map;

public class ZoneIdTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId shangaiZone = ZoneId.of("Asia/Shanghai");
        System.out.println(shangaiZone);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime zonedDateTime = now.atZone(shangaiZone);
        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTime1 = nowInstant.atZone(shangaiZone);
        System.out.println(zonedDateTime1);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime);

        OffsetDateTime offsetDateTime1 = OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime1);

        OffsetDateTime offsetDateTime2 = nowInstant.atOffset(offsetManaus);
        System.out.println(offsetDateTime2);

        JapaneseDate japoneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japoneseDate);
        LocalDate meijiEraLocalDate = LocalDate.of(1900, 2, 1);
        JapaneseDate.from(meijiEraLocalDate);
        System.out.println(meijiEraLocalDate);
    }
}
