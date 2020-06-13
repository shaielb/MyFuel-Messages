package messages.request;

import java.util.Collection;

import db.interfaces.IEntity;

public interface IRemove extends IRequest {

	/**
	 * @param entities
	 */
	public void setEntities(Collection<IEntity> entities);
}
