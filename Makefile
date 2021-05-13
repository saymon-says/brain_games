install:
	gradlew clean install

run-dist:
	/Users/serdi/Hexlet/java/java-project-lvl1/build/install/app/bin/app

check-updates:
	gradlew dependencyUpdates

lint:
	gradlew checkstyleMain

