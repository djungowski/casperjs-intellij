package de.djungowski.casperjs.ui;

import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import de.djungowski.casperjs.runner.RunConfiguration;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Created by djungowski on 29.07.14.
 */
public class RunConfigurationForm extends SettingsEditor<RunConfiguration> {
	private JPanel component;
	private JCheckBox takeScreenshotOnFailureCheckBox;
	private JTextArea testFiles;
	private TextFieldWithBrowseButton casperBinary;
	private TextFieldWithBrowseButton workingDirectory;

	@Override
	protected void resetEditorFrom(RunConfiguration s) {

	}

	@Override
	protected void applyEditorTo(RunConfiguration s) throws ConfigurationException {

	}

	@NotNull
	@Override
	protected JComponent createEditor() {
		final FileChooserDescriptor casperBinaryFileChooserDescriptor = FileChooserDescriptorFactory.createSingleFileDescriptor(null);
		casperBinary.addBrowseFolderListener("CasperJS executable", "Choose CasperJS executable", null, casperBinaryFileChooserDescriptor);

		final FileChooserDescriptor workingDirectoryFileChooserDescriptor = FileChooserDescriptorFactory.createSingleFolderDescriptor();
		workingDirectory.addBrowseFolderListener("Working Directory", "Choose working directory", null, workingDirectoryFileChooserDescriptor);

		return component;
	}

	private void createUIComponents() {
		// TODO: place custom component creation code here
	}
}
