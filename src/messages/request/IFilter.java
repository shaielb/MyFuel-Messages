package messages.request;

import java.util.Map;

import db.interfaces.IEntity;

public interface IFilter extends IRequest {

	public void setQueryEntity(IEntity entity, Map<String, String> querySigns);

	public void setLimit(int limit);
}
