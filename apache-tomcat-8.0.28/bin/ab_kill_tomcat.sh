#!/bin/sh

TOP_DIR=$(cd $(dirname $0)/.. && pwd)

QQ=

while [ "" = "$QQ" ] ; do
	QQ=1
	for x in `ps ax | grep java | grep "Dcatalina.base=$TOP_DIR" | perl -n -e 's/\s*// ; print +(split/\s+/)[0]'` ; do
		echo killing $x
		kill -9 $x
		QQ=
	done
done


