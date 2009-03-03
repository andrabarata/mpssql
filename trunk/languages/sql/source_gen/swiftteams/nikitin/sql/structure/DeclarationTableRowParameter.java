package swiftteams.nikitin.sql.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DeclarationTableRowParameter extends TableRowParameter {
  public static final String concept = "swiftteams.nikitin.sql.structure.DeclarationTableRowParameter";
  public static final String VARIABLE_NAME = "variable_name";
  public static final String DATATYPE = "datatype";

  public DeclarationTableRowParameter(SNode node) {
    super(node);
  }

  public String getVariable_name() {
    return this.getProperty(DeclarationTableRowParameter.VARIABLE_NAME);
  }

  public void setVariable_name(String value) {
    this.setProperty(DeclarationTableRowParameter.VARIABLE_NAME, value);
  }

  public DataType getDatatype() {
    return (DataType)this.getChild(DataType.class, DeclarationTableRowParameter.DATATYPE);
  }

  public void setDatatype(DataType node) {
    super.setChild(DeclarationTableRowParameter.DATATYPE, node);
  }


  public static DeclarationTableRowParameter newInstance(SModel sm, boolean init) {
    return (DeclarationTableRowParameter)SModelUtil_new.instantiateConceptDeclaration("swiftteams.nikitin.sql.structure.DeclarationTableRowParameter", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DeclarationTableRowParameter newInstance(SModel sm) {
    return DeclarationTableRowParameter.newInstance(sm, false);
  }

}
