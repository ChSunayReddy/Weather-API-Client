# Weather-API-Client

*COMPANY*: CODTECH IT SOLUTIONS

*NAME*:  Ch Sunay Reddy

*INTERN ID*: CT08RTP

*DOMAIN*: Java Programming

*DURATION*: 4 WEEEKS

*MENTOR*: NEELA SANTOSH

*Description* : A REST API (Representational State Transfer Application Programming Interface) client is a software application that communicates with RESTful web services over the HTTP protocol. REST APIs are widely used in modern web development for accessing and manipulating web-based resources, offering a lightweight, flexible approach to data exchange. They typically use standard HTTP methods like GET, POST, PUT, and DELETE to perform operations on resources, and responses are often in JSON or XML format. A REST API client sends requests to these APIs and processes the responses, making it a crucial component in web data integration.

For this task, we will develop a Java application that consumes a public REST API — such as one providing weather data — and displays the retrieved information in a structured format. This program will handle HTTP requests, parse JSON responses, and present the data in a readable manner. Consuming a REST API in Java requires knowledge of HTTP communication and JSON parsing, making this a valuable exercise for understanding how web-based services interact with Java applications.

To build this REST API client, we will use Java libraries such as HttpURLConnection, HttpClient (available from Java 11 onward), or third-party libraries like Apache HttpClient or OkHttp for making HTTP requests. Additionally, JSON parsing libraries like Jackson or Gson will be used to convert JSON responses into Java objects for easier data manipulation.

The Java application will follow a clear workflow:

1. Send an HTTP GET request to the public REST API endpoint.
2. Capture the HTTP response and check the status code to ensure a successful request.
3. Read the response body, which will be in JSON format.
4. Parse the JSON data and convert it into Java objects.
5. Extract relevant information from the parsed data.
6. Format and display the information in a human-readable and well-structured manner.

For example, if the application fetches weather data, the output might include details such as current temperature, humidity, weather conditions, wind speed, and forecasts. This structured presentation makes the data accessible and easy to understand.
A basic outline of the Java program would include the following steps:
1. Import necessary libraries: java.net for HTTP connections, java.io for reading responses, and libraries like Jackson or Gson for JSON parsing.
2. Define a class with a main method to act as the program's entry point.
3. Construct an HTTP GET request to the chosen API’s endpoint using HttpURLConnection or HttpClient.
4. Read the input stream from the HTTP response and convert it into a string.
5. Use a JSON parsing library to convert the JSON string into Java objects.
6. Extract key data points and display them in a formatted output.
Error handling is an essential part of the application. The program should manage exceptions like network failures, invalid JSON responses, and HTTP errors. Status codes should be checked to differentiate between successful requests (like 200 OK) and errors (like 404 Not Found or 500 Internal Server Error), providing appropriate feedback to the user.
In conclusion, building a REST API client in Java helps develop essential skills in web integration, data parsing, and network programming. By handling HTTP requests and JSON responses efficiently, this application demonstrates how Java can interact with web-based services to fetch and present real-time data. Whether retrieving weather information, financial data, or any other public API data, a well-constructed REST API client is a powerful tool in modern software development.

#OUTPUT

![Image](https://github.com/user-attachments/assets/425d1877-7bed-4d17-9810-39d72fbfb6fc)
