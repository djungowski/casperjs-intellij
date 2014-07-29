package de.djungowski.casperjs.runner;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import de.djungowski.casperjs.icon.Icons;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class RunConfiguration implements ConfigurationType {

	private CasperJSConfigurationFactory configurationFactory;

	public RunConfiguration() {
		this.configurationFactory = new CasperJSConfigurationFactory(this);
	}

	@Override
	public String getDisplayName() {
		return "CasperJS";
	}

	@Override
	public Icon getIcon() {
		return Icons.basicIcon16px();
	}

	@NotNull
	@Override
	public String getId() {
		return "CasperJS";
	}

	@Override
	public String getConfigurationTypeDescription() {
		return "A CasperJS runner";
	}

	@Override
	public ConfigurationFactory[] getConfigurationFactories() {
		return new CasperJSConfigurationFactory[]{ configurationFactory };
	}
}
