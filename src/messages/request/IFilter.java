package messages.request;

import java.util.List;

import messages.QueryContainer;

public interface IFilter extends IRequest {

	/**
	 * @param entitiesMap
	 */
	public void setQueryContainers(List<QueryContainer> queries);

	public void setLimit(int limit);
}
