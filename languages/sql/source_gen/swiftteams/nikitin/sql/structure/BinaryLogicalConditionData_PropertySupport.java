package swiftteams.nikitin.sql.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.PropertySupport;
import java.util.Iterator;

public class BinaryLogicalConditionData_PropertySupport extends PropertySupport {

  public boolean canSetValue(String value) {
    if (value == null) {
      return true;
    }
    Iterator<BinaryLogicalConditionData> constants = BinaryLogicalConditionData.getConstants().iterator();
    while (constants.hasNext()) {
      BinaryLogicalConditionData constant = constants.next();
      if (value.equals(constant.getName())) {
        return true;
      }
    }
    return false;
  }

  public String toInternalValue(String value) {
    if (value == null) {
      return null;
    }
    Iterator<BinaryLogicalConditionData> constants = BinaryLogicalConditionData.getConstants().iterator();
    while (constants.hasNext()) {
      BinaryLogicalConditionData constant = constants.next();
      if (value.equals(constant.getName())) {
        return constant.getValueAsString();
      }
    }
    return null;
  }

  public String fromInternalValue(String value) {
    BinaryLogicalConditionData constant = BinaryLogicalConditionData.parseValue(value);
    if (constant != null) {
      return constant.getName();
    }
    return "";
  }

}