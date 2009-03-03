package swiftteams.nikitin.sql.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandlerElementKeyMap;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class TableRows_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_1893_0(context, node);
  }

  public EditorCell createCollection_1893_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_1893_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant_1893_0(context, node, "TableRows"));
    editorCell.addEditorCell(this.createConstant_1893_1(context, node, "<"));
    editorCell.addEditorCell(this.createRefCell_1893_1(context, node));
    editorCell.addEditorCell(this.createConstant_1893_2(context, node, ">"));
    return editorCell;
  }

  public EditorCell createConstant_1893_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1893_0(editorCell, node, context);
    setupLabel_Constant_1893_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1893_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1893_1(editorCell, node, context);
    setupLabel_Constant_1893_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1893_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1893_2(editorCell, node, context);
    setupLabel_Constant_1893_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefCell_1893_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new TableRows_Editor._Inline1893_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefCell_1893_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_RefCell_1893_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell_1893_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("row");
    provider.setNoTargetText("<no row>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefCell_1893_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_1893_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1893_0");
  }

  private static void setupBasic_RefCell_1893_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_1893_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1893_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_1893_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1893_1");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.blue);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_1893_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1893_2");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.blue);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_RefCell_1893_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1893_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1893_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1893_2(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static class _Inline1893_0 extends AbstractCellProvider {

    /* package */AbstractCellListHandler myListHandler_1893_0;

    public _Inline1893_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createCollection_1893_1(context, node);
    }

    public EditorCell createCollection_1893_1(EditorContext context, SNode node) {
      EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
      setupBasic_Collection_1893_1(editorCell, node, context);
      editorCell.setGridLayout(false);
      editorCell.setUsesBraces(false);
      editorCell.setCanBeFolded(false);
      editorCell.addEditorCell(this.createRefNodeList_1893_0(context, node));
      return editorCell;
    }

    public EditorCell createRefNodeList_1893_0(EditorContext context, SNode node) {
      if (this.myListHandler_1893_0 == null) {
        this.myListHandler_1893_0 = new TableRows_Editor.parametersListHandler_1893_0(node, "parameters", context);
      }
      EditorCell_Collection editorCell = this.myListHandler_1893_0.createCells(context, new CellLayout_Horizontal(), false);
      setupBasic_RefNodeList_1893_0(editorCell, node, context);
      editorCell.setGridLayout(false);
      editorCell.setUsesBraces(false);
      editorCell.setCanBeFolded(false);
      editorCell.setRole(this.myListHandler_1893_0.getElementRole());
      return editorCell;
    }


    private static void setupBasic_RefNodeList_1893_0(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("refNodeList_parameters");
    }

    private static void setupBasic_Collection_1893_1(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Collection_1893_1");
    }

    private static void setupLabel_RefNodeList_1893_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}
  public static class parametersListHandler_1893_0 extends RefNodeListHandler {

    public parametersListHandler_1893_0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    public SNode createNodeToInsert(EditorContext context) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, context, super.getElementRole());
    }

    public EditorCell createNodeCell(EditorContext context, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(context, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, context);
      return elementCell;
    }

    public EditorCell createEmptyCell(EditorContext context) {
      EditorCell emptyCell = null;
      emptyCell = super.createEmptyCell(context);
      this.installElementCellActions(super.getOwner(), null, emptyCell, context);
      return emptyCell;
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext context) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
          elementCell.addKeyMap(new RefNodeListHandlerElementKeyMap(this, ","));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext context) {
      {
        EditorCell_Constant editorCell = new EditorCell_Constant(context, this.getOwner(), ",");
        editorCell.setSelectable(false);
        editorCell.getStyle().set(StyleAttributes.LAYOUT_CONSTRAINT, "");
        editorCell.getStyle().set(StyleAttributes.PUNCTUATION_LEFT, true);
        return editorCell;
      }
    }

}

}