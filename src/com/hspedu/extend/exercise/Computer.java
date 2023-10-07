package com.hspedu.extend.exercise;

public class Computer {
    private String CPU;
    private int Memory;
    private int Hard_Disk;

    public Computer(String CPU, int memory, int hard_Disk) {
        this.CPU = CPU;
        this.Memory = memory;
        this.Hard_Disk = hard_Disk;
    }

    //返回Computer的详细信息
    public String getDetails() {
        return "CPU是="+CPU+"内存是="+Memory+"硬盘是="+Hard_Disk;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getMemory() {
        return Memory;
    }

    public void setMemory(int memory) {
        Memory = memory;
    }

    public int getHard_Disk() {
        return Hard_Disk;
    }

    public void setHard_Disk(int hard_Disk) {
        Hard_Disk = hard_Disk;
    }

}
