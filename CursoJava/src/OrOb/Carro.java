package OrOb;

public class Carro {
	Motor motor = new Motor();
	void acelerar() {
		if (motor.fatorInjecao < 5.0) {
		motor.fatorInjecao += 0.4;
		}
	}
	void frear() {
		if(motor.fatorInjecao > 0.5) {
		motor.fatorInjecao -= 0.4;
		}
		else { 
			desligar();
		}
		
	}
	void ligar() {
		motor.ligado = true;
	}
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
}
