package swiftteams.nikitin.sql.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ShutDownQuery extends AbstractQuery {
  public static final String concept = "swiftteams.nikitin.sql.structure.ShutDownQuery";

  public ShutDownQuery(SNode node) {
    super(node);
  }

  public static ShutDownQuery newInstance(SModel sm, boolean init) {
    return (ShutDownQuery)SModelUtil_new.instantiateConceptDeclaration("swiftteams.nikitin.sql.structure.ShutDownQuery", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ShutDownQuery newInstance(SModel sm) {
    return ShutDownQuery.newInstance(sm, false);
  }

}