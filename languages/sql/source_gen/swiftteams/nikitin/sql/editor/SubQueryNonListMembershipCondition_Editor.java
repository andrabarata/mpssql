package swiftteams.nikitin.sql.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;

public class SubQueryNonListMembershipCondition_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_0346_0(context, node);
  }

  public EditorCell createCollection_0346_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_0346_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createRefNode_0346_1(context, node));
    editorCell.addEditorCell(this.createProperty_0346_1(context, node));
    editorCell.addEditorCell(this.createRefNode_0346_3(context, node));
    return editorCell;
  }

  public EditorCell createRefNode_0346_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_0346_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_RefNode_0346_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_0346_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("expression");
    provider.setNoTargetText("<no expression>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode_0346_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_0346_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_0346_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_Property_0346_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_0346_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("modifier");
    provider.setNoTargetText("<no modifier>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty_0346_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_0346_2_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_0346_1(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_RefNode_0346_1((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_0346_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("subquery");
    provider.setNoTargetText("<no subquery>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode_0346_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_0346_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_0346_0");
  }

  private static void setupBasic_RefNode_0346_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Property_0346_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_modifier");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_RefNode_0346_1(EditorCell editorCell, SNode node, EditorContext context) {
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.DRAW_BRACKETS, true);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_RefNode_0346_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Property_0346_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RefNode_0346_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
