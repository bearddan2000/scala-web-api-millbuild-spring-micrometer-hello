import mill._, scalalib._

// `HelloWorld` must match the subdirectory name
object Spring extends ScalaModule {
    def scalaVersion = "2.12.9"

    def ivyDeps = Agg(
      ivy"org.springframework.boot:spring-boot-starter-web:2.4.2",
      ivy"org.springframework.boot:spring-boot-starter-actuator:2.4.2",
      ivy"io.micrometer:micrometer-registry-prometheus:1.7.0"
    )
}
