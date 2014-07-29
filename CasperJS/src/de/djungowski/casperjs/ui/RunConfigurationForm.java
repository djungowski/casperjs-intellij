package de.djungowski.casperjs.ui;

import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SettingsEditor;
import de.djungowski.casperjs.runner.RunConfiguration;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Created by djungowski on 29.07.14.
 */
public class RunConfigurationForm extends SettingsEditor<RunConfiguration> {
	private JPanel component;
	private JTextField textField1;

	@Override
	protected void resetEditorFrom(RunConfiguration s) {

	}

	@Override
	protected void applyEditorTo(RunConfiguration s) throws ConfigurationException {

	}

	@NotNull
	@Override
	protected JComponent createEditor() {
		return component;
	}
}
