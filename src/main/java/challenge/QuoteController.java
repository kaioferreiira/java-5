package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

	@Autowired
	private QuoteServiceImpl service;

	@RequestMapping(value="/v1/quote", method= RequestMethod.GET)
	public ResponseEntity <Quote> getQuote() {
		return ResponseEntity.ok(service.getQuote());
	}

//	@GetMapping(name = "/v1/quote/{actor}")
	@RequestMapping(value="/v1/quote/{actor}", method= RequestMethod.GET)
	public ResponseEntity <Quote> getQuoteByActor(@PathVariable("actor") String actor) {
		Quote quote = service.getQuoteByActor(actor);
		return ResponseEntity.ok(quote);
	}

}
