package com.umarabdul.consolelog;

import java.util.*;
import java.time.*;
import java.time.format.*;

/**
* A simple class for writing color-coded console logs by other programs.
* @author Umar Abdul
* @version 1.0
* Date: 17/Nov/2020
*/

public class ConsoleLog{

  private String sender = null;
  private HashMap<String, String> colors = null;

  /**
  * Constructor.
  * @param sender Name of the program or class generating the logs.
  */
  public ConsoleLog(String sender){

    this.sender = sender;
    colors = new HashMap<String, String>();
    colors.put("default", "\u001B[0m");
    colors.put("black", "\u001B[30m");
    colors.put("red", "\u001B[31m");
    colors.put("green", "\u001B[32m");
    colors.put("yellow", "\u001B[33m");
    colors.put("blue", "\u001B[34m");
    colors.put("purple", "\u001B[35m");
    colors.put("cyan", "\u001B[36m");
    colors.put("white", "\u001B[37m");
  }

  private String getTime(){

    LocalDateTime dobj = LocalDateTime.now();
    return dobj.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
  }

  /**
  * Write some status output to console.
  * @param output Status message to write.
  */
  public void writeStatus(String output){
    System.out.println("[" + colors.get("green") + getTime() + colors.get("default") + "] " + colors.get("green") + sender + colors.get("default") + ": " + output);
  }

  /**
  * Write some warning output to console.
  * @param output Warning message to write.
  */
  public void writeWarning(String output){
    System.out.println("[" + colors.get("yellow") + getTime() + colors.get("default") + "] " + colors.get("yellow") + sender + colors.get("default") + ": " + output);
  }

  /**
  * Write some error output to console.
  * @param output Error message to write.
  */
  public void writeError(String output){
    System.out.println("[" + colors.get("red") + getTime() + colors.get("default") + "] " + colors.get("red") + sender + colors.get("default") + ": " + output);
  }
}
