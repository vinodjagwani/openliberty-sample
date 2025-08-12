# Open Liberty Hello - minimal example

## Build
mvn clean package

## Deploy to Open Liberty
-  mvn clean package liberty:run

## Test
Start server and browse:
- http://localhost:9080/api/hello


## Accessing MicroProfile Endpoints:
1. OpenAPI Documentation:
   http://localhost:9080/openapi

## Health Checks:
1. http://localhost:9080/health/live
2. http://localhost:9080/health/ready

## Metrics:
1. http://localhost:9080/metrics