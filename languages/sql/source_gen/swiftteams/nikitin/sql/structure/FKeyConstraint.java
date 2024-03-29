package swiftteams.nikitin.sql.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class FKeyConstraint extends AbstractOutLineConstraint {
  public static final String concept = "swiftteams.nikitin.sql.structure.FKeyConstraint";
  public static final String REFERENCES_CLAUSE = "references_clause";
  public static final String COLUMNS = "columns";

  public FKeyConstraint(SNode node) {
    super(node);
  }

  public ReferencesClause getReferences_clause() {
    return (ReferencesClause)this.getChild(ReferencesClause.class, FKeyConstraint.REFERENCES_CLAUSE);
  }

  public void setReferences_clause(ReferencesClause node) {
    super.setChild(FKeyConstraint.REFERENCES_CLAUSE, node);
  }

  public int getColumnsesCount() {
    return this.getChildCount(FKeyConstraint.COLUMNS);
  }

  public Iterator<AbstractColumnReference> columnses() {
    return this.children(AbstractColumnReference.class, FKeyConstraint.COLUMNS);
  }

  public List<AbstractColumnReference> getColumnses() {
    return this.getChildren(AbstractColumnReference.class, FKeyConstraint.COLUMNS);
  }

  public void addColumns(AbstractColumnReference node) {
    this.addChild(FKeyConstraint.COLUMNS, node);
  }

  public void insertColumns(AbstractColumnReference prev, AbstractColumnReference node) {
    this.insertChild(prev, FKeyConstraint.COLUMNS, node);
  }


  public static FKeyConstraint newInstance(SModel sm, boolean init) {
    return (FKeyConstraint)SModelUtil_new.instantiateConceptDeclaration("swiftteams.nikitin.sql.structure.FKeyConstraint", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static FKeyConstraint newInstance(SModel sm) {
    return FKeyConstraint.newInstance(sm, false);
  }

}
