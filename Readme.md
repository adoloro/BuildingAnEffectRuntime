Slides and code for a [talk at ScalaHamburg](https://www.meetup.com/de-DE/Scala-Hamburg/events/265681417/) about building an effect runtime compatible with [ZIO](https://zio.dev)

# Play Slides

```
npm install -g reveal-md
reveal-md slides.md -w --css css/fullscreen.css
```

# Run Examples

```
brew install scalacenter/bloop/bloop
brew services start bloop 
```

```
resolvers += Resolver.sonatypeRepo("snapshots")
addSbtPlugin("ch.epfl.scala" % "sbt-bloop" % "1.3.5")
sbt bloopInstall

bloop run runtime -m  com.github.runtologist.demo.DemoAdd
bloop run runtime -m  com.github.runtologist.demo.DemoDiv
bloop run runtime -m  com.github.runtologist.demo.DemoAddAll
bloop run runtime -m  com.github.runtologist.demo.DemoAddAllCoop
bloop run runtime -m  com.github.runtologist.demo.DemoAddAllFair
bloop run runtime -m  com.github.runtologist.demo.DemoDivFold
```
