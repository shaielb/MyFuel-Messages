package messages.request;

import java.util.Collection;
import java.util.List;

import db.interfaces.IEntity;
import messages.QueryContainer;

public interface IRemove extends IRequest {

	/**
	 * @param entities
	 */
	public void setEntities(Collection<IEntity> entities);
	
	/**
	 * @param entities
	 */
	public void addEntity(IEntity entity);
	
	/**
	 * @param querieContainers
	 */
	public void setQueryContainers(List<QueryContainer> querieContainers);
	
	/**
	 * @param querieContainer
	 */
	public void addQueryContainer(QueryContainer querieContainer);
}
