package Businness.Abstract;

public interface BaseManagerService<T> {
	
	void add(T entity);
	void delete(T entity);
	void update(T entity);

}
