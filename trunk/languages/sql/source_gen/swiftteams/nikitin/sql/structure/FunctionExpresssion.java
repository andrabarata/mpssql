package swiftteams.nikitin.sql.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class FunctionExpresssion extends Expression {
  public static final String concept = "swiftteams.nikitin.sql.structure.FunctionExpresssion";

  public FunctionExpresssion(SNode node) {
    super(node);
  }

  public static FunctionExpresssion newInstance(SModel sm, boolean init) {
    return (FunctionExpresssion)SModelUtil_new.instantiateConceptDeclaration("swiftteams.nikitin.sql.structure.FunctionExpresssion", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static FunctionExpresssion newInstance(SModel sm) {
    return FunctionExpresssion.newInstance(sm, false);
  }

}