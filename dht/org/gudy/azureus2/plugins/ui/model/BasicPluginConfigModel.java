/*
 * Created on 28-Apr-2004
 * Created by Paul Gardner
 * Copyright (C) 2004, 2005, 2006 Aelitis, All Rights Reserved.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 * 
 * AELITIS, SAS au capital de 46,603.30 euros
 * 8 Allee Lenotre, La Grille Royale, 78600 Le Mesnil le Roi, France.
 *
 */

package org.gudy.azureus2.plugins.ui.model;

import org.gudy.azureus2.plugins.ui.config.ActionParameter;
import org.gudy.azureus2.plugins.ui.config.BooleanParameter;
import org.gudy.azureus2.plugins.ui.config.ColorParameter;
import org.gudy.azureus2.plugins.ui.config.DirectoryParameter;
import org.gudy.azureus2.plugins.ui.config.FileParameter;
import org.gudy.azureus2.plugins.ui.config.HyperlinkParameter;
import org.gudy.azureus2.plugins.ui.config.InfoParameter;
import org.gudy.azureus2.plugins.ui.config.IntParameter;
import org.gudy.azureus2.plugins.ui.config.LabelParameter;
import org.gudy.azureus2.plugins.ui.config.Parameter;
import org.gudy.azureus2.plugins.ui.config.ParameterGroup;
import org.gudy.azureus2.plugins.ui.config.PasswordParameter;
import org.gudy.azureus2.plugins.ui.config.StringListParameter;
import org.gudy.azureus2.plugins.ui.config.StringParameter;
import org.gudy.azureus2.plugins.ui.config.UIParameter;
import org.gudy.azureus2.plugins.ui.config.UIParameterContext;

/**
 * This object represents a configuration section.
 *
 * <p>
 * 
 * If you specify "_blank" as a resource name (the label for the parameter),
 * (or use the {@link #BLANK_RESOURCE} constant defined here), then this will
 * be a blank label (available since 3.0.5.3).
 */
