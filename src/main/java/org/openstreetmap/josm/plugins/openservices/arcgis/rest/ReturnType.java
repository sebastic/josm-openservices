package org.openstreetmap.josm.plugins.openservices.arcgis.rest;

public enum ReturnType {
  HTML("html"), KMZ("kmz"), JSON("json");
  private String name;
  
  ReturnType(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}