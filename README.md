This project presents a streamlined interface for interacting with the Ollama API using Spring Boot and WebFlux. Ollama facilitates local execution of large language models (LLMs), enabling developers to generate responses without relying on external services. By leveraging Spring Boot's reactive WebFlux framework, this interface ensures efficient, non-blocking communication with the Ollama API, resulting in enhanced performance and scalability.

Key Features:

Reactive Integration: Employs Spring WebFlux to manage asynchronous, non-blocking interactions with the Ollama API, optimizing resource utilization and responsiveness.

Minimalistic Design: Focuses on essential functionalities to provide a clean and straightforward interface for developers.

Local LLM Execution: Enables running large language models on local machines, ensuring data privacy and reducing dependency on external APIs.

Scalability: Designed to handle multiple concurrent requests efficiently, making it suitable for applications requiring high throughput.

Getting Started:

Prerequisites:

Java 17 or later.
Maven 3.5+ or Gradle 7.5+.
Basic understanding of Spring Boot and reactive programming concepts.
Setup Instructions:

Clone the repository.
Configure the Ollama API endpoint in the application properties.
Build and run the application using your preferred build tool.
Usage:

Access the minimal interface through the provided endpoints to interact with the Ollama API.
Utilize the reactive endpoints to send prompts and receive generated responses from the local LLMs.
Resources:

Ollama API Documentation: Detailed information on available endpoints and usage can be found in the Ollama API documentation.

Spring WebFlux Guide: For an in-depth understanding of reactive programming with Spring WebFlux, refer to the official Spring guide.

Contributing:

Contributions are welcome! Please fork the repository and submit a pull request with your enhancements or bug fixes.

License:

This project is licensed under the MIT License.
