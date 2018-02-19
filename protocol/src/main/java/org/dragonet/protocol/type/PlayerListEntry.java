package org.dragonet.protocol.type;

import java.util.UUID;
import org.dragonet.common.data.entity.Skin;

/**
 * Created on 2017/10/22.
 */
public class PlayerListEntry {

    public UUID uuid;
    public long eid;
    public String username;
    public String thirdPartyName;
    public String platform;
    public String unk1;
    public Skin skin;
    public String xboxUserId;
}
