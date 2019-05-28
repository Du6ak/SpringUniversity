package Lab_7.service;

import Lab_7.entity.Group;

public interface GroupService extends Service<Group> {

    Group readByName(String name);

}
