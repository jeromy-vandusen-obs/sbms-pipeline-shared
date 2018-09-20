def call(String goals, boolean skipUnitTests = false, boolean skipIntegrationTests = false) {
    sh "chmod +x mvnw"
    if (skipUnitTests || skipIntegrationTests) {
        String args
        if (skipUnitTests) {
            if (skipIntegrationTests) {
                args = "-DskipTests"
            }
            else {
                args = "-DskipUnitTests"
            }
        }
        else {
            args = "-DskipIntegrationTests"
        }
        sh "./mvnw $args $goals"
    }
    else {
        sh "./mvnw $goals"
    }
}
