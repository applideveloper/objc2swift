# objc2swift

*objc2swift* is an experimental project aiming to create an **Objective-C -> Swift** converter (or at least something that would help a human being convert codes by hand). 

The software is based on [ANTLR](http://www.antlr.org) the magnificent parser generator.

## Quick Start

Build the project, run the jar with an input Obj-C source file.

```
$ gradle build
$ java -jar build/libs/objc2swift-1.0.jar sample/sample.h 
```

With the input Obj-C code:

```
@interface A : NSObject

@end
```

you'll get the Swift code as below:

```
class A : NSObject {

}
```

## Features
* converts `@interface Hoge` to `class Hoge {}`
* ... that's all for now!

## Developer's Guide

### 1. Project Setup

Import Project from gradle build file:

![ss2.png](doc/ss2.png)

Create new Run Configuration as below:

![ss3.png](doc/ss3.png)

### 2. Project Structure

coming soon...

### 3. Visualizing Parse Tree

Install ANTLR v4, set classpath and aliases:

```
$ cd /usr/local/lib
$ curl -O http://www.antlr.org/download/antlr-4.5-complete.jar
```

```
$ export CLASSPATH=".:/usr/local/lib/antlr-4.5-complete.jar:$CLASSPATH"
$ alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.5-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
$ alias grun='java org.antlr.v4.runtime.misc.TestRig'
```

Run the TestRig with an input file:

```
$ cd build/classes/main
$ grun ObjC translation_unit ../../../sample/sample.h -gui
```

![ss1.png](doc/ss1.png)

See [Getting Started with ANTLR v4](https://theantlrguy.atlassian.net/wiki/display/ANTLR4/Getting+Started+with+ANTLR+v4) for more detail.

## LICENSE
This software is released under the MIT License, see [LICENSE.txt](LICENSE.txt).
