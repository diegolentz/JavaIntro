package interfaces;

public class ServiceS2 implements IService {

	@Override
	public Dato consultar() {
		String res = "id0001nombrecarlos    saldo01550";

		String idStrs = res.substring(2, 6);
		String nombreStr = res.substring(12, 22);
		// nombreStr = nombreStr.trim();
		String saldo = res.substring(res.length() - 5, res.length());

		return new Dato(Long.parseLong(idStrs), nombreStr);
	}
}