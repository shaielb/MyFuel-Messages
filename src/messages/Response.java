package messages;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import db.interfaces.IEntity;

public class Response extends RequestResponse implements Serializable {

	/**
	 * 
	 */
	/**
	 * 
	 */
	private static final long serialVersionUID = 4;

	/**
	 * 
	 */
	private boolean _passedIndicator;

	/**
	 * 
	 */
	private String _description;
	
	/**
	 * 
	 */
	private Map<String, List<IEntity>> _tablesMap;

	/**
	 * @return
	 */
	public boolean isPassed() {
		return _passedIndicator;
	}

	/**
	 * @param indicator
	 */
	public void setPassed(boolean passed) {
		_passedIndicator = passed;
	}

	/**
	 * @return
	 */
	public String getDescription() {
		return _description;
	}

	/**
	 * @param description
	 */
	public void setDescription(String description) {
		_description = description;
	}
	
	/**
	 * @param tablesMap
	 */
	public void setTablesMap(Map<String, List<IEntity>> tablesMap) {
		_tablesMap = tablesMap;
	}
	
	/**
	 * @return
	 */
	public Map<String, List<IEntity>> getTablesMap() {
		return _tablesMap;
	}
}
