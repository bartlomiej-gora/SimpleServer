package pl.bgora.rest.server;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/sayHello", method = RequestMethod.POST)
    public SayHelloResponse getHello(@RequestBody SayHelloRequest sayHelloRequest){
        final String message = "Hello there " + sayHelloRequest.getName() + " " + sayHelloRequest.getSurname();
        final SayHelloResponse sayHelloResponse = new SayHelloResponse();
        sayHelloResponse.setName(sayHelloRequest.getName());
        sayHelloResponse.setSurname(sayHelloRequest.getSurname());
        sayHelloResponse.setMessage(message);
        return sayHelloResponse;
    }
}
