package com.example.userinfo.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.google.common.primitives.Booleans;

import java.util.stream.Stream;

public enum StatusEnum {
  ABLE_TO_VOTE(true), UNABLE_TO_VOTE(false);
  private String status;
  private boolean statusBoolean;
  StatusEnum(boolean b) { this.statusBoolean = b; }

  public boolean isStatusBoolean() { return statusBoolean; }

  @JsonCreator
  public static StatusEnum decode(final boolean value) {
    return Stream.of(StatusEnum.values())
//        .map(StatusEnum::isStatusBoolean).
//        .anyMatch(statusEnum -> Booleans.compare(statusEnum.isStatusBoolean(), value)==1);
        .filter(statusEnum -> statusEnum.isStatusBoolean() == value)
        .findAny()
        .orElseThrow(() -> new IllegalArgumentException("No statusEnum found " + value));
  }
}