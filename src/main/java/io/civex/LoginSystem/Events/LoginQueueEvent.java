package io.civex.LoginSystem.Events;

import com.google.common.collect.HashBiMap;
import io.civex.LoginSystem.Events.Enums.EventType;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

/**
 * Created by Ryan on 9/5/2018.
 */
public class LoginQueueEvent extends Event
{
    private String sender;
    private EventType eventType;
    private UUID pUUID;
    private String pName; //to only make it easier to have the friendly version.
    private HashBiMap<UUID, Integer> queue;
    private ArrayList<UUID> onTheClock;
    private HashMap<UUID, String> uuidToName;
    private static final HandlerList handlers = new HandlerList();

    public LoginQueueEvent(String sender, EventType eventType, UUID pUUID, String pName, HashBiMap<UUID, Integer> queue,
                           ArrayList<UUID> onTheClock, HashMap<UUID, String> uuidToName)
    {
        this.sender = sender;
        this.eventType = eventType;
        this.pUUID = pUUID;
        this.pName = pName;
        this.queue = queue;
        this.onTheClock = onTheClock;
        this.uuidToName = uuidToName;
    }

    public String getSender()
    {
        return sender;
    }

    public EventType getEventType()
    {
        return eventType;
    }

    public UUID getPlayerUUID()
    {
        return pUUID;
    }

    public String getPlayerName()
    {
        return pName;
    }

    public HashBiMap getQueue()
    {
        return queue;
    }

    public ArrayList<UUID> getOnTheClock()
    {
        return onTheClock;
    }

    public HashMap getUUIDtoName()
    {
        return uuidToName;
    }

    public void setSender(String sender)
    {
        this.sender = sender;
    }

    public void setEventType(EventType eventType)
    {
        this.eventType = eventType;
    }

    public void setpUUID(UUID pUUID)
    {
        this.pUUID = pUUID;
    }

    public void setpName(String pName)
    {
        this.pName = pName;
    }

    public void setQueue(HashBiMap<UUID, Integer> queue)
    {
        this.queue = queue;
    }

    public void setOnTheClock(ArrayList<UUID> onTheClock)
    {
        this.onTheClock = onTheClock;
    }

    public void setUuidToName(HashMap<UUID, String> uuidToName)
    {
        this.uuidToName = uuidToName;
    }

    public HandlerList getHandlers()
    {
        return handlers;
    }

    public static HandlerList getHandlerList()
    {
        return handlers;
    }

}