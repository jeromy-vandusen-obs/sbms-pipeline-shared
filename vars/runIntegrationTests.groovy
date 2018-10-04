def call() {
    sh "chmod +x mvnw"
    sh "./mvnw verify -DskipUnitTests"
}
