#!/bin/bash
cd `dirname $0`

classname=$1
shift

#java -classpath build/classes:lib/commons-cli.jar:lib/log4j.jar $classname $*
java -noverify -classpath dist/comet.jar:lib/Azureus2.jar:lib/apple-extensions.jar $classname $*
