# Weather API with Redis Caching 🌤️

A Spring Boot REST API application to retrieve weather information for a given location using an external weather API. The project integrates **Redis caching** to improve performance by minimizing repeated API calls.
![image](https://github.com/user-attachments/assets/5f684fce-3012-4b11-adb4-0a47a89bf32c)


---

## Features
- Fetches real-time weather information based on location.
- Caches responses using **Redis** to reduce latency and API usage.
- Developed with **Spring Boot**, following clean and modular design principles.
- RESTful endpoints for easy integration with front-end applications.

---

## Tech Stack
- **Java 17/23**
- **Spring Boot** (2.x or 3.x)
- **Redis** (Caching)
- **Maven** (Dependency Management)
- **Visual Crossing Weather API** (External API for weather data)

---

## Getting Started

### Prerequisites
1. **Java** (Version 17 or later)
2. **Maven** (To build the project)
3. **Redis Server** (Ensure Redis is installed and running)
4. **Visual Crossing Weather API Key**
   - Sign up at [Visual Crossing](https://www.visualcrossing.com/) to get your API key.

---

### Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/nndasapalli/weather-api-springboot.git
   cd weather-api-with-redis
   ```
   
2.	**Set Up Environment** <br>
    Update the application.properties file with your Redis host/port and Visual Crossing API key:
    ```properties
    spring.redis.host=localhost
    spring.redis.port=6379
    weather.api.key=your_visual_crossing_api_key
    ```

3.	**Install Dependencies** <br>
    Run the following command to download the dependencies:
     ```bash
     mvn clean install
     ```

4.	**Run the Application** <br>
    Start the Spring Boot application using:
    ```bash
    mvn spring-boot:run
    ```

5.	**Test the API** <br>
    Open your browser or use tools like Postman to test the API endpoint:
    	•	GET http://localhost:8080/weather/api/{location}
    Replace {location} with a valid location (e.g., New York).
