def call() {
    sh "chmod +x mvnw"
    sh "./mvnw clean test"
}
