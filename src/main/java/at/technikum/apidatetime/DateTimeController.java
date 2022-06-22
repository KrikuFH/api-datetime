package at.technikum.apidatetime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class DateTimeController {

    @RequestMapping("/api/time")
    public String time()
    {
        return java.time.LocalTime.now().toString();
    }

    @RequestMapping("/api/date")
    public String date()
    {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date();
        return formatter.format(date);
    }


}
