def call() {
    sh "chmod +x mvnw"
    sh "./mvnw versions:revert"
}
