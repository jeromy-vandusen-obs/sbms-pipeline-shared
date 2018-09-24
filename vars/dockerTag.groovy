def call(String sourceTag, String targetTag) {
    sh "docker tag jvandusen/sbms-discovery:${sourceTag} jvandusen/sbms-discovery:${targetTag}"
    sh "docker tag jvandusen/sbms-admin:${sourceTag} jvandusen/sbms-admin:${targetTag}"
    sh "docker tag jvandusen/sbms-web:${sourceTag} jvandusen/sbms-web:${targetTag}"
    sh "docker tag jvandusen/sbms-greeting:${sourceTag} jvandusen/sbms-greeting:${targetTag}"
}
