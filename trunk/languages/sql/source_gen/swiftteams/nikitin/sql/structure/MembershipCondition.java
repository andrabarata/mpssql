package swiftteams.nikitin.sql.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MembershipCondition extends Condition {
  public static final String concept = "swiftteams.nikitin.sql.structure.MembershipCondition";

  public MembershipCondition(SNode node) {
    super(node);
  }

  public static MembershipCondition newInstance(SModel sm, boolean init) {
    return (MembershipCondition)SModelUtil_new.instantiateConceptDeclaration("swiftteams.nikitin.sql.structure.MembershipCondition", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MembershipCondition newInstance(SModel sm) {
    return MembershipCondition.newInstance(sm, false);
  }

}