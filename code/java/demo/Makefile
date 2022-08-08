.PHONY:build
build:
	find ./bin -name "*.jar" | xargs rm
	mvn clean package
	cp ./target/*.jar ./bin