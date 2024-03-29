package home_work_4.test.dto;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TimerTest {
    private final LocalTime first;
    private final LocalTime second;

    public TimerTest(LocalTime first, LocalTime second) {
        this.first = first;
        this.second = second;
    }

    public LocalTime getFirst() {
        return first;
    }

    public LocalTime getSecond() {
        return second;
    }

    public long betweenTime () {
        return (ChronoUnit.NANOS.between(first, second) / 1_000_000);
    }
}
