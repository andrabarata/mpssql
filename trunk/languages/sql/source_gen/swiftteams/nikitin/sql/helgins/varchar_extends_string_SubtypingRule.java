package swiftteams.nikitin.sql.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelUtil_new;

public class varchar_extends_string_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public varchar_extends_string_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode stringDataType) {
    return new _Quotations.QuotationClass_2().createNode();
  }

  public String getApplicableConceptFQName() {
    return "swiftteams.nikitin.sql.structure.VarCharType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

}