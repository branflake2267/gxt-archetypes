#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.application.widgets.windowwidget;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

import ${package}.client.application.widgets.windowwidget.WindowWidgetPresenter;
import ${package}.client.application.widgets.windowwidget.WindowWidgetUiHandlers;
import ${package}.client.application.widgets.windowwidget.WindowWidgetView;

public class WindowWidgetModule extends AbstractPresenterModule {

  @Override
  protected void configure() {
    bindSingletonPresenterWidget(WindowWidgetPresenter.class, WindowWidgetPresenter.MyView.class,
        WindowWidgetView.class);
    bind(WindowWidgetUiHandlers.class).to(WindowWidgetPresenter.class);
  }

}
