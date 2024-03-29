package swiftteams.nikitin.sql.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Operator extends BaseConcept {
  public static final String concept = "swiftteams.nikitin.sql.structure.Operator";

  public Operator(SNode node) {
    super(node);
  }

  public static Operator newInstance(SModel sm, boolean init) {
    return (Operator)SModelUtil_new.instantiateConceptDeclaration("swiftteams.nikitin.sql.structure.Operator", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Operator newInstance(SModel sm) {
    return Operator.newInstance(sm, false);
  }

}
