package messages.request;

import java.util.List;

import db.interfaces.IEntity;
import messages.QueryContainer;

public interface IFilter extends IRequest {

	/**
	 * @param querieContainers
	 */
	public void setQueryContainers(List<QueryContainer> querieContainers);
	
	/**
	 * @param querieContainer
	 */
	public void addQueryContainer(QueryContainer querieContainer);
	
	public void addQueryContainer(IEntity queyEntity, String key, String value);
	
	public void addQueryEntity(IEntity queyEntity);

	/**
	 * @param limit
	 */
	public void setLimit(int limit);
}
