package com.restcountries.restcountries;

import java.util.List;

public class RegionalBlocs {
  private String acronym;
  private String name;
  private List<String> otherAcronyms;
  private List<String> otherNames;

  public RegionalBlocs() {

  }

  public String getAcronym() {
    return acronym;
  }

  public void setAcronym(String acronym) {
    this.acronym = acronym;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getOtherAcronyms() {
    return otherAcronyms;
  }

  public void setOtherAcronyms(List<String> otherAcronyms) {
    this.otherAcronyms = otherAcronyms;
  }

  public List<String> getOtherNames() {
    return otherNames;
  }

  public void setOtherNames(List<String> otherNames) {
    this.otherNames = otherNames;
  }

  @Override
  public String toString() {
    return "RegionalBlocs{" +
            "acronym='" + acronym + '\'' +
            ", name='" + name + '\'' +
            ", otherAcronyms=" + otherAcronyms +
            ", otherNames=" + otherNames +
            '}';
  }
}
