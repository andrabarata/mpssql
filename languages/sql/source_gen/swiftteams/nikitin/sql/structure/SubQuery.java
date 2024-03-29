package swiftteams.nikitin.sql.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.BooleanConstant;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SubQuery extends BaseConcept {
  public static final String concept = "swiftteams.nikitin.sql.structure.SubQuery";
  public static final String MODIFIER = "modifier";
  public static final String SUBQUERYMODIFIER = "subquerymodifier";
  public static final String SUBQUERY_FACTORING_CLAUSE = "subquery_factoring_clause";
  public static final String HINT = "hint";
  public static final String SELECT_LIST = "select_list";
  public static final String WHERE_CONDITION = "where_condition";
  public static final String HIERARCHICAL_QUERY_CLAUSE = "hierarchical_query_clause";
  public static final String GROUP_BY_CLAUSE = "group_by_clause";
  public static final String HAVING_CONDITION = "having_condition";
  public static final String SUBQUERY = "subquery";
  public static final String ORDER_BY_CLAUSE = "order_by_clause";
  public static final String TABLE_REFERENCES = "table_references";

  public SubQuery(SNode node) {
    super(node);
  }

  public SelectModifierData getModifier() {
    String value = super.getProperty(SubQuery.MODIFIER);
    return SelectModifierData.parseValue(value);
  }

  public void setModifier(SelectModifierData value) {
    super.setProperty(SubQuery.MODIFIER, value.getValueAsString());
  }

  public SubQueryModifierData getSubquerymodifier() {
    String value = super.getProperty(SubQuery.SUBQUERYMODIFIER);
    return SubQueryModifierData.parseValue(value);
  }

  public void setSubquerymodifier(SubQueryModifierData value) {
    super.setProperty(SubQuery.SUBQUERYMODIFIER, value.getValueAsString());
  }

  public BooleanConstant getSubquery_factoring_clause() {
    return (BooleanConstant)this.getChild(BooleanConstant.class, SubQuery.SUBQUERY_FACTORING_CLAUSE);
  }

  public void setSubquery_factoring_clause(BooleanConstant node) {
    super.setChild(SubQuery.SUBQUERY_FACTORING_CLAUSE, node);
  }

  public BooleanConstant getHint() {
    return (BooleanConstant)this.getChild(BooleanConstant.class, SubQuery.HINT);
  }

  public void setHint(BooleanConstant node) {
    super.setChild(SubQuery.HINT, node);
  }

  public SelectList getSelect_list() {
    return (SelectList)this.getChild(SelectList.class, SubQuery.SELECT_LIST);
  }

  public void setSelect_list(SelectList node) {
    super.setChild(SubQuery.SELECT_LIST, node);
  }

  public Condition getWhere_condition() {
    return (Condition)this.getChild(Condition.class, SubQuery.WHERE_CONDITION);
  }

  public void setWhere_condition(Condition node) {
    super.setChild(SubQuery.WHERE_CONDITION, node);
  }

  public BooleanConstant getHierarchical_query_clause() {
    return (BooleanConstant)this.getChild(BooleanConstant.class, SubQuery.HIERARCHICAL_QUERY_CLAUSE);
  }

  public void setHierarchical_query_clause(BooleanConstant node) {
    super.setChild(SubQuery.HIERARCHICAL_QUERY_CLAUSE, node);
  }

  public GroupByClause getGroup_by_clause() {
    return (GroupByClause)this.getChild(GroupByClause.class, SubQuery.GROUP_BY_CLAUSE);
  }

  public void setGroup_by_clause(GroupByClause node) {
    super.setChild(SubQuery.GROUP_BY_CLAUSE, node);
  }

  public Condition getHaving_condition() {
    return (Condition)this.getChild(Condition.class, SubQuery.HAVING_CONDITION);
  }

  public void setHaving_condition(Condition node) {
    super.setChild(SubQuery.HAVING_CONDITION, node);
  }

  public SubQuery getSubquery() {
    return (SubQuery)this.getChild(SubQuery.class, SubQuery.SUBQUERY);
  }

  public void setSubquery(SubQuery node) {
    super.setChild(SubQuery.SUBQUERY, node);
  }

  public OrderByClause getOrder_by_clause() {
    return (OrderByClause)this.getChild(OrderByClause.class, SubQuery.ORDER_BY_CLAUSE);
  }

  public void setOrder_by_clause(OrderByClause node) {
    super.setChild(SubQuery.ORDER_BY_CLAUSE, node);
  }

  public int getTable_referencesesCount() {
    return this.getChildCount(SubQuery.TABLE_REFERENCES);
  }

  public Iterator<AbstractTableRef> table_referenceses() {
    return this.children(AbstractTableRef.class, SubQuery.TABLE_REFERENCES);
  }

  public List<AbstractTableRef> getTable_referenceses() {
    return this.getChildren(AbstractTableRef.class, SubQuery.TABLE_REFERENCES);
  }

  public void addTable_references(AbstractTableRef node) {
    this.addChild(SubQuery.TABLE_REFERENCES, node);
  }

  public void insertTable_references(AbstractTableRef prev, AbstractTableRef node) {
    this.insertChild(prev, SubQuery.TABLE_REFERENCES, node);
  }


  public static SubQuery newInstance(SModel sm, boolean init) {
    return (SubQuery)SModelUtil_new.instantiateConceptDeclaration("swiftteams.nikitin.sql.structure.SubQuery", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SubQuery newInstance(SModel sm) {
    return SubQuery.newInstance(sm, false);
  }

}
