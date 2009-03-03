package swiftteams.nikitin.sql.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import java.util.Iterator;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_StringSequenceElements_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_StringSequenceElements_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    {
      SNode expression;
      Iterator<SNode> expression_iterator = SLinkOperations.getTargets(nodeToCheck, "strings", true).iterator();
      while (true) {
        if (!(expression_iterator.hasNext())) {
          break;
        }
        expression = expression_iterator.next();
        {
          SNode _nodeToCheck_1029348928467 = nodeToCheck;
          BaseIntentionProvider intentionProvider = null;
          typeCheckingContext.createEquation(typeCheckingContext.typeOf(expression, "r:dbc4dda4-aa7b-4bb3-bd7a-c125ebc04391(swiftteams.nikitin.sql.helgins)", "1217590251190", true), new _Quotations.QuotationClass_3().createNode(typeCheckingContext), _nodeToCheck_1029348928467, null, "r:dbc4dda4-aa7b-4bb3-bd7a-c125ebc04391(swiftteams.nikitin.sql.helgins)", "1217590256755", intentionProvider);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "swiftteams.nikitin.sql.structure.StringSequence";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
