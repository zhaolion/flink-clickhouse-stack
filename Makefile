PROTOS_PATH = ./protos
PROTOS_FILE_LIST = `find $(PROTOS_PATH) -type f -name '*.proto'`

.PHONY: gen-pb
gen-pb:
	@rm -rf $(PROTOS_PATH)/pb && mkdir -p $(PROTOS_PATH)/pb/go && mkdir -p $(PROTOS_PATH)/pb/java
	@for proto in $(PROTOS_FILE_LIST); do \
        protoc -I $(PROTOS_PATH) \
						-I $(PROTOS_FILE_LIST) \
						--go_out=$(PROTOS_PATH)/pb/go \
						--java_out=$(PROTOS_PATH)/pb/java \
						$$proto ;\
	done