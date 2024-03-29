package swiftteams.nikitin.sql.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ReferencesClause extends BaseConcept {
  public static final String concept = "swiftteams.nikitin.sql.structure.ReferencesClause";
  public static final String TABLE = "table";
  public static final String COLUMNS = "columns";

  public ReferencesClause(SNode node) {
    super(node);
  }

  public AbstractTableReference getTable() {
    return (AbstractTableReference)this.getChild(AbstractTableReference.class, ReferencesClause.TABLE);
  }

  public void setTable(AbstractTableReference node) {
    super.setChild(ReferencesClause.TABLE, node);
  }

  public int getColumnsesCount() {
    return this.getChildCount(ReferencesClause.COLUMNS);
  }

  public Iterator<AbstractColumnReference> columnses() {
    return this.children(AbstractColumnReference.class, ReferencesClause.COLUMNS);
  }

  public List<AbstractColumnReference> getColumnses() {
    return this.getChildren(AbstractColumnReference.class, ReferencesClause.COLUMNS);
  }

  public void addColumns(AbstractColumnReference node) {
    this.addChild(ReferencesClause.COLUMNS, node);
  }

  public void insertColumns(AbstractColumnReference prev, AbstractColumnReference node) {
    this.insertChild(prev, ReferencesClause.COLUMNS, node);
  }


  public static ReferencesClause newInstance(SModel sm, boolean init) {
    return (ReferencesClause)SModelUtil_new.instantiateConceptDeclaration("swiftteams.nikitin.sql.structure.ReferencesClause", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ReferencesClause newInstance(SModel sm) {
    return ReferencesClause.newInstance(sm, false);
  }

}