public interface 
BasicPluginConfigModel 
	extends PluginConfigModel {
	
	/**
	 * @since 3.0.5.3
	 */
	public String BLANK_RESOURCE = "_blank";
	
	/**
	 * @deprecated use addBooleanParameter2
	 * @param key
	 * @param resource_name
	 * @param defaultValue
	 * @return
	 * 
	 * @since 2.1.0.0
	 */
	
	public void
	addBooleanParameter(
		String 		key,
		String 		resource_name,
		boolean 	defaultValue );
	
	/**
	 * @deprecated user addStringParameter2
	 * @param key
	 * @param resource_name
	 * @param defaultValue
	 * @return
	 * 
	 * @since 2.1.0.0
	 */
	
	public void
	addStringParameter(
		String 		key,
		String 		resource_name,
		String	 	defaultValue );
	
	
	/**
	 * 
	 * @param key
	 * @param resource_name
	 * @param defaultValue
	 * @return
	 * 
	 * @since 2.1.0.2
	 */
	public BooleanParameter
	addBooleanParameter2(
		String 		key,
		String 		resource_name,
		boolean 	defaultValue );

	/**
	 * 
	 * @param key
	 * @param resource_name
	 * @param defaultValue
	 * @return
	 * @since 2.1.0.2
	 */
	public StringParameter
	addStringParameter2(
		String 		key,
		String 		resource_name,
		String	 	defaultValue );
	
	/**
	 * 
	 * @param key
	 * @param resource_name
	 * @param values
	 * @param defaultValue
	 * @return
	 * @since 2.1.0.2
	 */
	public StringListParameter
	addStringListParameter2(
		String 		key,
		String 		resource_name,
		String[]	values,
		String	 	defaultValue );

	/**
	 * 
	 * @param key
	 * @param resource_name
	 * @param values
	 * @param labels A list of localised message strings corresponding to each value.
	 * @param defaultValue
	 * @return
	 * @since 2.3.0.6
	 */
	public StringListParameter
	addStringListParameter2(
		String 		key,
		String 		resource_name,
		String[]	values,
		String[]	labels,
		String	 	defaultValue );

	/**
	 * 
	 * @param key
	 * @param resource_name
	 * @param encoding_type
	 * @param defaultValue
	 * @return
	 * @since 2.1.0.2
	 */
	public PasswordParameter
	addPasswordParameter2(
		String 		key,
		String 		resource_name,
		int			encoding_type,		// see PasswordParameter.ET_ constants
		byte[]	 	defaultValue );		// plain default value

	/**
	 * 
	 * @param key
	 * @param resource_name
	 * @param defaultValue
	 * @return
	 * @since 2.1.0.2
	 */
	public IntParameter
	addIntParameter2(
		String 		key,
		String 		resource_name,
		int	 		defaultValue );

	/**
	 * 
	 * @param key
	 * @param resource_name
	 * @param defaultValue
	 * @param min_value Minimum allowed value
	 * @param max_value Maximum allowed value
	 * @return
	 * @since 3.0.3.5
	 */
	public IntParameter
	addIntParameter2(
		String 		key,
		String 		resource_name,
		int	 		defaultValue,
		int         min_value,
		int         max_value);
	
	/**
	 * 
	 * @param resource_name
	 * @return
	 * @since 2.1.0.2
	 */
	public LabelParameter
	addLabelParameter2(
		String 		resource_name );
	
	/**
	 * @since 4005
	 * @param resource_name
	 * @param value
	 * @return
	 */
	
	public InfoParameter
	addInfoParameter2(
		String 		resource_name,
		String		value );

	/**
	 * @since 2.5.0.2
	 */
	public HyperlinkParameter addHyperlinkParameter2(String resource_name, String url_location);

	/**
	 * 
	 * @param key
	 * @param resource_name
	 * @param defaultValue
	 * @return
	 * @since 2.1.0.2
	 */
	public DirectoryParameter
	addDirectoryParameter2(
		String 		key,
		String 		resource_name,
		String	 	defaultValue );
	
	/**
	 * 
	 * @param key
	 * @param resource_name
	 * @param defaultValue
	 * @return
	 * @since 2.5.0.1
	 */
	public FileParameter
	addFileParameter2(
		String 		key,
		String 		resource_name,
		String	 	defaultValue );
	
	/**
	 * 
	 * @param key
	 * @param resource_name
	 * @param defaultValue
	 * @param file_extensions Allowed list of file extensions.
	 * @return
	 * @since 2.5.0.1
	 */
	public FileParameter
	addFileParameter2(
		String 		key,
		String 		resource_name,
		String	 	defaultValue,
		String[]    file_extensions);
	
	/**
	 * 
	 * @param label_resource_name
	 * @param action_resource_name
	 * @return
	 * @since 2.1.0.2
	 */
	public ActionParameter
	addActionParameter2(
		String 		label_resource_name,
		String		action_resource_name );
	
	/**
	 * @since 3.0.3.5
	 * @param key
	 * @param resource_name
	 * @param r
	 * @param g
	 * @param b
	 * @return
	 */
	public ColorParameter addColorParameter2(String key, String resource_name, int r, int g, int b);
	
	/**
	 * Creates a {@link UIParameter} object to add to this config model object.
	 * 
	 * @since 3.0.5.3
	 */
	public UIParameter addUIParameter2(UIParameterContext context, String name);
	
	/**
	 * 
	 * @param resource_name
	 * @param parameters
	 * @return
	 * @since 2.3.0.0
	 */
	public ParameterGroup
	createGroup(
		String		resource_name,
		Parameter[]	parameters );

	/**
	 * 
	 * @return
	 * @since 2.3.0.5
	 */
	public String
	getSection();
	
	/**
	 * 
	 * @return
	 * @since 2.3.0.5
	 */
	public String
	getParentSection();
	
	/**
	 * Retrieve all the parameters added to this plugin config
	 * 
	 * @return parameter list
	 * @since 2.3.0.5
	 */
	public Parameter[]
	getParameters();
	
	/**
	 * Sets the name of the configuration model - this is useful in
	 * situations where the configuration section is being dynamically
	 * created (perhaps with user input).
	 * 
	 * @since 3.0.5.3
	 */
	public void setLocalizedName(String name);
}