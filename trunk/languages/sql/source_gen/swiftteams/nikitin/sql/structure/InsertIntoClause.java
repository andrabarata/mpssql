package swiftteams.nikitin.sql.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InsertIntoClause extends BaseConcept {
  public static final String concept = "swiftteams.nikitin.sql.structure.InsertIntoClause";
  public static final String T_ALIAS = "t_alias";
  public static final String TABLE_EXPRESSION_CLAUSE = "table_expression_clause";
  public static final String COLUMNS = "columns";

  public InsertIntoClause(SNode node) {
    super(node);
  }

  public String getT_alias() {
    return this.getProperty(InsertIntoClause.T_ALIAS);
  }

  public void setT_alias(String value) {
    this.setProperty(InsertIntoClause.T_ALIAS, value);
  }

  public TableExpressionClause getTable_expression_clause() {
    return (TableExpressionClause)this.getChild(TableExpressionClause.class, InsertIntoClause.TABLE_EXPRESSION_CLAUSE);
  }

  public void setTable_expression_clause(TableExpressionClause node) {
    super.setChild(InsertIntoClause.TABLE_EXPRESSION_CLAUSE, node);
  }

  public int getColumnsesCount() {
    return this.getChildCount(InsertIntoClause.COLUMNS);
  }

  public Iterator<AbstractColumnReference> columnses() {
    return this.children(AbstractColumnReference.class, InsertIntoClause.COLUMNS);
  }

  public List<AbstractColumnReference> getColumnses() {
    return this.getChildren(AbstractColumnReference.class, InsertIntoClause.COLUMNS);
  }

  public void addColumns(AbstractColumnReference node) {
    this.addChild(InsertIntoClause.COLUMNS, node);
  }

  public void insertColumns(AbstractColumnReference prev, AbstractColumnReference node) {
    this.insertChild(prev, InsertIntoClause.COLUMNS, node);
  }


  public static InsertIntoClause newInstance(SModel sm, boolean init) {
    return (InsertIntoClause)SModelUtil_new.instantiateConceptDeclaration("swiftteams.nikitin.sql.structure.InsertIntoClause", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InsertIntoClause newInstance(SModel sm) {
    return InsertIntoClause.newInstance(sm, false);
  }

}
