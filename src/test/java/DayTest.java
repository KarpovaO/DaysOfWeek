import mypackage.Day;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static mypackage.DaysOfWeek.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayTest {
    Day day = new Day(5, MONDAY);

    @ParameterizedTest
    @CsvSource(value = {"'Test Next Day Week ','Monday','Tuesday'"})
    public void testGetNextDayWeek(String testName, String setDayOfWeek, String expected) {
        day.setDayOfWeek(MONDAY);
        String actual = day.getNexDayWeek(MONDAY);

        assertEquals(expected, actual);
    }
}
