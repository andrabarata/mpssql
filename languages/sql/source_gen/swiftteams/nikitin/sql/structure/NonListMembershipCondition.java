package swiftteams.nikitin.sql.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NonListMembershipCondition extends MembershipCondition {
  public static final String concept = "swiftteams.nikitin.sql.structure.NonListMembershipCondition";
  public static final String MODIFIER = "modifier";
  public static final String EXPRESSION = "expression";

  public NonListMembershipCondition(SNode node) {
    super(node);
  }

  public NonListMembershipConditionModifierData getModifier() {
    String value = super.getProperty(NonListMembershipCondition.MODIFIER);
    return NonListMembershipConditionModifierData.parseValue(value);
  }

  public void setModifier(NonListMembershipConditionModifierData value) {
    super.setProperty(NonListMembershipCondition.MODIFIER, value.getValueAsString());
  }

  public Expression getExpression() {
    return (Expression)this.getChild(Expression.class, NonListMembershipCondition.EXPRESSION);
  }

  public void setExpression(Expression node) {
    super.setChild(NonListMembershipCondition.EXPRESSION, node);
  }


  public static NonListMembershipCondition newInstance(SModel sm, boolean init) {
    return (NonListMembershipCondition)SModelUtil_new.instantiateConceptDeclaration("swiftteams.nikitin.sql.structure.NonListMembershipCondition", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NonListMembershipCondition newInstance(SModel sm) {
    return NonListMembershipCondition.newInstance(sm, false);
  }

}