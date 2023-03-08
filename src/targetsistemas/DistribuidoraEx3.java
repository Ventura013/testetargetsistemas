package targetsistemas;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class DistribuidoraEx3 {

    public static void main(String[] args) {

        List<Double> faturamento = new ArrayList<>();

        try {
            File xmlFile = new File("C:\\Users\\diego\\Downloads\\faturamento.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("dia");
            for (int i = 0; i < nList.getLength(); i++) {
                Element elem = (Element) nList.item(i);
                double valor = Double.parseDouble(elem.getAttribute("valor"));
                faturamento.add(valor);
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            return;
        }

        double menor = faturamento.get(0);
        double maior = faturamento.get(0);
        double soma = 0;
        int diasComFaturamento = 0;

        for (double valor : faturamento) {
            if (valor < menor) {
                menor = valor;
            }
            if (valor > maior) {
                maior = valor;
            }
            if (valor != 0) {
                soma += valor;
                diasComFaturamento++;
            }
        }

        double media = soma / diasComFaturamento;
        int diasAcimaDaMedia = 0;

        for (double valor : faturamento) {
            if (valor > media) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Menor valor de faturamento diário: " + menor);
        System.out.println("Maior valor de faturamento diário: " + maior);
        System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);
    }
}
