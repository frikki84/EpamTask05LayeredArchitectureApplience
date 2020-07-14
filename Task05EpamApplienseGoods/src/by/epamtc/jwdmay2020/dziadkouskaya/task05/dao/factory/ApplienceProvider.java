package by.epamtc.jwdmay2020.dziadkouskaya.task05.dao.factory;

import java.util.HashMap;
import java.util.Map;

import by.epamtc.jwdmay2020.dziadkouskaya.task05.entity.ApplienceName;

public class ApplienceProvider {
	private Map<ApplienceName, ApplienceCommand> commands = new HashMap<ApplienceName, ApplienceCommand>();

	public ApplienceProvider() {
		commands.put(ApplienceName.LAPTOP, new LaptopCommand());
		commands.put(ApplienceName.OVEN, new OvenCommand());
		commands.put(ApplienceName.REFRIGERATOR, new RefrigeratorCommand());
		commands.put(ApplienceName.SPEAKERS, new SpeakersCommand());
		commands.put(ApplienceName.TABLET_PC, new TabletPCCommand());
		commands.put(ApplienceName.VACUUM_CLEANER, new VacuumCleanerCommand());
	}

	public ApplienceCommand takeApplienceCommand(String applienceName) {
		ApplienceName name;
		ApplienceCommand value;

		try {
			name = ApplienceName.valueOf(applienceName.toUpperCase());
			value = commands.get(name);
		} catch (Exception e) {
			value = commands.get(ApplienceName.NO_SUCH_APPLIENCE);
		}
		return value;
	}

}
