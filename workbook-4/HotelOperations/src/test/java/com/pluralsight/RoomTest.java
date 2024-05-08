package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest
{

    @Test
    public void checkout_Should_SetRoomToNotOccupiedWhenDoneSuccessFully ()
    {
        //arrange- setup
        Room room = new Room(2,150,true,true);
        boolean expected = false;
        //act
        room.checkOut();

        //assert
        boolean actual = room.isOccupied();
        assertEquals(expected,actual,"Should only be true if room is occupied.");

    }

    @Test
    public void cleanRoomShouldBe_MarkedNotDirtyOnceCleaned ()
    {
        //arrange- setup
        Room room = new Room(2,150,true,true);
        boolean expected = false;
        //act
        room.cleanRoom();

        //assert
        boolean actual = room.isDirty();
        assertEquals(expected,actual,"Should only be true if room is Dirty.");

    }

    @Test
    public void checkInShouldOnlyBeAllowed_IfRoomIsNotOccupied()
    {
        //arrange - setup
        Room room =new Room(2,15,false,false);
        boolean expected = true;



        //act
        boolean actual = room.checkIn();

        //assert

        assertEquals(expected,actual,"Should be only true if the room is not occupied.");
    }

    @Test
    public void OnceCheckedIn_RoomWillBeMarkedDirty()
    {
        //arrange - setup
        Room room =new Room(2,15,false,false);
        boolean expected = true;



        //act
        boolean actual = room.checkIn();

        //assert

        assertEquals(expected,actual,"Should be only set to dirty when room is occupied then room will be set to dirty.");
    }
}