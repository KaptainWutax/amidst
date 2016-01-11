package amidst.gui.main.menu;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import amidst.documentation.AmidstThread;
import amidst.documentation.CalledOnlyBy;
import amidst.documentation.NotThreadSafe;

@NotThreadSafe
public class AmidstMenu {
	private final JMenuBar menuBar;
	private final JMenu worldMenu;
	private final JMenuItem savePlayerLocationsMenu;
	private final JMenuItem reloadPlayerLocationsMenu;
	private final LayersMenu layersMenu;

	@CalledOnlyBy(AmidstThread.EDT)
	public AmidstMenu(JMenuBar menuBar, JMenu worldMenu,
			JMenuItem savePlayerLocationsMenu,
			JMenuItem reloadPlayerLocationsMenu, LayersMenu layersMenu) {
		this.menuBar = menuBar;
		this.worldMenu = worldMenu;
		this.savePlayerLocationsMenu = savePlayerLocationsMenu;
		this.reloadPlayerLocationsMenu = reloadPlayerLocationsMenu;
		this.layersMenu = layersMenu;
	}

	@CalledOnlyBy(AmidstThread.EDT)
	public JMenuBar getMenuBar() {
		return menuBar;
	}

	@CalledOnlyBy(AmidstThread.EDT)
	public void setWorldMenuEnabled(boolean isEnabled) {
		worldMenu.setEnabled(isEnabled);
	}

	@CalledOnlyBy(AmidstThread.EDT)
	public void setSavePlayerLocationsMenuEnabled(boolean isEnabled) {
		savePlayerLocationsMenu.setEnabled(isEnabled);
	}

	@CalledOnlyBy(AmidstThread.EDT)
	public void setReloadPlayerLocationsMenuEnabled(boolean isEnabled) {
		reloadPlayerLocationsMenu.setEnabled(isEnabled);
	}

	@CalledOnlyBy(AmidstThread.EDT)
	public void initLayersMenu() {
		layersMenu.init();
	}

	@CalledOnlyBy(AmidstThread.EDT)
	public void disableLayersMenu() {
		layersMenu.disable();
	}
}
