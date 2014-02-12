aether-dot-replaced-with-dash
=============================

Aether replaces dot with dash in artifactId except last?

Uses my private repo, but you should be able to see the log already when pom.xml is written out locally. That file name
is with a dash instead of dot. When deploying, this seems to be corrected, but inside the pom.xml however, it is still
written with a dash. This is my log:


      > aether-deploy
      [info] Updating {file:/Users/viktor/dev/projects/aether-problem/}aether-problem...
      [info] Packaging /Users/viktor/dev/projects/aether-problem/target/scala-2.10/aether-problem_3-0_2.10-0.0.1-sources.jar ...
      [info] Done packaging.
      [info] Wrote /Users/viktor/dev/projects/aether-problem/target/scala-2.10/aether-problem_3-0_2.10-0.0.1.pom
      [info] Resolving org.fusesource.jansi#jansi;1.4 ...
      [info] Done updating.
      [info] Packaging /Users/viktor/dev/projects/aether-problem/target/scala-2.10/aether-problem_3-0_2.10-0.0.1-javadoc.jar ...
      [info] Done packaging.
      [info] Packaging /Users/viktor/dev/projects/aether-problem/target/scala-2.10/aether-problem_3-0_2.10-0.0.1.jar ...
      [info] Done packaging.
      [info] Uploading: https://repo.woodenstake.se/content/repositories/releases/se/hedefalk/aether-problem_3.0_2.10/0.0.1/aether-problem_3.0_2.10-0.0.1.jar
      [info] Deploying se.hedefalk:aether-problem_3.0_2.10:jar:0.0.1 to Wooden Stake Releases (https://repo.woodenstake.se/content/repositories/releases/, default, releases+snapshots)
      [info] 761/761 B
      [info] 761/761 B
      [info]
      [info] Uploaded: https://repo.woodenstake.se/content/repositories/releases/se/hedefalk/aether-problem_3.0_2.10/0.0.1/aether-problem_3.0_2.10-0.0.1.jar (761 B at 0.8 KB/sec)
      [info] Deployed se.hedefalk:aether-problem_3.0_2.10:jar:0.0.1 to Wooden Stake Releases (https://repo.woodenstake.se/content/repositories/releases/, default, releases+snapshots)
      [info] Uploading: https://repo.woodenstake.se/content/repositories/releases/se/hedefalk/aether-problem_3.0_2.10/0.0.1/aether-problem_3.0_2.10-0.0.1.pom
      [info] Deploying se.hedefalk:aether-problem_3.0_2.10:pom:0.0.1 to Wooden Stake Releases (https://repo.woodenstake.se/content/repositories/releases/, default, releases+snapshots)
      [info] 2/2 KB
      [info]
      [info] Uploaded: https://repo.woodenstake.se/content/repositories/releases/se/hedefalk/aether-problem_3.0_2.10/0.0.1/aether-problem_3.0_2.10-0.0.1.pom (2 KB at 15.2 KB/sec)
      [info] Deployed se.hedefalk:aether-problem_3.0_2.10:pom:0.0.1 to Wooden Stake Releases (https://repo.woodenstake.se/content/repositories/releases/, default, releases+snapshots)
      [info] Uploading: https://repo.woodenstake.se/content/repositories/releases/se/hedefalk/aether-problem_3.0_2.10/0.0.1/aether-problem_3.0_2.10-0.0.1-javadoc.jar
      [info] Deploying se.hedefalk:aether-problem_3.0_2.10:jar:javadoc:0.0.1 to Wooden Stake Releases (https://repo.woodenstake.se/content/repositories/releases/, default, releases+snapshots)
      [info] 32/336 KB
      [info] 64/336 KB
      [info] 96/336 KB
      [info] 128/336 KB
      [info] 160/336 KB
      [info] 192/336 KB
      [info] 224/336 KB
      [info] 256/336 KB
      [info] 288/336 KB
      [info] 320/336 KB
      [info] 336/336 KB
      [info]
      [info] Uploaded: https://repo.woodenstake.se/content/repositories/releases/se/hedefalk/aether-problem_3.0_2.10/0.0.1/aether-problem_3.0_2.10-0.0.1-javadoc.jar (336 KB at 2148.2 KB/sec)
      [info] Deployed se.hedefalk:aether-problem_3.0_2.10:jar:javadoc:0.0.1 to Wooden Stake Releases (https://repo.woodenstake.se/content/repositories/releases/, default, releases+snapshots)
      [info] Uploading: https://repo.woodenstake.se/content/repositories/releases/se/hedefalk/aether-problem_3.0_2.10/0.0.1/aether-problem_3.0_2.10-0.0.1-sources.jar
      [info] Deploying se.hedefalk:aether-problem_3.0_2.10:jar:sources:0.0.1 to Wooden Stake Releases (https://repo.woodenstake.se/content/repositories/releases/, default, releases+snapshots)
      [info] 433/433 B
      [info]
      [info] Uploaded: https://repo.woodenstake.se/content/repositories/releases/se/hedefalk/aether-problem_3.0_2.10/0.0.1/aether-problem_3.0_2.10-0.0.1-sources.jar (433 B at 6.0 KB/sec)
      [info] Deployed se.hedefalk:aether-problem_3.0_2.10:jar:sources:0.0.1 to Wooden Stake Releases (https://repo.woodenstake.se/content/repositories/releases/, default, releases+snapshots)
      [info] Resolving metadata se.hedefalk:aether-problem_3.0_2.10/maven-metadata.xml from Wooden Stake Releases (https://repo.woodenstake.se/content/repositories/releases/, default, releases+snapshots)
      [info] Downloading metadata se.hedefalk:aether-problem_3.0_2.10/maven-metadata.xml from Wooden Stake Releases (https://repo.woodenstake.se/content/repositories/releases/, default, releases+snapshots)
      [info] Downloading: https://repo.woodenstake.se/content/repositories/releases/se/hedefalk/aether-problem_3.0_2.10/maven-metadata.xml
      [info]
      [error] Could not find metadata se.hedefalk:aether-problem_3.0_2.10/maven-metadata.xml in Wooden Stake Releases (https://repo.woodenstake.se/content/repositories/releases/)
      [info] Downloaded metadata se.hedefalk:aether-problem_3.0_2.10/maven-metadata.xml from Wooden Stake Releases (https://repo.woodenstake.se/content/repositories/releases/, default, releases+snapshots)
      [info] Resolved metadata se.hedefalk:aether-problem_3.0_2.10/maven-metadata.xml from Wooden Stake Releases (https://repo.woodenstake.se/content/repositories/releases/, default, releases+snapshots)
      [info] Uploading: https://repo.woodenstake.se/content/repositories/releases/se/hedefalk/aether-problem_3.0_2.10/maven-metadata.xml
      [info] Deploying se.hedefalk:aether-problem_3.0_2.10/maven-metadata.xml to Wooden Stake Releases (https://repo.woodenstake.se/content/repositories/releases/, default, releases+snapshots)
      [info] 314/314 B
      [info]
      [info] Uploaded: https://repo.woodenstake.se/content/repositories/releases/se/hedefalk/aether-problem_3.0_2.10/maven-metadata.xml (314 B at 3.8 KB/sec)
      [info] Deployed se.hedefalk:aether-problem_3.0_2.10/maven-metadata.xml to Wooden Stake Releases (https://repo.woodenstake.se/content/repositories/releases/, default, releases+snapshots)
      [success] Total time: 3 s, completed 2014-feb-12 16:25:53
