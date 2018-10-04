def call() {
    sh "chmod +x mvnw"
    sh "./mvnw package -DskipTests"
}
