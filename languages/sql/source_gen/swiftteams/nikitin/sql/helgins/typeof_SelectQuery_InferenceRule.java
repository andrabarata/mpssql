package swiftteams.nikitin.sql.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_SelectQuery_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_SelectQuery_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    final SNode T_typevar_1218044217413 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation((SNode)typeCheckingContext.getEquationManager().getRepresentator(T_typevar_1218044217413), (SNode)typeCheckingContext.typeOf(SLinkOperations.getTarget(nodeToCheck, "subquery", true), "r:dbc4dda4-aa7b-4bb3-bd7a-c125ebc04391(swiftteams.nikitin.sql.helgins)", "1218044234156", true), _nodeToCheck_1029348928467, null, "r:dbc4dda4-aa7b-4bb3-bd7a-c125ebc04391(swiftteams.nikitin.sql.helgins)", "1218044224681", intentionProvider);
    }
    SNode tr = SModelOperations.createNewNode(SNodeOperations.getModel(nodeToCheck), "swiftteams.nikitin.sql.structure.TableRows", null);
    SLinkOperations.setTarget(tr, "row", typeCheckingContext.getEquationManager().getRepresentator(T_typevar_1218044217413), true);
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(nodeToCheck, "r:dbc4dda4-aa7b-4bb3-bd7a-c125ebc04391(swiftteams.nikitin.sql.helgins)", "1217410077515", true), (SNode)tr, _nodeToCheck_1029348928467, null, "r:dbc4dda4-aa7b-4bb3-bd7a-c125ebc04391(swiftteams.nikitin.sql.helgins)", "1217410077513", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "swiftteams.nikitin.sql.structure.SelectQuery";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
