package swiftteams.nikitin.sql.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodePropertyGetter;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ColumnRelationalProperty_name_PropertyConstraint implements IModelConstraints, INodePropertyGetter {

  public ColumnRelationalProperty_name_PropertyConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodePropertyGetter("swiftteams.nikitin.sql.structure.ColumnRelationalProperty", "name", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodePropertyGetter("swiftteams.nikitin.sql.structure.ColumnRelationalProperty", "name");
  }

  public Object execPropertyGet(SNode node, String propertyName, IScope scope) {
    return SPropertyOperations.getString(node, "columnName");
  }

}