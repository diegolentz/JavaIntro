package colectionEjemplos;

import java.util.Collection;

public interface IDatos<T> {

	public T buscarPorId();
	public Collection<T> buscarTodos();
}
