CC = gcc
CFLAGS = -Wall -fPIC

SRC=$(wildcard *.c)

default: linux

linux: $(SRC)
	$(CC) -shared -o xsm-linux-x86_64.so $(CFLAGS) $^
	$(CC) -shared -m32 -o xsm-linux.so $(CFLAGS) $^

windows-i686: $(SRC)
	CC=i686-w64-mingw32-gcc
	$(CC) -shared -o xsm-windows.dll $(CFLAGS) $^

windows-x86_64: $(SRC)
	CC=x86_64-w64-mingw32-gcc
	$(CC) -shared -o xsm-windows-x86_64.dll $(CFLAGS) $^
