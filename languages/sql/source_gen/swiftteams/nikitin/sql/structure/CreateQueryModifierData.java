package swiftteams.nikitin.sql.structure;

/*Generated by MPS */

import java.util.List;
import java.util.LinkedList;

public enum CreateQueryModifierData {
  CREATE_TABLE("CREATE TABLE", "CREATE TABLE"),
  CREATE_GLOBAL_TEMPORARY_TABLE("CREATE GLOBAL TEMPORARY TABLE", "CREATE GLOBAL TEMPORARY TABLE");

  private String myName;
  private String myValue;

  CreateQueryModifierData(String name, String value) {
    this.myName = name;
    this.myValue = value;
  }

  public static List<CreateQueryModifierData> getConstants() {
    List<CreateQueryModifierData> list = new LinkedList<CreateQueryModifierData>();
    list.add(CreateQueryModifierData.CREATE_TABLE);
    list.add(CreateQueryModifierData.CREATE_GLOBAL_TEMPORARY_TABLE);
    return list;
  }

  public static CreateQueryModifierData getDefault() {
    return CreateQueryModifierData.CREATE_TABLE;
  }

  public static CreateQueryModifierData parseValue(String value) {
    if (value == null) {
      return CreateQueryModifierData.getDefault();
    }
    if (value.equals(CreateQueryModifierData.CREATE_TABLE.getValueAsString())) {
      return CreateQueryModifierData.CREATE_TABLE;
    }
    if (value.equals(CreateQueryModifierData.CREATE_GLOBAL_TEMPORARY_TABLE.getValueAsString())) {
      return CreateQueryModifierData.CREATE_GLOBAL_TEMPORARY_TABLE;
    }
    return CreateQueryModifierData.getDefault();
  }


  public String getName() {
    return this.myName;
  }

  public String getValueAsString() {
    return this.myValue;
  }

  public String getValue() {
    return this.myValue;
  }

}
