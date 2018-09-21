def call(String args) {
    sh "chmod +x mvnw"
    sh "./mvnw $args"
}
