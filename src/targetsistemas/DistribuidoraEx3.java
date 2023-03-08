package targetsistemas;

public class DistribuidoraEx3 {
	public static void main(String[] args) {

		double[] faturamentoDiario = { 1500.0, 1800.0, 2000.0, 1200.0, 1700.0, 0.0, 0.0 };

		double menorFaturamento = faturamentoDiario[0];
		for (int i = 1; i < faturamentoDiario.length; i++) {
			if (faturamentoDiario[i] < menorFaturamento) {
				menorFaturamento = faturamentoDiario[i];
			}
		}

		double maiorFaturamento = faturamentoDiario[0];
		for (int i = 1; i < faturamentoDiario.length; i++) {
			if (faturamentoDiario[i] > maiorFaturamento) {
				maiorFaturamento = faturamentoDiario[i];
			}
		}

		double somaFaturamento = 0.0;
		int numDiasComFaturamento = 0;
		for (int i = 0; i < faturamentoDiario.length; i++) {
			if (faturamentoDiario[i] > 0.0) {
				somaFaturamento += faturamentoDiario[i];
				numDiasComFaturamento++;
			}
		}
		double mediaMensal = somaFaturamento / numDiasComFaturamento;

		int numDiasAcimaDaMedia = 0;
		for (int i = 0; i < faturamentoDiario.length; i++) {
			if (faturamentoDiario[i] > mediaMensal) {
				numDiasAcimaDaMedia++;
			}
		}

		System.out.println("Menor faturamento diário: " + menorFaturamento);
		System.out.println("Maior faturamento diário: " + maiorFaturamento);
		System.out.println("Número de dias com faturamento diário acima da média: " + numDiasAcimaDaMedia);
	}
}
