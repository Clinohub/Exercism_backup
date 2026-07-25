import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    LocalDateTime dateReceived;
    public Gigasecond(LocalDate moment) {
        this.dateReceived = moment.atStartOfDay();
    }

    public Gigasecond(LocalDateTime moment) {
        this.dateReceived = moment;
    }

    public LocalDateTime getDateTime() {
        return dateReceived.plusSeconds(1_000_000_000);
    }
}
