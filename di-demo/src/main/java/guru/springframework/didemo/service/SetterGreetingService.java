package guru.springframework.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {


    @Override
    public String sayGreeting() {
        return "Hello - I was injected with the setter!";
    }
}
