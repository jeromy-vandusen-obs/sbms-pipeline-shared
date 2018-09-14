def call(String tag) {
    sh "docker push jvandusen/sbms-discovery:${tag}"
    sh "docker push jvandusen/sbms-admin:${tag}"
    sh "docker push jvandusen/sbms-web:${tag}"
    sh "docker push jvandusen/sbms-greeting:${tag}"
}
