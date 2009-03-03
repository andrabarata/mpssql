package swiftteams.nikitin.sql.helgins;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import java.util.Iterator;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.util.NameUtil;

public class ReplacementHelper {

  public ReplacementHelper() {
  }

  public static String getErrorMsg(SNode tableRows1, SNode tableRows2) {
    final int count1 = SLinkOperations.getCount(tableRows1, "parameters");
    int count2 = SLinkOperations.getCount(tableRows2, "parameters");
    if (count1 >= count2) {
      final Wrappers._T<Integer> i = new Wrappers._T<Integer>(0);
      final Wrappers._T<Integer> matches = new Wrappers._T<Integer>(0);
      final Wrappers._T<SNode> it1 = new Wrappers._T<SNode>();
      final Iterator<SNode> iterator = ListSequence.fromList(SLinkOperations.getTargets(tableRows1, "parameters", true)).iterator();
      ListSequence.fromList(SLinkOperations.getTargets(tableRows2, "parameters", true)).visitAll(new IVisitor <SNode>() {

        public void visit(SNode it2) {
          while (i.value < count1) {
            i.value = i.value + 1;
            it1.value = iterator.next();
            boolean reference_match = SNodeOperations.isInstanceOf(it1.value, "swiftteams.nikitin.sql.structure.AbstractTableColumnReference") && SNodeOperations.isInstanceOf(it2, "swiftteams.nikitin.sql.structure.AbstractTableColumnReference") && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SLinkOperations.getTarget(it2, "reference", false), "datatype", true), NameUtil.nodeFQName(SNodeOperations.getConceptDeclaration(SLinkOperations.getTarget(SLinkOperations.getTarget(it1.value, "reference", false), "datatype", true))));
            boolean declaration_match = SNodeOperations.isInstanceOf(it1.value, "swiftteams.nikitin.sql.structure.DeclarationTableRowParameter") && SNodeOperations.isInstanceOf(it2, "swiftteams.nikitin.sql.structure.DeclarationTableRowParameter") && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(it2, "datatype", true), NameUtil.nodeFQName(SNodeOperations.getConceptDeclaration(SLinkOperations.getTarget(it1.value, "datatype", true))));
            if (reference_match || declaration_match) {
              matches.value = matches.value + 1;
              break;
              // comparison method for two datatypes is overloaded by ":<=:" rule in helgins
            }
          }
        }

      });
      if (matches.value == count2) {
        return null;
      } else
      {
        return "\n[ wrong parameters subtyping (only " + matches.value + " of " + count2 + " found ]";
      }
    } else
    {
      return "\n[ number of subtype parameters must be greater or equal to supertype ]";
    }
  }

}