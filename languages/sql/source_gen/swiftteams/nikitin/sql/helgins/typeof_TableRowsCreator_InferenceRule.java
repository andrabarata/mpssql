package swiftteams.nikitin.sql.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_TableRowsCreator_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_TableRowsCreator_InferenceRule() {
  }

  public void applyRule(final SNode creator, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = creator;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(creator, "r:dbc4dda4-aa7b-4bb3-bd7a-c125ebc04391(swiftteams.nikitin.sql.helgins)", "1218193416056", true), (SNode)SLinkOperations.getTarget(creator, "type", true), _nodeToCheck_1029348928467, null, "r:dbc4dda4-aa7b-4bb3-bd7a-c125ebc04391(swiftteams.nikitin.sql.helgins)", "1218193420653", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "swiftteams.nikitin.sql.structure.TableRowsCreator";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
