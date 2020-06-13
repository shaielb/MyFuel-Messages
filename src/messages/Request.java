package messages;

import java.io.Serializable;
import java.util.List;

import messages.request.ICollect;
import messages.request.IFilter;
import messages.request.IInsert;
import messages.request.IRemove;
import messages.request.IUpdate;

public class Request extends RequestResponse implements Serializable, IFilter, ICollect, IInsert, IUpdate, IRemove {

	private List<QueryContainer> _queryContainers;

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
	public void setQueryContainers(List<QueryContainer> queryContainers) {
		_queryContainers = queryContainers;
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
