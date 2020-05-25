package messages;

import java.io.Serializable;
import java.util.Map;

import db.interfaces.IEntity;
import messages.request.ICollect;
import messages.request.IFilter;
import messages.request.IInsert;
import messages.request.IRemove;
import messages.request.IUpdate;

public class Request extends RequestResponse implements Serializable, IFilter, ICollect, IInsert, IUpdate, IRemove {

	private IEntity _queryEntity;

	private Map<String, String> _querySigns;

	private String[] _tables;

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
	public void setQueryEntity(IEntity entity, Map<String, String> querySigns) {
		_queryEntity = entity;
		_querySigns = querySigns;
	}

	public IEntity getQueryEntity() {
		return _queryEntity;
	}

	public Map<String, String> getQuerySigns() {
		return _querySigns;
	}

	@Override
	public void setLimit(int limit) {
		_limit = limit;
	}

	public Integer getLimit() {
		return _limit;
	}
}
