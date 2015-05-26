package test;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.*;

@RestController
public class WelcomeController {

    private static final String welcomeTemplate = "Hello %s, I see you are from ";
    private static final String locationTemplate = "%s";

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/welcome")
    public Welcome welcome(@RequestParam(value="userName", defaultValue="New User") String userName,
                           @RequestParam(value="userLocation") String userLocation) {
        return new Welcome(counter.incrementAndGet(), String.format(welcomeTemplate, userName).concat(String.format(locationTemplate, userLocation)), userLocation);
    }
}
