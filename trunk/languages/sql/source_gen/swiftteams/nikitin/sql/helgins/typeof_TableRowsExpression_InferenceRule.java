package swiftteams.nikitin.sql.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.collections.typesystem.RulesFunctions_Collections;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_TableRowsExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_TableRowsExpression_InferenceRule() {
  }

  public void applyRule(final SNode expression, final TypeCheckingContext typeCheckingContext) {
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(expression), "jetbrains.mps.baseLanguage.collections.structure.SequenceOperation")) {
      RulesFunctions_Collections.setInputElementType(typeCheckingContext, SNodeOperations.getParent(expression), expression);
    }
  }

  public String getApplicableConceptFQName() {
    return "swiftteams.nikitin.sql.structure.TableRowsExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
