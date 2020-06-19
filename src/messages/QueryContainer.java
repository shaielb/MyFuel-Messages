package messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import db.interfaces.IEntity;

public class QueryContainer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private IEntity _queryEntity;
	
	private Map<String, String> _queryMap;
	
	private List<QueryContainer> _nextList = new ArrayList<QueryContainer>();
	
	public QueryContainer() {
		_queryMap = new HashMap<String, String>();
	}
	
	public QueryContainer(IEntity queryEntity) {
		_queryEntity = queryEntity;
		_queryMap = new HashMap<String, String>();
	}
	
	public void setQueryEntity(IEntity queryEntity) {
		_queryEntity = queryEntity;
	}
	
	public IEntity getQueryEntity() {
		return _queryEntity;
	}
	
	public void addQueryCondition(String column, String sign) {
		if (_queryMap == null) {
			_queryMap = new HashMap<String, String>();
		}
		_queryMap.put(column, sign);
	}
	
	public void addNext(QueryContainer next) {
		_nextList.add(next);
	}
	
	public List<QueryContainer> getNext() {
		return _nextList;
	}

	public Map<String, String> getQueryMap() {
		return _queryMap;
	}

	public void setQueryMap(Map<String, String> queryMap) {
		_queryMap = queryMap;
	}
}
