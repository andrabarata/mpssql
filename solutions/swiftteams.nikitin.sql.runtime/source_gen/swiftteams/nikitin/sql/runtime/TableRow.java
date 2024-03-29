package swiftteams.nikitin.sql.runtime;

/*Generated by MPS */

import java.util.Map;
import java.util.HashMap;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;

public class TableRow {

  private Map<String, Object> properties = new HashMap<String, Object>();

  public TableRow(ResultSet resultSet) throws SQLException {
    // fill properties from resultSet, but don't store this constructor parameter
    if (resultSet.isAfterLast()) {
      Debug.debug("resultSet is after last!");
    }
    ResultSetMetaData meta = resultSet.getMetaData();
    int column = meta.getColumnCount();
    Debug.debug("column count: " + column);
    while (column > 0) {
      String name = meta.getColumnName(column);
      Debug.debug("was column: " + name);
      Object value = resultSet.getObject(1);
      Debug.debug("was value: " + value.toString());
      this.properties.put(meta.getColumnName(column).toUpperCase(), resultSet.getObject(column));
      column = column - 1;
    }
  }
  public TableRow(String[] names, Object[] values) {
    for(int i = 0 ; i < names.length ; i++ ) {
      this.setProperty(names[i], values[i]);
    }
  }

  public Object getProperty(String name) {
    String realName = name.toUpperCase();
    if (!(this.properties.containsKey(realName))) {
      Debug.debug("was missing property: " + name);
    }
    return this.properties.get(realName);
  }

  public void setProperty(String name, Object value) {
    this.properties.put(name.toUpperCase(), value);
  }

}
