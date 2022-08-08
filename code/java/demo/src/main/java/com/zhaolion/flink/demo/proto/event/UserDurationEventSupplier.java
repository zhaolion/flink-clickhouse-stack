package com.zhaolion.flink.demo.proto.event;

import com.fasterxml.uuid.Generators;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Iterator;
import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class UserDurationEventSupplier implements Supplier<UserDurationEvent> {
    private final Random generator = new Random();

    private final Iterator<Long> accounts =
            Stream.generate(() -> Stream.of(1L, 2L, 3L, 4L, 5L))
                    .flatMap(UnaryOperator.identity())
                    .iterator();

    private final Iterator<LocalDateTime> timestamps =
            Stream.iterate(
                            LocalDateTime.of(2000, 1, 1, 1, 0),
                            time -> time.plusMinutes(5).plusSeconds(generator.nextInt(58) + 1))
                    .iterator();

    @Override
    public UserDurationEvent get() {
        // build random event
        UserDurationEvent.Builder event = UserDurationEvent.newBuilder();
        event.setId(Generators.timeBasedGenerator().generate().toString());
        event.setUserId(accounts.next());
        event.setDurationSec(generator.nextInt(100));
        event.setEventAtNs(timestamps.next().atZone(ZoneOffset.UTC).toInstant().getNano());
        return event.build();
    }
}
