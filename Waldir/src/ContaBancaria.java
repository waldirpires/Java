import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ag;
		result = prime * result + ((extrato == null) ? 0 : extrato.hashCode());
		result = prime * result + num;
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaBancaria other = (ContaBancaria) obj;
		if (ag != other.ag)
			return false;
		if (extrato == null) {
			if (other.extrato != null)
				return false;
		} else if (!extrato.equals(other.extrato))
			return false;
		if (num != other.num)
			return false;
		if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
			return false;
		return true;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getAg() {
		return ag;
	}
	public void setAg(int ag) {
		this.ag = ag;
	}
	private double saldo;
	private int num;
	private int ag;

	public ContaBancaria(double saldo,int num,int ag) {
		
		this.saldo = saldo;
		this.num = num;
		this.ag = ag;
		 
	}
	List<String> extrato = new ArrayList<>();
	public void sacar(double valor) {
		if(saldo > valor) {
		saldo -=valor;
		extrato.add("foi sacado "+valor);
		}
		else 
			System.out.println("Saldo insuficiente");
	}
	public void depositar(double valor) {
		saldo +=valor;
		extrato.add("foi Depositado: "+valor);
	}
	public void transferir(double valor) {
		if(saldo > valor) {
			saldo -=valor;
			extrato.add("Tranferido: "+valor);
		}
		else 
			System.out.println("Saldo insuficiente");
	}
	public void pagarConta(double valor) {
		if(saldo > valor) {
			saldo -=valor;
			extrato.add("Conta Paga no valor de: "+valor);
		}
		else 
			System.out.println("Saldo insuficiente");
	}
	
	public String exibirSaldo() {
		return "Saldo: " +saldo;
	}
	public void exibirExtrato() {
		extrato.stream().forEach(System.out::println);
		System.out.println("Saldo Atual: "+saldo);
	}
	
	public String toString() {
		return "Conta: "+num+" Ag: "+ag;
	}
}
