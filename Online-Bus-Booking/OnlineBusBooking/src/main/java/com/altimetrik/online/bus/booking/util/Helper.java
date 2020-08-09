package com.altimetrik.online.bus.booking.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Helper {

  private static final Logger logger = LoggerFactory.getLogger(Helper.class);

  public static String dateConvertor(LocalDateTime localDate) {
    String formatDateTime = "";

    if (null != localDate) {
      try {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        formatDateTime = localDate.format(format);
        logger.debug("After Formatting: {} ", formatDateTime);
      } catch (Exception e) {
        logger.error("Exception :: {} ", e);
      }
    }

    return formatDateTime;
  }
}
