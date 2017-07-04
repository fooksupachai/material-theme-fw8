package org.vaadin.views;

import com.vaadin.ui.RadioButtonGroup;
import org.vaadin.components.MDCheckbox;
import org.vaadin.components.MDSwitch;
import org.vaadin.layout.FlexLayout;
import org.vaadin.layout.Paddings;
import org.vaadin.layout.Spacings;
import org.vaadin.style.MaterialColor;
import org.vaadin.style.Styles;

/**
 * Created by jonte on 17/03/2017.
 */
public class SelectionControlsView extends FlexLayout {

    public SelectionControlsView() {
        setAlignItems(FlexLayout.AlignItems.FLEX_START);
        setAlignSelf(AlignSelf.BASELINE);
        setFlexWrap(FlexLayout.FlexWrap.WRAP);
        setJustifyContent(JustifyContent.CENTER);
        addStyleName(Spacings.All.LARGE);

        // Checkboxes
        MDCheckbox cb1 = new MDCheckbox("Light On");
        MDCheckbox cb2 = new MDCheckbox("Light Off");
        MDCheckbox cb3 = new MDCheckbox("Light Disabled");
        cb3.setEnabled(false);

        FlexLayout light1 = new FlexLayout(cb1, cb2, cb3);
        light1.setFlexDirection(FlexLayout.FlexDirection.COLUMN);
        light1.addStyleName("card " + Paddings.All.LARGE);


        MDCheckbox cb4 = new MDCheckbox("Dark On", false);
        MDCheckbox cb5 = new MDCheckbox("Dark Off", false);
        MDCheckbox cb6 = new MDCheckbox("Dark Disabled", false);
        cb6.setEnabled(false);

        FlexLayout dark1 = new FlexLayout(cb4, cb5, cb6);
        dark1.setFlexDirection(FlexLayout.FlexDirection.COLUMN);
        dark1.addStyleName("card " + MaterialColor.GREY_900.getBackgroundColorStyle() + " " + Paddings.All.LARGE);


        // Radio buttons
        RadioButtonGroup<String> rbg1 = new RadioButtonGroup();
        rbg1.setItems("One", "Two");
        rbg1.setPrimaryStyleName(Styles.OptionGroups.LIGHT);

        RadioButtonGroup<String> rbg2 = new RadioButtonGroup();
        rbg2.setItems("Disabled One", "Disabled Two");
        rbg2.setPrimaryStyleName(Styles.OptionGroups.LIGHT);
        rbg2.setEnabled(false);

        FlexLayout light2 = new FlexLayout(rbg1, rbg2);
        light2.setFlexDirection(FlexLayout.FlexDirection.COLUMN);
        light2.addStyleName("card " + Paddings.All.LARGE);

        RadioButtonGroup<String> rbg3 = new RadioButtonGroup();
        rbg3.setItems("One", "Two");
        rbg3.setPrimaryStyleName(Styles.OptionGroups.DARK);

        RadioButtonGroup<String> rbg4 = new RadioButtonGroup();
        rbg4.setItems("Disabled One", "Disabled Two");
        rbg4.setPrimaryStyleName(Styles.OptionGroups.DARK);
        rbg4.setEnabled(false);

        FlexLayout dark2 = new FlexLayout(rbg3, rbg4);
        dark2.setFlexDirection(FlexLayout.FlexDirection.COLUMN);
        dark2.addStyleName("card " + MaterialColor.GREY_900.getBackgroundColorStyle() + " " + Paddings.All.LARGE);


        // Switches
        MDSwitch sw1 = new MDSwitch("Light On");
        MDSwitch sw2 = new MDSwitch("Light Off");
        MDSwitch sw3 = new MDSwitch("Light Disabled");
        sw3.setEnabled(false);

        FlexLayout light3 = new FlexLayout(sw1, sw2, sw3);
        light3.setFlexDirection(FlexLayout.FlexDirection.COLUMN);
        light3.addStyleName("card " + Paddings.All.LARGE);


        MDSwitch sw4 = new MDSwitch("Dark On", false);
        MDSwitch sw5 = new MDSwitch("Dark Off", false);
        MDSwitch sw6 = new MDSwitch("Dark Disabled", false);
        sw6.setEnabled(false);

        FlexLayout dark3 = new FlexLayout(sw4, sw5, sw6);
        dark3.setFlexDirection(FlexLayout.FlexDirection.COLUMN);
        dark3.addStyleName("card " + MaterialColor.GREY_900.getBackgroundColorStyle() + " " + Paddings.All.LARGE);


        addComponents(light1, dark1, light2, dark2, light3, dark3);

    }
}
