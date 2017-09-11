package hello;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Country;
import io.spring.guides.gs_producing_web_service.Currency;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CountryRepository {
	private static final Map<String, Country> countries = new HashMap<>();

	@PostConstruct
	public void initData() {
		Country spain = new Country();
		spain.setName("Spain");
		spain.setCapital("Madrid");
		spain.setCurrency(Currency.EUR);
		spain.setPopulation(46704314);

		countries.put(spain.getName(), spain);

		Country poland = new Country();
		poland.setName("Poland");
		poland.setCapital("Warsaw");
		poland.setCurrency(Currency.PLN);
		poland.setPopulation(38186860);

		countries.put(poland.getName(), poland);

		Country uk = new Country();
		uk.setName("United Kingdom");
		uk.setCapital("London");
		uk.setCurrency(Currency.GBP);
		uk.setPopulation(63705000);

		countries.put(uk.getName(), uk);
		
		Country india = new Country();
		india.setName("India");	
		india.setCapital("NewDelhi");
		india.setCurrency(Currency.INR);
		india.setPopulation(263705000);

		countries.put(india.getName(), india);

		Country france = new Country();
		india.setName("France");	
		india.setCapital("Paris");
		india.setCurrency(Currency.EUR);
		india.setPopulation(263705000);

		countries.put(france.getName(), france);

		Country france = new Country();
		india.setName("SriLanka");	
		india.setCapital("Colombo");
		india.setCurrency(Currency.RUPEE);
		india.setPopulation(263705000);

		countries.put(france.getName(), france);
	}

	public Country findCountry(String name) {
		Assert.notNull(name, "The country's name must not be null");
		return countries.get(name);
	}
}
