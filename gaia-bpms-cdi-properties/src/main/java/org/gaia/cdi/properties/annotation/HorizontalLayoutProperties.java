package org.gaia.cdi.properties.annotation;
import javax.inject.*;
import java.lang.annotation.*;
import javax.enterprise.util.*;


@Qualifier
@Target({ ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface HorizontalLayoutProperties {

@Nonbinding
java.lang.String caption() default org.gaia.cdi.properties.ComponentConfigurator.IGNORED_STRING;

@Nonbinding
String captionKey() default org.gaia.cdi.properties.ComponentConfigurator.IGNORED_STRING;

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
Class implementation() default com.vaadin.ui.HorizontalLayout.class;

@Nonbinding
boolean localized() default true;

@Nonbinding
boolean[] margin() default {};

@Nonbinding
java.lang.String primaryStyleName() default org.gaia.cdi.properties.ComponentConfigurator.IGNORED_STRING;

@Nonbinding
boolean readOnly() default false;

@Nonbinding
boolean sizeFull() default false;

@Nonbinding
boolean sizeUndefined() default false;

@Nonbinding
boolean spacing() default false;

@Nonbinding
String[] styleName() default {};

@Nonbinding
boolean visible() default true;

@Nonbinding
String width() default org.gaia.cdi.properties.ComponentConfigurator.IGNORED_STRING;

@Nonbinding
com.vaadin.server.Sizeable.Unit widthUnits() default com.vaadin.server.Sizeable.Unit.PIXELS;

@Nonbinding
float widthValue() default -1.0f;

}