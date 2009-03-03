package swiftteams.nikitin.sql.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.PropertySupport;
import java.util.Iterator;

public class NonListMembershipConditionModifierData_PropertySupport extends PropertySupport {

  public boolean canSetValue(String value) {
    if (value == null) {
      return true;
    }
    Iterator<NonListMembershipConditionModifierData> constants = NonListMembershipConditionModifierData.getConstants().iterator();
    while (constants.hasNext()) {
      NonListMembershipConditionModifierData constant = constants.next();
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
    Iterator<NonListMembershipConditionModifierData> constants = NonListMembershipConditionModifierData.getConstants().iterator();
    while (constants.hasNext()) {
      NonListMembershipConditionModifierData constant = constants.next();
      if (value.equals(constant.getName())) {
        return constant.getValueAsString();
      }
    }
    return null;
  }

  public String fromInternalValue(String value) {
    NonListMembershipConditionModifierData constant = NonListMembershipConditionModifierData.parseValue(value);
    if (constant != null) {
      return constant.getName();
    }
    return "";
  }

}
