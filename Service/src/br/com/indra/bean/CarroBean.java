package br.com.indra.bean;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;

import com.carmanager.server.Car;
import com.carmanager.server.ServerInterface;
import com.carmanager.server.ServerInterfaceProxy;

import br.com.indra.controller.CarroCtrl;
import br.com.indra.model.Carro;
import br.com.indra.model.Pessoa;

@ManagedBean
public class CarroBean implements ServerInterface {

	private CarroCtrl carroctrl;
	private List<Carro> carros;
	private Carro carro;
	private Pessoa selecionada;
	private List<Car> temp;
	private List<Car> temp2 = new ArrayList<>();
	private Pessoa pessoa;
	private Car car;

	public void selecionar() throws RemoteException{
		ServerInterface si = new ServerInterfaceProxy();
		
		if (selecionada == null) {
			selecionada = new Pessoa();
		}
		temp2 = new ArrayList<Car>();
		ArrayList<Car> lista = new ArrayList<Car>(Arrays.asList(si.getAllCars()));;
		this.setPessoa(this.getSelecionada());
		for (Car carro : lista) {
			if (carro.getChassi().equals(pessoa.getChassi())) {
				temp2.add(carro);
			} 
		}
		this.setTemp(temp2);
	}
	
	public CarroBean() {
		carroctrl = new CarroCtrl();
	}

	public CarroCtrl getCarroctrl() {
		return carroctrl;
	}

	public void setCarroctrl(CarroCtrl carroctrl) {
		this.carroctrl = carroctrl;
	}

	@Override
	public Car[] getAllCars() throws RemoteException {
		ServerInterface si = new ServerInterfaceProxy();
		return si.getAllCars();
	}

	@Override
	public Car getOneCar(String arg0) throws RemoteException {
		ServerInterface si = new ServerInterfaceProxy();
		return si.getOneCar("8BWZZZ377KS004451");
	}

	public Car getCar() {
		if(car==null){
			car = new Car();
		}
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public List<Carro> getCarros() {
		if(carros==null){
			carros = new CarroCtrl().listar();
		}
		return carros;
	}

	public void setCarros(List<Carro> temp2) {
		this.carros = temp2;
	}

	public Carro getCarro() {
		if(carro==null){
			carro = new Carro();
		}
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	public Pessoa getSelecionada() {
		return selecionada;
	}

	public void setSelecionada(Pessoa selecionada) {
		if(selecionada==null){
			selecionada = new Pessoa();
		}
		this.selecionada = selecionada;
	}
	
	public Pessoa getPessoa() {
		if (pessoa == null) {
			pessoa = new Pessoa();
		}
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Car> getTemp() {
		return temp;
	}

	public void setTemp(List<Car> temp) {
		this.temp = temp;
	}
	
	

}
