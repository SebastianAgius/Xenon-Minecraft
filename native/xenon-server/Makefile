CC = gcc
CFLAGS = -Wall -fPIC

SRC=$(wildcard *.c)

default: linux

linux: $(SRC)
	$(CC) -shared -o xenon-server-linux.so $(CFLAGS) $^

windows-i686: $(SRC)
	CC=i686-w64-mingw32-gcc
	$(CC) -shared -o xenon-server-windows-i686.dll $(CFLAGS) $^

windows-x86_64: $(SRC)
	CC=x86_64-w64-mingw32-gcc
	$(CC) -shared -o xenon-server-windows-x86_64.dll $(CFLAGS) $^
