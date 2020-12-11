package com.restcountries.restcountries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {
  private String name;
  private List<String> topLevelDomain;
  private String alpha2Code;
  private String alpha3Code;
  private List<String> callingCodes;
  private String capital;
  private List<String> altSpellings;
  private String region;
  private String subregion;
  private String population;
  private List<Float> latlng;
  private String demonym;
  private String area;
  private String gini;
  private List<String> timezones;
  private List<String> borders;
  private String nativeName;
  private String numericCode;
  private List<Currency> currencies;
  private List<Language> languages;
  private Translation translations;
  private String flag;
  private List<RegionalBlocs> regionalBlocs;
  private String cioc;

  public Country() {

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getTopLevelDomain() {
    return topLevelDomain;
  }

  public void setTopLevelDomain(List<String> topLevelDomain) {
    this.topLevelDomain = topLevelDomain;
  }

  public String getAlpha2Code() {
    return alpha2Code;
  }

  public void setAlpha2Code(String alpha2Code) {
    this.alpha2Code = alpha2Code;
  }

  public String getAlpha3Code() {
    return alpha3Code;
  }

  public void setAlpha3Code(String alpha3Code) {
    this.alpha3Code = alpha3Code;
  }

  public List<String> getCallingCodes() {
    return callingCodes;
  }

  public void setCallingCodes(List<String> callingCodes) {
    this.callingCodes = callingCodes;
  }

  public String getCapital() {
    return capital;
  }

  public void setCapital(String capital) {
    this.capital = capital;
  }

  public List<String> getAltSpellings() {
    return altSpellings;
  }

  public void setAltSpellings(List<String> altSpellings) {
    this.altSpellings = altSpellings;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public String getSubregion() {
    return subregion;
  }

  public void setSubregion(String subregion) {
    this.subregion = subregion;
  }

  public String getPopulation() {
    return population;
  }

  public void setPopulation(String population) {
    this.population = population;
  }

  public List<Float> getLatlng() {
    return latlng;
  }

  public void setLatlng(List<Float> latlng) {
    this.latlng = latlng;
  }

  public String getDemonym() {
    return demonym;
  }

  public void setDemonym(String demonym) {
    this.demonym = demonym;
  }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public String getGini() {
    return gini;
  }

  public void setGini(String gini) {
    this.gini = gini;
  }

  public List<String> getTimezones() {
    return timezones;
  }

  public void setTimezones(List<String> timezones) {
    this.timezones = timezones;
  }

  public List<String> getBorders() {
    return borders;
  }

  public void setBorders(List<String> borders) {
    this.borders = borders;
  }

  public String getNativeName() {
    return nativeName;
  }

  public void setNativeName(String nativeName) {
    this.nativeName = nativeName;
  }

  public String getNumericCode() {
    return numericCode;
  }

  public void setNumericCode(String numericCode) {
    this.numericCode = numericCode;
  }

  public List<Currency> getCurrencies() {
    return currencies;
  }

  public void setCurrencies(List<Currency> currencies) {
    this.currencies = currencies;
  }

  public List<Language> getLanguages() {
    return languages;
  }

  public void setLanguages(List<Language> languages) {
    this.languages = languages;
  }

  public Translation getTranslations() {
    return translations;
  }

  public void setTranslations(Translation translations) {
    this.translations = translations;
  }

  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }

  public List<RegionalBlocs> getRegionalBlocs() {
    return regionalBlocs;
  }

  public void setRegionalBlocs(List<RegionalBlocs> regionalBlocs) {
    this.regionalBlocs = regionalBlocs;
  }

  public String getCioc() {
    return cioc;
  }

  public void setCioc(String cioc) {
    this.cioc = cioc;
  }

  @Override
  public String toString() {
    return "Country{" +
            "name='" + name + '\'' +
            ", topLevelDomain=" + topLevelDomain +
            ", alpha2Code='" + alpha2Code + '\'' +
            ", alpha3Code='" + alpha3Code + '\'' +
            ", callingCodes=" + callingCodes +
            ", capital='" + capital + '\'' +
            ", altSpellings=" + altSpellings +
            ", region='" + region + '\'' +
            ", subregion='" + subregion + '\'' +
            ", population='" + population + '\'' +
            ", latlng=" + latlng +
            ", demonym='" + demonym + '\'' +
            ", area='" + area + '\'' +
            ", gini='" + gini + '\'' +
            ", timezones=" + timezones +
            ", borders=" + borders +
            ", nativeName='" + nativeName + '\'' +
            ", numericCode='" + numericCode + '\'' +
            ", currencies=" + currencies +
            ", languages=" + languages +
            ", translations=" + translations +
            ", flag='" + flag + '\'' +
            ", regionalBlocs=" + regionalBlocs +
            ", cioc='" + cioc + '\'' +
            '}';
  }
}
