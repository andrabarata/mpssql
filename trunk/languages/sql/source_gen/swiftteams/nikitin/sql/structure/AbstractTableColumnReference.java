package swiftteams.nikitin.sql.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AbstractTableColumnReference extends TableRowParameter {
  public static final String concept = "swiftteams.nikitin.sql.structure.AbstractTableColumnReference";
  public static final String REFERENCE = "reference";

  public AbstractTableColumnReference(SNode node) {
    super(node);
  }

  public ColumnRelationalProperty getReference() {
    return (ColumnRelationalProperty)this.getReferent(ColumnRelationalProperty.class, AbstractTableColumnReference.REFERENCE);
  }

  public void setReference(ColumnRelationalProperty node) {
    super.setReferent(AbstractTableColumnReference.REFERENCE, node);
  }


  public static AbstractTableColumnReference newInstance(SModel sm, boolean init) {
    return (AbstractTableColumnReference)SModelUtil_new.instantiateConceptDeclaration("swiftteams.nikitin.sql.structure.AbstractTableColumnReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AbstractTableColumnReference newInstance(SModel sm) {
    return AbstractTableColumnReference.newInstance(sm, false);
  }

}