package Hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WishesController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/wishes")
    public Wishes greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Wishes(counter.incrementAndGet(),
                String.format(template, name));
    }
}