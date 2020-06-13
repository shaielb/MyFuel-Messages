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
	private boolean _indicator;

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
	public boolean isIndicator() {
		return _indicator;
	}

	/**
	 * @param indicator
	 */
	public void setIndicator(boolean indicator) {
		_indicator = indicator;
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
