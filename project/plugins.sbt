resolvers += Resolver.url("hmrc-sbt-plugin-releases", url("https://dl.bintray.com/hmrc/sbt-plugin-releases"))(Resolver.ivyStylePatterns)

resolvers += "HMRC Releases" at "https://dl.bintray.com/hmrc/releases"

resolvers += "Typesafe Releases" at "https://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("uk.gov.hmrc" % "sbt-auto-build" % "2.6.0")

addSbtPlugin("uk.gov.hmrc" % "sbt-git-versioning" % "2.1.0")

addSbtPlugin("uk.gov.hmrc" % "sbt-artifactory" % "1.2.0")

addSbtPlugin("uk.gov.hmrc" % "sbt-play-cross-compilation" % "0.20.0")

val playPlugin = sys.env.getOrElse("PLAY_VERSION", "2.5") match {
  case "2.5" => "com.typesafe.play" % "sbt-plugin" % "2.5.19"
  case "2.6" => "com.typesafe.play" % "sbt-plugin" % "2.6.20"
  case "2.7" => "com.typesafe.play" % "sbt-plugin" % "2.7.4"
}

addSbtPlugin(playPlugin)
