package de.djungowski.casperjs.runner;

import com.intellij.execution.configurations.*;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

public class CasperJSConfigurationFactory extends ConfigurationFactory {

	protected CasperJSConfigurationFactory(@NotNull ConfigurationType type) {
		super(type);
	}

	@Override
	public com.intellij.execution.configurations.RunConfiguration createTemplateConfiguration(Project project) {
		return null;
	}
}
