package swiftteams.nikitin.sql.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelUtil_new;

public class sqltimestamp_extends_timestamp_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public sqltimestamp_extends_timestamp_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode timeStampDataType) {
    return new _Quotations.QuotationClass_7().createNode();
  }

  public String getApplicableConceptFQName() {
    return "swiftteams.nikitin.sql.structure.TimeStampDataType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

}