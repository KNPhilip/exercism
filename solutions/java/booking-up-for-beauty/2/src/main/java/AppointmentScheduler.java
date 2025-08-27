import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import static java.lang.String.format;

public final class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("M/dd/yyyy HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(appointmentDateDescription, parser);

        return dateTime;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime now = LocalDateTime.now();
        return appointmentDate.isBefore(now);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int appointmentHour = appointmentDate.getHour();
        return appointmentHour >= 12 && appointmentHour < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter parser = DateTimeFormatter
            .ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a");
        
        return format("You have an appointment on %s.", parser.format(appointmentDate));
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(2025, 9, 15);
    }
}
