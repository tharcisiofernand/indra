package br.com.indra.util;

import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@javax.jws.WebService(endpointInterface="br.com.indra.WebService")
@SOAPBinding(style=Style.RPC)
public class WebServiceImpl implements WebService{

	@Override
	public int add(int x, int y) {
		return x+y;
	}

}
