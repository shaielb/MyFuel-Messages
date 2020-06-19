package messages.request;

public interface ICollect extends IRequest {

	public void setTables(String[] tables);

	public void setLimit(int limit);
	
	public void setColumns(String... columns);
}
