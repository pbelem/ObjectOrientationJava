package aplication;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class OperationsWithData {

	public static void main(String[] args) {

		DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt04 = DateTimeFormatter.ISO_DATE_TIME;
//		exist a lot of formats readys like fmt04
//		DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2024-10-16");
		LocalDateTime d05 = LocalDateTime.parse("2024-10-16T22:30:26");
		Instant d06 = Instant.parse("2024-10-16T22:30:26Z");
		Instant d07 = Instant.parse("2024-10-16T22:30:26-03:00");
		LocalDate d08 = LocalDate.parse("16/10/2024", fmt01);
		LocalDate d09 = LocalDate.parse("16/10/2024 22:00", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		LocalDate d10 = LocalDate.of(2024, 10, 16);
		LocalDateTime d11 = LocalDateTime.of(2024, 10, 16, 22, 00);
//				d11 has many overlords(sobrecargas)

		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
//		System.out.printf("d01 = %tH%tM%tS", d01);
//		we can use with format too, but its necessary to search

		System.out.println("d04 = " + d04.format(fmt01));
		System.out.println("d04 = " + fmt01.format(d04));
		System.out.println("d05 = " + d05.format(fmt01));
		System.out.println("d05 = " + d05.format(fmt02));
		System.out.println("d06 = " + fmt03.format(d06));
		System.out.println("d05 = " + fmt04.format(d05));
//		Time variable with local formatting and time zone

		LocalDate r01 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
//		how to convert global variable to local variable
		System.out.println("r01 = " + r01);
		LocalDate r02 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
//		getting a local date and converting to other local zone
		System.out.println("r02 = " + r02);
		System.out.println("d04 day = " + d04.getDayOfMonth());
		System.out.println("d04 mounth = " + d04.getMonthValue());
		System.out.println("d04 year = " + d04.getYear());
		System.out.println("d05 hour = " + d05.getHour());
		System.out.println("d05 minute = " + d05.getMinute());

		System.out.println("\nCalculations with dates");

		LocalDate pastWeek = d04.minusDays(7);
		LocalDate nextWeek = d04.plusDays(7);

		System.out.println();
		System.out.println("past week = " + pastWeek);
		System.out.println("next week = " + nextWeek);

		LocalDateTime pastWeekTime = d05.minusDays(7);
		LocalDateTime nextWeekTime = d05.plusDays(7);
		LocalDateTime plusMinutes = d05.plusMinutes(30);

		System.out.println("past week = " + pastWeekTime);
		System.out.println("next week = " + nextWeekTime);
		System.out.println("add minutes = " + plusMinutes);

		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("past week with Instant = " + pastWeekInstant);
		System.out.println("next week with Instant = " + nextWeekInstant);
		
		Duration t01 = Duration.between(pastWeek.atStartOfDay(), d04.atTime(0, 0));
		Duration t02 = Duration.between(pastWeekTime, d05);
		Duration t03 = Duration.between(pastWeekInstant, d06);
		Duration t04 = Duration.between(d06, pastWeekInstant);
		
		System.out.println();
		System.out.println("t01 = " + t01.toDays());
		System.out.println("t02 = " + t02.toDays());
		System.out.println("t03 = " + t03.toDays());
		System.out.println("t04 = " + t04.toDays());
		
	}

}
