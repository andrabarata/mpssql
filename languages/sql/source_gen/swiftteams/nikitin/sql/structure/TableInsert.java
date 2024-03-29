package swiftteams.nikitin.sql.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TableInsert extends BaseConcept {
  public static final String concept = "swiftteams.nikitin.sql.structure.TableInsert";

  public TableInsert(SNode node) {
    super(node);
  }

  public static TableInsert newInstance(SModel sm, boolean init) {
    return (TableInsert)SModelUtil_new.instantiateConceptDeclaration("swiftteams.nikitin.sql.structure.TableInsert", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TableInsert newInstance(SModel sm) {
    return TableInsert.newInstance(sm, false);
  }

}
