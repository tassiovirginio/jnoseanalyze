package com.tassiovirginio.jnoseanalyze;

import de.agilecoders.wicket.core.Bootstrap;
import de.agilecoders.wicket.core.markup.html.themes.bootstrap.BootstrapTheme;
import de.agilecoders.wicket.core.settings.BootstrapSettings;
import de.agilecoders.wicket.core.settings.SingleThemeProvider;
import org.apache.wicket.csp.CSPDirective;
import org.apache.wicket.csp.CSPDirectiveSrcValue;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;


public class WicketApplication extends WebApplication
{
	
	@Override
	public Class<? extends WebPage> getHomePage()
	{
		return HomePage.class;
	}

	@Override
	public void init(){
		super.init();

//		getCspSettings().blocking()
//			.add(CSPDirective.STYLE_SRC, CSPDirectiveSrcValue.SELF)
//			.add(CSPDirective.STYLE_SRC, "https://fonts.googleapis.com/css")
//			.add(CSPDirective.FONT_SRC, "https://fonts.gstatic.com");

		configureBootstrap(this);
	}

	private void configureBootstrap(WebApplication webApplication) {
        Bootstrap.install(webApplication,
                new BootstrapSettings().setThemeProvider(new SingleThemeProvider(new BootstrapTheme())));
    }

    
}
