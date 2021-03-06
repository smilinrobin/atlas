description = "Atlas Webdriver"

dependencies {
    api(project(":atlas-core"))

    implementation("org.apache.httpcomponents:httpclient:4.5.8")
    implementation("org.seleniumhq.selenium:selenium-java")
    implementation("org.hamcrest:hamcrest-all")

    testImplementation("ru.yandex.qatools.matchers:webdriver-matchers")
    testImplementation("org.apache.commons:commons-lang3")
    testImplementation("org.mockito:mockito-core")
    testImplementation("org.assertj:assertj-core")
    testImplementation("junit:junit")
}
