package org.uma.jmetal3.core;

/**
 * Created by Antonio on 03/09/14.
 */
public interface Solution {
  public void setObjective(int index, double value) ;
  public double getObjective(int index) ;

  public Object getVariableValue(int index) ;
  public void setVariableVariable(int index, Object value) ;
 }
