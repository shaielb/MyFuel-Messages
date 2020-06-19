package messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import db.interfaces.IEntity;
import messages.request.ICollect;
import messages.request.IFilter;
import messages.request.IInsert;
import messages.request.IRemove;
import messages.request.IUpdate;

public class Request extends RequestResponse implements Serializable, IFilter, ICollect, IInsert, IUpdate, IRemove {

	private List<QueryContainer> _queryContainers;

	private String[] _tables;
	
	private String[] _columns;

	private Integer _limit;

	/**
	 * 
	 */
	private static final long serialVersionUID = 3;

	@Override
	public void setTables(String[] tables) {
		_tables = tables;
	}

	public String[] getTables() {
		return _tables;
	}
	
	@Override
	public void setColumns(String... columns) {
		_columns = columns;
	}
	
	public String[] getColumns() {
		return _columns;
	}

	@Override
	public void setQueryContainers(List<QueryContainer> queryContainers) {
		_queryContainers = queryContainers;
	}
	
	@Override
	public void addQueryEntity(IEntity queyEntity) {
		if (_queryContainers == null) {
			_queryContainers = new ArrayList<QueryContainer>();
		}
		QueryContainer queryContainer = new QueryContainer();
		queryContainer.setQueryEntity(queyEntity);
		_queryContainers.add(queryContainer);
	}
	
	@Override
	public void addQueryContainer(QueryContainer queryContainer) {
		if (_queryContainers == null) {
			_queryContainers = new ArrayList<QueryContainer>();
		}
		_queryContainers.add(queryContainer);
	}
	
	public void addQueryContainer(IEntity queyEntity, String key, String value) {
		QueryContainer queryContainer = new QueryContainer();
		queryContainer.setQueryEntity(queyEntity);
		Map<String, String> queryMap = new HashMap<String, String>();
		queryMap.put(key, value);
		queryContainer.setQueryMap(queryMap);
		if (_queryContainers == null) {
			_queryContainers = new ArrayList<QueryContainer>();
		}
		_queryContainers.add(queryContainer);
	}

	public List<QueryContainer> getQueryContainers() {
		return _queryContainers;
	}

	@Override
	public void setLimit(int limit) {
		_limit = limit;
	}

	public Integer getLimit() {
		return _limit;
	}
}
