package ro.teamnet.zth.appl.dao;

import org.junit.Test;
import ro.teamnet.zth.appl.domain.Location;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Alina.Petrescu on 7/14/2017.
 */
public class LocationDaoTest {

    LocationDao locationDao = new LocationDao();
    Location location = new Location();

    @Test
    public void findByIdTest() {
        location = locationDao.findById(new Long(1500));
        assertNotNull(location);
    }

    @Test
    public void getNextIdValTest() {
        assertEquals(new Long(3204), locationDao.getNextIdVal("locations", "location_id"));
    }

    @Test
    public void insertTest() {
        location.setCity("Bucuresti");
        location.setId((long)3300);
        location.setPostalCode("222-222");
        location.setStateProvince("Romania");
        location.setStreetAddress("Bd. Unirii");
        assertNotNull(locationDao.insert(location));
    }

    @Test
    public void findAllTest() {
        List<Location> locationArrayList = new ArrayList<>();
        locationArrayList = locationDao.findAll();
        assertEquals(26, locationArrayList.size());
    }

    @Test
    public void updateTest() {
        location.setCity("BucurestiNew");
        location.setId((long)3201);
        location.setPostalCode("222-222New");
        location.setStateProvince("RomaniaNew");
        location.setStreetAddress("Bd. Unirii new");

        Location location1 = locationDao.update(location);

        assertEquals(location, location1);
    }

    @Test
    public void deleteTest() {
        location.setCity("Bucuresti");
        location.setId((long)locationDao.getNextIdVal("locations", "location_id") - 1);
        location.setPostalCode("222-222");
        location.setStateProvince("Romania");
        location.setStreetAddress("Bd. Unirii");

        locationDao.delete(location);

        assertEquals(26, locationDao.findAll().size());
    }

    @Test
    public void findByParamsTest() {
        Map<String, Object> hashMap = new HashMap<>();

        hashMap.put("state_province", "Romania");

        assertEquals(2, locationDao.findByParams(hashMap).size());
    }
}
