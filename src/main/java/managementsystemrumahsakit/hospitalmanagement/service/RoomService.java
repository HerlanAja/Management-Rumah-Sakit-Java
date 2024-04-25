package managementsystemrumahsakit.hospitalmanagement.service;

import java.util.List;
import managementsystemrumahsakit.hospitalmanagement.model.Room;

public interface RoomService {
    List<Room> getAllRooms();
    Room getRoomById(Long id);
    Room createRoom(Room room); 
    Room updateRoom(Long id, Room roomDetails);
    void deleteRoom(Long id);
}
