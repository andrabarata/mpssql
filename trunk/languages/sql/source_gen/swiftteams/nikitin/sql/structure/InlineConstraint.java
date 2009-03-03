package swiftteams.nikitin.sql.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.BooleanConstant;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InlineConstraint extends AbstractInlineConstraint {
  public static final String concept = "swiftteams.nikitin.sql.structure.InlineConstraint";
  public static final String BODY = "body";
  public static final String COSTRAINT_STATE = "costraint_state";

  public InlineConstraint(SNode node) {
    super(node);
  }

  public AbstractInlineConstraintBody getBody() {
    return (AbstractInlineConstraintBody)this.getChild(AbstractInlineConstraintBody.class, InlineConstraint.BODY);
  }

  public void setBody(AbstractInlineConstraintBody node) {
    super.setChild(InlineConstraint.BODY, node);
  }

  public BooleanConstant getCostraint_state() {
    return (BooleanConstant)this.getChild(BooleanConstant.class, InlineConstraint.COSTRAINT_STATE);
  }

  public void setCostraint_state(BooleanConstant node) {
    super.setChild(InlineConstraint.COSTRAINT_STATE, node);
  }


  public static InlineConstraint newInstance(SModel sm, boolean init) {
    return (InlineConstraint)SModelUtil_new.instantiateConceptDeclaration("swiftteams.nikitin.sql.structure.InlineConstraint", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InlineConstraint newInstance(SModel sm) {
    return InlineConstraint.newInstance(sm, false);
  }

}
