#!/bin/bash

# Lista os dispositivos emuladores em execução
devices=$(adb devices | grep 'emulator' | cut -f1)

# Mata cada dispositivo emulador
for device in $devices; do
    echo "Encerrando $device..."
    adb -s $device emu kill
done

# Lista os processos do emulador qemu-system e os encerra
pids=$(pgrep -f qemu-system)
for pid in $pids; do
    echo "Encerrando processo do emulador PID $pid..."
    kill -9 $pid
done
