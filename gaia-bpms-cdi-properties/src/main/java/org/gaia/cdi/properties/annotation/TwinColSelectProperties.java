package org.gaia.cdi.properties.annotation;
import javax.inject.*;
import java.lang.annotation.*;
import javax.enterprise.util.*;


@Qualifier
@Target({ ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface TwinColSelectProperties {

@Nonbinding
boolean buffered() default false;

@Nonbinding
java.lang.String caption() default org.gaia.cdi.properties.ComponentConfigurator.IGNORED_STRING;

@Nonbinding
String captionKey() default org.gaia.cdi.properties.ComponentConfigurator.IGNORED_STRING;

@Nonbinding
int columns() default 0;

@Nonbinding
java.lang.String conversionError() default org.gaia.cdi.properties.ComponentConfigurator.IGNORED_STRING;

@Nonbinding
java.lang.String debugId() default org.gaia.cdi.properties.ComponentConfigurator.IGNORED_STRING;

@Nonbinding
java.lang.String description() default org.gaia.cdi.properties.ComponentConfigurator.IGNORED_STRING;

@Nonbinding
boolean enabled() default true;

@Nonbinding
String height() default org.gaia.cdi.properties.ComponentConfigurator.IGNORED_STRING;

@Nonbinding
com.vaadin.server.Sizeable.Unit heightUnits() default com.vaadin.server.Sizeable.Unit.PIXELS;

@Nonbinding
float heightValue() default -1.0f;

@Nonbinding
java.lang.String id() default org.gaia.cdi.properties.ComponentConfigurator.IGNORED_STRING;

@Nonbinding
boolean immediate() default false;

@Nonbinding
Class implementation() default com.vaadin.ui.TwinColSelect.class;

@Nonbinding
boolean invalidAllowed() default true;

@Nonbinding
boolean invalidCommitted() default false;

@Nonbinding
com.vaadin.ui.AbstractSelect.ItemCaptionMode itemCaptionMode() default com.vaadin.ui.AbstractSelect.ItemCaptionMode.EXPLICIT_DEFAULTS_ID;

@Nonbinding
java.lang.String leftColumnCaption() default org.gaia.cdi.properties.ComponentConfigurator.IGNORED_STRING;

@Nonbinding
boolean localized() default true;

@Nonbinding
boolean multiSelect() default true;

@Nonbinding
boolean newItemsAllowed() default false;

@Nonbinding
boolean nullSelectionAllowed() default true;

@Nonbinding
java.lang.String primaryStyleName() default org.gaia.cdi.properties.ComponentConfigurator.IGNORED_STRING;

@Nonbinding
boolean readOnly() default false;

@Nonbinding
boolean required() default false;

@Nonbinding
java.lang.String requiredError() default org.gaia.cdi.properties.ComponentConfigurator.IGNORED_STRING;

@Nonbinding
java.lang.String rightColumnCaption() default org.gaia.cdi.properties.ComponentConfigurator.IGNORED_STRING;

@Nonbinding
int rows() default 0;

@Nonbinding
boolean sizeFull() default false;

@Nonbinding
boolean sizeUndefined() default false;

@Nonbinding
String[] styleName() default {};

@Nonbinding
int tabIndex() default 0;

@Nonbinding
boolean validationVisible() default true;

@Nonbinding
boolean visible() default true;

@Nonbinding
String width() default org.gaia.cdi.properties.ComponentConfigurator.IGNORED_STRING;

@Nonbinding
com.vaadin.server.Sizeable.Unit widthUnits() default com.vaadin.server.Sizeable.Unit.PIXELS;

@Nonbinding
float widthValue() default -1.0f;

}