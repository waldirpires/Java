import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        var contexto = new Contexto();

		while (true) {
			int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1° número:"));
			int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 2° número:"));

			var acao = JOptionPane.showInputDialog(null, "Selecione a ação (+, -, *, / , -1)");

			// 1 define estratégia de execução
			switch (acao) {
			case "+":
				contexto.setEstrategia(new Soma());
				break;
			case "-":
				contexto.setEstrategia(new Subtracao());
				break;
			case "*":
				contexto.setEstrategia(new Multiplicacao());
				break;
            case "/":
                contexto.setEstrategia(new Divisao());
                break;    
			case "-1":
				System.exit(0); // saindo do sistema
				break;
			}

			// executa estratégia definida
			var resultado = contexto.executar(a, b);

			System.out.println("Resultado: " + resultado);

			JOptionPane.showInternalMessageDialog(null, "Resultado: " + resultado);
		}
    }
}
