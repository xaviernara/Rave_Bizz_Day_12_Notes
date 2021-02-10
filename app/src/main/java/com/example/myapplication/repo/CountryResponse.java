package com.example.myapplication.repo;

import com.example.myapplication.model.CapitalCity;
import com.example.myapplication.model.Currencies;
import com.example.myapplication.model.Language;
import com.example.myapplication.model.Name;
import com.example.myapplication.model.Region;
import com.example.myapplication.model.RegionalBlock;
import com.example.myapplication.model.ResponseExample;
import com.squareup.moshi.Json;

public class CountryResponse {

    /*
     [
        {
        "name": "United States of America",
        "topLevelDomain": [
            ".us"
        ],
        "alpha2Code": "US",
        "alpha3Code": "USA",
        "callingCodes": [
            "1"
        ],
        "capital": "Washington, D.C.",
        "altSpellings": [
            "US",
            "USA",
            "United States of America"
        ],
        "region": "Americas",
        "subregion": "Northern America",
        "population": 323947000,
        "latlng": [
            38.0,
            -97.0
        ],
        "demonym": "American",
        "area": 9629091.0,
        "gini": 48.0,
        "timezones": [
            "UTC-12:00",
            "UTC-11:00",
            "UTC-10:00",
            "UTC-09:00",
            "UTC-08:00",
            "UTC-07:00",
            "UTC-06:00",
            "UTC-05:00",
            "UTC-04:00",
            "UTC+10:00",
            "UTC+12:00"
        ],
        "borders": [
            "CAN",
            "MEX"
        ],
        "nativeName": "United States",
        "numericCode": "840",
        "currencies": [
            {
                "code": "USD",
                "name": "United States dollar",
                "symbol": "$"
            }
        ],
        "languages": [
            {
                "iso639_1": "en",
                "iso639_2": "eng",
                "name": "English",
                "nativeName": "English"
            }
        ],
        "translations": {
            "de": "Vereinigte Staaten von Amerika",
            "es": "Estados Unidos",
            "fr": "États-Unis",
            "ja": "アメリカ合衆国",
            "it": "Stati Uniti D'America",
            "br": "Estados Unidos",
            "pt": "Estados Unidos",
            "nl": "Verenigde Staten",
            "hr": "Sjedinjene Američke Države",
            "fa": "ایالات متحده آمریکا"
        },
        "flag": "https://restcountries.eu/data/usa.svg",
        "regionalBlocs": [
            {
                "acronym": "NAFTA",
                "name": "North American Free Trade Agreement",
                "otherAcronyms": [],
                "otherNames": [
                    "Tratado de Libre Comercio de América del Norte",
                    "Accord de Libre-échange Nord-Américain"
                ]
            }
        ],
        "cioc": "USA"
    }
]



     */


    private Name name;
    private Currencies currency;
    private Language language;
    private CapitalCity capitalCity;
    private Region region;
    private RegionalBlock regionalBlock;
    private ResponseExample responseExample;

    @Json(name = "flag")
    private String flagUrl;



    public CountryResponse(Name name, Currencies currency, Language language, CapitalCity capitalCity, Region region, RegionalBlock regionalBlock, ResponseExample responseExample) {
        this.name = name;
        this.currency = currency;
        this.language = language;
        this.capitalCity = capitalCity;
        this.region = region;
        this.regionalBlock = regionalBlock;
        this.responseExample = responseExample;
    }

    public String getFlagUrl() {
        return flagUrl;
    }

    public void setFlagUrl(String flagUrl) {
        this.flagUrl = flagUrl;
    }
    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Currencies getCurrency() {
        return currency;
    }

    public void setCurrency(Currencies currency) {
        this.currency = currency;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public CapitalCity getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(CapitalCity capitalCity) {
        this.capitalCity = capitalCity;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public RegionalBlock getRegionalBlock() {
        return regionalBlock;
    }

    public void setRegionalBlock(RegionalBlock regionalBlock) {
        this.regionalBlock = regionalBlock;
    }

    public ResponseExample getResponseExample() {
        return responseExample;
    }

    public void setResponseExample(ResponseExample responseExample) {
        this.responseExample = responseExample;
    }
}
