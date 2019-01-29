package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/quote")
public class QuoteController {

    @Autowired
    private QuoteServiceImpl service;

    @RequestMapping(method= RequestMethod.GET)
    public Quote getQuote() {
        return service.getQuote();
    }

    @RequestMapping(value="{actor}", method= RequestMethod.GET)
    public Quote getQuoteByActor(@PathVariable String actor) {
        return service.getQuoteByActor(actor);
    }

}
