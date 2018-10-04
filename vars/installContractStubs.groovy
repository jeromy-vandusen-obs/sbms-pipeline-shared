def call() {
    sh "chmod +x mvnw"
    sh "./mvnw install -DskipTests"
}
