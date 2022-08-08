.PHONY: build
build:
	rm -rf bin
	mkdir -p bin
	CGO_ENABLED=0 go build -o bin/event-pipe main.go