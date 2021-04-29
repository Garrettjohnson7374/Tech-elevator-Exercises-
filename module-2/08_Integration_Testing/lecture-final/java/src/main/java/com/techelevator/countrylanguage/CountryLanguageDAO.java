package com.techelevator.countrylanguage;

import java.util.List;

public interface CountryLanguageDAO {
    List<CountryLanguage> getLanguageForCountry (String countryCode);
    void updateLanguage(CountryLanguage cl);


}
