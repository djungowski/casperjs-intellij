import com.intellij.execution.configurations.ConfigurationTypeBase;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Created by djungowski on 29.07.14.
 */
public class RunConfiguration extends ConfigurationTypeBase {

	public RunConfiguration() {
		super("casperjs", "CasperJS", "A CasperJS Runner", null);
	}

}
