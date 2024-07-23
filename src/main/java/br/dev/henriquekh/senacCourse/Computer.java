package br.dev.henriquekh.senacCourse;

import java.util.Arrays;

public class Computer {
    private int programCounter = 0x1000;
    private int registers = 8;
    private boolean status = false;
    private byte[] memory = new byte[0xFFFF];

    public Computer() {
    }

    public Computer(boolean status, int programCounter) {
        this.status = status;
        this.programCounter = programCounter;

    }

    public byte[] getMemory() {
        return memory;
    }

    public int getProgramCounter() {
        return programCounter;
    }

    public int getRegisters() {
        return registers;
    }

    public boolean getStatus() {
        return status;
    }

    public byte[] getNextBytes() {
        return Arrays.copyOfRange(memory, programCounter, programCounter + registers);
    }

    public void displayStatus() {
        System.out.printf("Computer:\n\tProgram Counter: %d\n\tNext Bytes: ", getProgramCounter());
        for (byte b : getNextBytes()) {
            System.out.printf("%02x ", b);
        }
        System.out.println();
    }
}
