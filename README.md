# ConsoleLog

ConsoleLog is a simple library for writing color-coded logs to the console.

## Build

- `$ git clone https://github.com/UmarAbdul01/ConsoleLog.git`
- `$ cd ConsoleLog`
- `$ ant jar`

## Demo

```java

import com.umarabdul.consolelog.ConsoleLog;

ConsoleLog log = new ConsoleLog("MyAmazingProgram");
log.writeStatus("Starting program....");
log.writeWarning("We may be having some issues...");
log.writeError("We definitely have some issues!!!");
```
