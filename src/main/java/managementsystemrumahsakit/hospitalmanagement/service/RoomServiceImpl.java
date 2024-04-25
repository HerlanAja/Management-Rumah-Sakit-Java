package managementsystemrumahsakit.hospitalmanagement.service;

import managementsystemrumahsakit.hospitalmanagement.model.Room;
import managementsystemrumahsakit.hospitalmanagement.ropository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomRepository roomRepository;

    @Override
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    @Override
    public Room getRoomById(Long id) {
        return roomRepository.findById(id).orElse(null);
    }

    @Override
    public Room createRoom(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public Room updateRoom(Long id, Room roomDetails) {
        Room room = roomRepository.findById(id).orElse(null);
        if (room != null) {
            room.setRoomNumber(roomDetails.getRoomNumber());
            room.setType(roomDetails.getType());
            room.setStatus(roomDetails.getStatus());
            return roomRepository.save(room);
        }
        return null;
    }

    @Override
    public void deleteRoom(Long id) {
        roomRepository.deleteById(id);
    }
}
