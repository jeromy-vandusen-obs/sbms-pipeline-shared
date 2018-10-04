def call() {
    sh "chmod +x mvnw"
    sh "./mvnw versions:set -DnewVersion=\$(./mvnw help:evaluate -Dexpression=project.version | grep -e '^[^\\[\\/]').$BUILD_NUMBER"
}
