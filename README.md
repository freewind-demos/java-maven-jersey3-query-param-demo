Java Maven Jersey3 Returns 404 If Failed to Parse Query String Parameter Demo
====================================

Normally it should return http code like `400` since this is wrong parameter value, not the url not found.

And for now it's impossible to change the behavior or add more error message:
https://stackoverflow.com/questions/11242983/when-jersey-cannot-map-a-query-parameter-fails-with-404-why-so

I don't recommend to use jersey due to this design issue, which makes it hard to debug for both frontend and backend.

Code is basically coming from https://mkyong.com/webservices/jax-rs/jersey-and-jetty-http-server-examples/ ，thanks!

```
mvn clean package
java -jar target/demo.jar
```

- Visit `http://localhost:8080/hello?number=123`:  will show `Received: 123` on the page, as expected
- Visit `http://localhost:8080/hello?number=abc`:  will return `404` without any useful information 
