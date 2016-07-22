package br.com.indra.util;

import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@javax.jws.WebService
@SOAPBinding(style = Style.RPC)
public interface WebService {

	public int add(int x, int y);

}
