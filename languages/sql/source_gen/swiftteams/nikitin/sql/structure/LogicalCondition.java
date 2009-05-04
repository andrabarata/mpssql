package swiftteams.nikitin.sql.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LogicalCondition extends CompoundCondition {
  public static final String concept = "swiftteams.nikitin.sql.structure.LogicalCondition";

  public LogicalCondition(SNode node) {
    super(node);
  }

  public static LogicalCondition newInstance(SModel sm, boolean init) {
    return (LogicalCondition)SModelUtil_new.instantiateConceptDeclaration("swiftteams.nikitin.sql.structure.LogicalCondition", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static LogicalCondition newInstance(SModel sm) {
    return LogicalCondition.newInstance(sm, false);
  }

}