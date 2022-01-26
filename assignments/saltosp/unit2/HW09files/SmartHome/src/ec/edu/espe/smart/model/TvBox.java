/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.smart.model;

import java.util.ArrayList;

/**
 *
 * @author MiASUS
 */
public class TvBox extends Device {
    private int volume;
    private int channelsQuantity;
    private ArrayList <String> channels;

    /**
     * @return the volume
     */
    public int getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * @return the channelsQuantity
     */
    public int getChannelsQuantity() {
        return channelsQuantity;
    }

    /**
     * @param channelsQuantity the channelsQuantity to set
     */
    public void setChannelsQuantity(int channelsQuantity) {
        this.channelsQuantity = channelsQuantity;
    }

    /**
     * @return the channels
     */
    public ArrayList <String> getChannels() {
        return channels;
    }

    /**
     * @param channels the channels to set
     */
    public void setChannels(ArrayList <String> channels) {
        this.channels = channels;
    }
    
    
}