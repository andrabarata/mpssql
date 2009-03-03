package swiftteams.nikitin.sql.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.BooleanConstant;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InsertQuery extends AbstractQuery {
  public static final String concept = "swiftteams.nikitin.sql.structure.InsertQuery";
  public static final String HINT = "hint";
  public static final String TABLE_INSERT = "table_insert";

  public InsertQuery(SNode node) {
    super(node);
  }

  public BooleanConstant getHint() {
    return (BooleanConstant)this.getChild(BooleanConstant.class, InsertQuery.HINT);
  }

  public void setHint(BooleanConstant node) {
    super.setChild(InsertQuery.HINT, node);
  }

  public TableInsert getTable_insert() {
    return (TableInsert)this.getChild(TableInsert.class, InsertQuery.TABLE_INSERT);
  }

  public void setTable_insert(TableInsert node) {
    super.setChild(InsertQuery.TABLE_INSERT, node);
  }


  public static InsertQuery newInstance(SModel sm, boolean init) {
    return (InsertQuery)SModelUtil_new.instantiateConceptDeclaration("swiftteams.nikitin.sql.structure.InsertQuery", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InsertQuery newInstance(SModel sm) {
    return InsertQuery.newInstance(sm, false);
  }

}
