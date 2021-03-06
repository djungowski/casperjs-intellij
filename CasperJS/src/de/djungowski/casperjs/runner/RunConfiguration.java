package de.djungowski.casperjs.runner;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.Executor;
import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.LocatableConfigurationBase;
import com.intellij.execution.configurations.RunProfileState;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.openapi.options.SettingsEditor;
import de.djungowski.casperjs.ui.RunConfigurationForm;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import com.intellij.openapi.project.Project;

/**
 * Created by djungowski on 29.07.14.
 */
public class RunConfiguration extends LocatableConfigurationBase {

	public RunConfiguration(Project project, ConfigurationFactory factory, String name) {
		super(project, factory, name);
	}

	@Nullable
	@Override
	public RunProfileState getState(@NotNull Executor executor, @NotNull ExecutionEnvironment environment) throws ExecutionException {
		return null;
	}

	@NotNull
	@Override
	public SettingsEditor<? extends com.intellij.execution.configurations.RunConfiguration> getConfigurationEditor() {
		return new RunConfigurationForm();
	}
}
