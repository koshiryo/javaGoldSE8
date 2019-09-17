package exam10;

public class Engine {
	Operator m = new EngineOperator();
	public void operate(){
		m.turnON();
		m.turnOFF();
	}
}
