package ie.atu.hello;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @PostMapping("/confirm")
    public String confirmDetails(@RequestBody UserDetails userDetails){
        String confirmationMessage = String.format("Request details for %s with email %s", userDetails.getName(), userDetails.getEmail());
        return confirmationMessage;
    }

}
