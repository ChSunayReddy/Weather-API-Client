import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
public class WeatherAPIClient {
    private static final String BASE_URL = "https://wttr.in/";

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Valid City Name : "); //like Hyderabad or Adilabad
        String city = sc.next();
        fetchWeatherData(city);
    }

    public static void fetchWeatherData(String city) {
        try {
            String urlString = BASE_URL + city + "?format=%C+%t"; // Fetch condition & temperature
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                System.out.println("Weather in " + city + ": " + response.toString());
            } else {
                System.out.println("Error: Unable to fetch weather data.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.net.HttpURLConnection;
// import java.net.URL;
// import org.json.JSONObject;

// public class HttpJsonHandler {
//     private static final String API_URL = "https://randomuser.me/api/";

//     public static void main(String[] args) {
//         try {
//             String response = sendGetRequest(API_URL);
//             parseAndDisplayJson(response);
//         } catch (Exception e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }

//     private static String sendGetRequest(String urlString) throws Exception {
//         URL url = new URL(urlString);
//         HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//         conn.setRequestMethod("GET");
//         conn.setRequestProperty("Accept", "application/json");
        
//         if (conn.getResponseCode() != 200) {
//             throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
//         }

//         BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
//         StringBuilder response = new StringBuilder();
//         String output;
//         while ((output = br.readLine()) != null) {
//             response.append(output);
//         }
//         conn.disconnect();
//         return response.toString();
//     }

//     private static void parseAndDisplayJson(String jsonResponse) {
//         JSONObject jsonObj = new JSONObject(jsonResponse);
//         JSONObject user = jsonObj.getJSONArray("results").getJSONObject(0);
//         String name = user.getJSONObject("name").getString("first") + " " + user.getJSONObject("name").getString("last");
//         String email = user.getString("email");

//         System.out.println("User Info:");
//         System.out.println("Name: " + name);
//         System.out.println("Email: " + email);
//     }
// }
