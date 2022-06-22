package at.technikum.apidatetime;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class DateTimeControllerTest {

    @Test
    void time()
    {
        // Arrange
        String x = java.time.LocalTime.now().toString();

        DateTimeController cc = new DateTimeController();
        // Act

        String time = cc.time();

        // Assert
        assertNotEquals(x,time);
    }

    @Test
    void dateFormat()
    {
        // Arrange
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
        Date date = new Date();
        String x = formatter.format(date);

        DateTimeController cc = new DateTimeController();
        // Act

        String time = cc.date("yyyy.MM.dd");

        // Assert
        assertEquals(x,time);
    }

}