package org.openstreetmap.josm.plugins.openservices.arcgis.rest;

import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openstreetmap.josm.plugins.openservices.CustomDataSet;

public abstract class ArggisRestDataSet extends CustomDataSet {
  private final ArcgisJsonParser jsonParser;

  public ArggisRestDataSet(ArcgisJsonParser jsonParser) {
    super();
    this.jsonParser = jsonParser;
  }
  
  /**
   * Add Json features to the dataSet
   * @param layer 
   * @param features
   */
  public void addFeatures(ArcgisRestLayer layer, JSONArray features) {
    @SuppressWarnings("unchecked")
    Iterator<JSONObject> i = features.iterator();
    while (i.hasNext()) {
      JSONObject feature = i.next();
      add(jsonParser.parse(layer, feature));
    }
  }
}
