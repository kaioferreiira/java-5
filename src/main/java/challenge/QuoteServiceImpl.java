package challenge;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuoteServiceImpl implements QuoteService {

	@Autowired
	private QuoteRepository quoteRepository;

	//    Retorna uma frase aleatória de qualquer ator.
	@Override
	public Quote getQuote() {
		List <Quote> quote =  quoteRepository.findAll();
		Random aleatorio = new Random();
		return quote.get(aleatorio.nextInt(18306) - 1);
	}

	//    Retorna uma frase aleatória do ator passado como parâmetro.
	@Override
	public Quote getQuoteByActor(String actorName) {

		List<Quote> quotes = quoteRepository.findAllByActorContains(actorName);
		int tamanho = quotes.size();
		Random aleatorio = new Random();
		return quotes.get(aleatorio.nextInt(tamanho) -1);
	}


}
