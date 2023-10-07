package com.hspedu.extend.exercise;

public class NotePad extends Computer{
    private String color;

    public NotePad(String CPU, int memory, int hard_Disk, String color) {
        super(CPU, memory, hard_Disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
