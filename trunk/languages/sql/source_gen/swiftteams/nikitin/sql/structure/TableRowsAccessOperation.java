package swiftteams.nikitin.sql.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.structure.IOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TableRowsAccessOperation extends BaseConcept implements IOperation {
  public static final String concept = "swiftteams.nikitin.sql.structure.TableRowsAccessOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String COLUMN = "column";

  public TableRowsAccessOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(TableRowsAccessOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(TableRowsAccessOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(TableRowsAccessOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(TableRowsAccessOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(TableRowsAccessOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(TableRowsAccessOperation.VIRTUAL_PACKAGE, value);
  }

  public ColumnRelationalProperty getColumn() {
    return (ColumnRelationalProperty)this.getReferent(ColumnRelationalProperty.class, TableRowsAccessOperation.COLUMN);
  }

  public void setColumn(ColumnRelationalProperty node) {
    super.setReferent(TableRowsAccessOperation.COLUMN, node);
  }


  public static TableRowsAccessOperation newInstance(SModel sm, boolean init) {
    return (TableRowsAccessOperation)SModelUtil_new.instantiateConceptDeclaration("swiftteams.nikitin.sql.structure.TableRowsAccessOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TableRowsAccessOperation newInstance(SModel sm) {
    return TableRowsAccessOperation.newInstance(sm, false);
  }

}