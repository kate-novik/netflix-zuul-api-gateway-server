# netflix-zuul-api-gateway-server
Demo Zuul API Gateway Server for Spring Boot + Spring Cloud project.

For sending request in a microservice using Zuul API gateway you should use such uri:

     http://localhost:8765/{application-name}/{uri}

For example, you can use next uri for Currency Exchange microservice:

     http://localhost:8765/currency-exchange-service/currency-exchange/from/EUR/to/INR
