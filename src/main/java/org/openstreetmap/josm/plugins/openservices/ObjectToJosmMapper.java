package org.openstreetmap.josm.plugins.openservices;



/**
 * Create Josm primitives from java objects and add them to
 * the supplied Josm DataSet 
 * 
 * @author Gertjan Idema
 *
 */
public interface ObjectToJosmMapper {
  public void create(Object o);
}
