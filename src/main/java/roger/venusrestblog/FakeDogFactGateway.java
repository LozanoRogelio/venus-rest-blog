package roger.venusrestblog;

import org.springframework.web.bind.annotation.PathVariable;

public class FakeDogFactGateway {
    public static String fetchDogFactById(@PathVariable long id) {
//        TODO: Fetch the particular dog fact with matching id from data
        switch((int) id) {
            case 1:
                return "Dogs don't feel Guilty";

            case 2:
                return "Their sense of smell is really powerful";
            default:
                return "Unknown fact id!";
        }
    }
}
