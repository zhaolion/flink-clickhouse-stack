PROTOS_PATH = ./protos
PROTOS_FILE_LIST = `find $(PROTOS_PATH) -type f -name '*.proto'`

gen-pb:
	for proto in $(PROTOS_FILE_LIST); do \
        protoc -I $(PROTOS_PATH) \
						-I $(PROTOS_FILE_LIST) \
						--go_out=$(PROTOS_PATH)/pb/go \
						--java_out=$(PROTOS_PATH)/pb/java \
						$$proto ;\
	done