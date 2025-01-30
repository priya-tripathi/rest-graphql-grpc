# rest-graphql-grpc
A comparative code and analysis on REST, GraphQL, and gRPC methodologies


| Features        | REST           | GraphQL  | gRPC |
| ------------- |:-------------:| -----:|----:|
| Architecture    | Resource-based, uses HTTP methods (GET, POST, etc.) | Query-based, allows clients to define the response shape | RPC-based, utilizes HTTP/2 with binary format (Protocol Buffers)
| Data Fetching      | Multiple endpoints returning fixed structures     |   Single endpoint with flexible queries | Remote procedural calls with structured messages
| Efficiency | over-fetching and under-fetching issues      |    efficient data fetching with only requested fields | Highly efficient due to compact binary format
| Schema | No formal schema | Strongly typed schema | strongly typed schema using ```.proto``` files



Major usecase difference:

* REST : Best for traditional web applications and simple APIs but inefficient in data fetching
* GraphQL : Ideal for frontend applications that need flexibility in querying with extra complexity on the backend
* gRPC : Good for microservices communication due to its high efficiency. But it can be tricky to implement as it requires protocol buffers