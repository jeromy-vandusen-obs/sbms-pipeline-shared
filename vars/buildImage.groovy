def call() {
    sh "chmod +x mvnw"
    sh "./mvnw dockerfile:build@version dockerfile:tag@latest -DskipTests"
}
