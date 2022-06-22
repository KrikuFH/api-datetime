package at.technikum.apidatetime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DateTimeController {

    @RequestMapping("/api/time")
    public String time()
    {
        return java.time.LocalTime.now().toString();
    }
}
