import java.net.http.*;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.FileWriter;
import java.io.IOException;

public class ConversorDeMoedas {

    private static final String API_KEY = "adcdecc25d9313e0040296c4";
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";
    private static final List<String> historico = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("---- SEJA BEM-VINDO AO CONVERSOR DE MOEDAS ----");

        while (continuar) {
            System.out.println("\nEscolha uma das opções:");
            System.out.println("1. Dólar -> Real");
            System.out.println("2. Real -> Dólar");
            System.out.println("3. Dólar -> Peso Argentino");
            System.out.println("4. Peso Argentino -> Dólar");
            System.out.println("5. Dólar -> Peso Colombiano");
            System.out.println("6. Peso Colombiano -> Dólar");
            System.out.println("7. Exibir Histórico de Conversões");
            System.out.println("8. Sair");
            System.out.print("-> Opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> converterMoeda("USD", "BRL", scanner);
                case 2 -> converterMoeda("BRL", "USD", scanner);
                case 3 -> converterMoeda("USD", "ARS", scanner);
                case 4 -> converterMoeda("ARS", "USD", scanner);
                case 5 -> converterMoeda("USD", "COP", scanner);
                case 6 -> converterMoeda("COP", "USD", scanner);
                case 7 -> exibirHistorico();
                case 8 -> {
                    continuar = false;
                    System.out.println("Saindo... Obrigado por usar o conversor!");
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

    private static void converterMoeda(String moedaOrigem, String moedaDestino, Scanner scanner) {
        try {
            String url = API_URL + moedaOrigem;

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();

            JsonObject jsonObject = JsonParser.parseString(responseBody).getAsJsonObject();

            String result = jsonObject.get("result").getAsString();
            if (!"success".equals(result)) {
                System.out.println("Erro na API: " + jsonObject.get("error-type").getAsString());
                return;
            }

            JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
            double taxaConversao = conversionRates.get(moedaDestino).getAsDouble();

            System.out.printf("Digite o valor em %s: ", moedaOrigem);
            double valor = scanner.nextDouble();

            double resultado = valor * taxaConversao;

            System.out.printf("Resultado: %.2f %s equivale a %.2f %s\n", valor, moedaOrigem, resultado, moedaDestino);

            // Salvar no histórico e no log
            String registro = String.format("%.2f %s -> %.2f %s", valor, moedaOrigem, resultado, moedaDestino);
            historico.add(registro);
            registrarLog(registro);

        } catch (Exception e) {
            System.out.println("Erro ao acessar a API: " + e.getMessage());
        }
    }

    private static void exibirHistorico() {
        if (historico.isEmpty()) {
            System.out.println("Nenhuma conversão realizada ainda.");
        } else {
            System.out.println("\n--- Histórico de Conversões ---");
            for (String registro : historico) {
                System.out.println(registro);
            }
        }
    }

    private static void registrarLog(String registro) {
        try (FileWriter writer = new FileWriter("log.txt", true)) {
            String dataHora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            writer.write(dataHora + " - " + registro + "\n");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o log: " + e.getMessage());
        }
    }
}


