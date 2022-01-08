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
  private HashMap<Color, String> colors = null;
  private Color errorColor;
  private Color warningColor;

  /**
   * Default constructor. Sets color-coding to yellow (warning) and red (error).
   * @param sender Name of the program or class generating the logs.
   */
  public ConsoleLog(String sender){
    this(sender, Color.YELLOW, Color.RED);
  }

  /**
  * Standard constructor.
  * @param sender Name of the program or class generating the logs.
  */
  public ConsoleLog(String sender, Color warningColor, Color errorColor){

    this.sender = sender;
    this.warningColor = warningColor;
    this.errorColor = errorColor;
    colors = new HashMap<Color, String>();
    colors.put(Color.DEFAULT, "\u001B[0m");
    colors.put(Color.BLACK, "\u001B[30m");
    colors.put(Color.RED, "\u001B[31m");
    colors.put(Color.GREEN, "\u001B[32m");
    colors.put(Color.YELLOW, "\u001B[33m");
    colors.put(Color.BLUE, "\u001B[34m");
    colors.put(Color.PURPLE, "\u001B[35m");
    colors.put(Color.CYAN, "\u001B[36m");
    colors.put(Color.WHITE, "\u001B[37m");
  }

  /**
   * Get a formatted string of current time.
   * @return Current time, in hour:minute:seconds format.
   */
  public String getTime(){

    LocalDateTime dobj = LocalDateTime.now();
    return dobj.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
  }

  /**
  * Write some status output to console.
  * @param output Status message to write.
  */
  public void writeStatus(String output){
    System.out.println("[" + colors.get(Color.GREEN) + getTime() + colors.get(Color.DEFAULT) + "] " + colors.get(Color.GREEN) + sender + colors.get(Color.DEFAULT) + ": " + output);
  }

  /**
  * Write some warning output to console.
  * @param output Warning message to write.
  */
  public void writeWarning(String output){
    System.out.println("[" + colors.get(warningColor) + getTime() + colors.get(Color.DEFAULT) + "] " + colors.get(warningColor) + sender + colors.get(Color.DEFAULT) + ": " + output);
  }

  /**
  * Write some error output to console.
  * @param output Error message to write.
  */
  public void writeError(String output){
    System.out.println("[" + colors.get(errorColor) + getTime() + colors.get(Color.DEFAULT) + "] " + colors.get(errorColor) + sender + colors.get(Color.DEFAULT) + ": " + output);
  }
}
