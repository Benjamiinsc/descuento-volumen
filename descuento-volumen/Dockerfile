# Compila y ejecuta las pruebas antes de construir la imagen de runtime.
FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /src
COPY pom.xml .
COPY src ./src
RUN mvn -B package

# Runtime oficial de AWS Lambda para Java 21.
FROM public.ecr.aws/lambda/java:21
ARG APP_VERSION=local
ENV APP_VERSION=${APP_VERSION}
COPY --from=build /src/target/classes ${LAMBDA_TASK_ROOT}
CMD [ "mx.itson.devops.descuento.Handler::handleRequest" ]
