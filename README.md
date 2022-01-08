# ConsoleLog

ConsoleLog is a simple library for writing color-coded logs to the console.

## Build

- `$ git clone https://github.com/UmarAbdul01/ConsoleLog.git`
- `$ cd ConsoleLog`
- `$ ant jar`

## Demo

```java
// Import.
import com.umarabdul.consolelog.ConsoleLog;
import com.umarabdul.consolelog.Color;

// Create a console logger with color-coding of warning set to yellow, and error set to red.
ConsoleLog log = new ConsoleLog("MyAmazingProgram", Color.YELLOW, Color.RED);

// Print some logs!!!
log.writeStatus("Starting program....");
log.writeWarning("We may be having some issues...");
log.writeError("We definitely have some issues!!!");
```
