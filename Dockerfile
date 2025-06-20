# 使用 JDK 21 基础镜像
FROM eclipse-temurin:21-jdk-jammy

WORKDIR /app

COPY . .

RUN chmod +x mvnw

# 构建应用并跳过测试（我们后面在容器里再运行）
RUN ./mvnw clean package -DskipTests

CMD ["java", "-Dspring.profiles.active=docker", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]