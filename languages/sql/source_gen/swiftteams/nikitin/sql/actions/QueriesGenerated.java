package swiftteams.nikitin.sql.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.NodeSubstitutePreconditionContext;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.action.NodeSubstituteActionsFactoryContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.util.Calculable;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.smodel.action.DefaultChildNodeSubstituteAction;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;

public class QueriesGenerated {

  public static boolean nodeSubstituteActionsBuilder_Precondition_AbstractTableReference_1214484377241(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    return true;
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_AbstractColumnReference_1214491865050(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    return true;
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_AbstractTableReferenceSimpleExpressionData_1214831376380(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    return true;
  }

  public static boolean nodeSubstituteActionsBuilder_Precondition_AbstractOperation_1217248661054(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    System.out.println("lolsdflsdlfsdlfjalksdfjlasdjfla;sdjf;" + TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(SNodeOperations.cast(_context.getParentNode(), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true)));
    return SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(SNodeOperations.cast(_context.getParentNode(), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true)), "swiftteams.nikitin.sql.structure.TableRow");
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_AbstractTableReference_1214483740049(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("swiftteams.nikitin.sql.structure.TableReference");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {

          public Object calculate() {
            return ListSequence.fromList(SModelOperations.getNodes(_context.getModel(), "swiftteams.nikitin.sql.structure.RelationalCreateQuery")).toListSequence();
          }
        };
        Iterable<SNode> queryResult = (Iterable)calc.calculate();
        if (queryResult != null) {
          for(final SNode item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode result = SConceptOperations.createNewNode("swiftteams.nikitin.sql.structure.TableReference", null);
                SLinkOperations.setTarget(result, "table", (item), false);
                return result;
              }

              public String getMatchingText(String pattern) {
                return SPropertyOperations.getString((item), "name");
              }

              public String getVisibleMatchingText(String pattern) {
                return this.getMatchingText(pattern);
              }

              public String getDescriptionText(String pattern) {
                return "link to other table";
              }
            });
          }
        }
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_AbstractColumnReference_1214491852003(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("swiftteams.nikitin.sql.structure.ColumnReference");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {

          public Object calculate() {
            return ListSequence.fromList(SModelOperations.getNodes(_context.getModel(), "swiftteams.nikitin.sql.structure.ColumnRelationalProperty")).toListSequence();
          }
        };
        Iterable<SNode> queryResult = (Iterable)calc.calculate();
        if (queryResult != null) {
          for(final SNode item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode result = SConceptOperations.createNewNode("swiftteams.nikitin.sql.structure.ColumnReference", null);
                SLinkOperations.setTarget(result, "column", (item), false);
                return result;
              }

              public String getMatchingText(String pattern) {
                return SPropertyOperations.getString((item), "columnName");
              }

              public String getVisibleMatchingText(String pattern) {
                return this.getMatchingText(pattern);
              }

              public String getDescriptionText(String pattern) {
                return SPropertyOperations.getString(((SNode)SNodeOperations.getParent((item))), "name") + "." + SPropertyOperations.getString((item), "columnName");
              }
            });
          }
        }
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_AbstractTableReferenceSimpleExpressionData_1214831329469(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    final SNode ref_table;
    {
      Calculable calc = new Calculable() {

        public Object calculate() {
          return SLinkOperations.getTarget(SLinkOperations.getTarget(((SNode)_context.getParentNode()), "reference", true), "table", false);
        }
      };
      ref_table = (SNode)calc.calculate();
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("swiftteams.nikitin.sql.structure.TableReferenceSimpleExpressionData");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {

          public Object calculate() {
            return ListSequence.fromList(SLinkOperations.getTargets(ref_table, "relational_properties", true)).where(new IWhereFilter <SNode>() {

              public boolean accept(SNode it) {
                return SNodeOperations.isInstanceOf(it, "swiftteams.nikitin.sql.structure.ColumnRelationalProperty");
              }
            }).toListSequence();
          }
        };
        Iterable<SNode> queryResult = (Iterable)calc.calculate();
        if (queryResult != null) {
          for(final SNode item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode result = SConceptOperations.createNewNode("swiftteams.nikitin.sql.structure.TableReferenceSimpleExpressionData", null);
                SLinkOperations.setTarget(result, "column", SNodeOperations.cast((item), "swiftteams.nikitin.sql.structure.ColumnRelationalProperty"), false);
                return result;
              }

              public String getMatchingText(String pattern) {
                return SPropertyOperations.getString(SNodeOperations.cast((item), "swiftteams.nikitin.sql.structure.ColumnRelationalProperty"), "columnName");
              }

              public String getVisibleMatchingText(String pattern) {
                return this.getMatchingText(pattern);
              }

              public String getDescriptionText(String pattern) {
                return SPropertyOperations.getString(ref_table, "name") + "." + SPropertyOperations.getString(SNodeOperations.cast((item), "swiftteams.nikitin.sql.structure.ColumnRelationalProperty"), "columnName");
              }
            });
          }
        }
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_AbstractOperation_1217248645553(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("swiftteams.nikitin.sql.structure.TableRowParameter");
      SNode childConcept = (SNode)_context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {

          public Object calculate() {
            return SLinkOperations.getTargets(SNodeOperations.cast(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(SNodeOperations.cast(_context.getParentNode(), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true)), "swiftteams.nikitin.sql.structure.TableRow"), "parameters", true);
          }
        };
        Iterable<SNode> queryResult = (Iterable)calc.calculate();
        if (queryResult != null) {
          for(final SNode item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {

              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                return (item);
              }

              public String getMatchingText(String pattern) {
                return BaseConcept_Behavior.call_getPresentation_1213877396640((item));
              }

              public String getVisibleMatchingText(String pattern) {
                return this.getMatchingText(pattern);
              }

              public String getDescriptionText(String pattern) {
                return "link";
              }
            });
          }
        }
      }
    }
    return result;
  }

}
