package roger.venusrestblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import roger.venusrestblog.FakeDogFactGateway;

@Controller
public class DogFactController {
    @GetMapping("/dogo")
    @ResponseBody
    public String fetchDogFact() {
        return "Puppies are a pain in the butt";
    }

    @GetMapping("/dogo/{id}")
    @ResponseBody
    public String fetchSingleDogFact(@PathVariable long id) {
//        TODO: Fetch the particular dog fact with matching id from data
        return FakeDogFactGateway.fetchDogFactById(id);
    }
}
