	DI (dependency injection)
		○ Two ways to create Dependencies 
			1. Constructor Based
			2. Setter Based
		a. Spring Bean (Scopes)
			1. singleton: (Default) Scopes a single bean definition to a single object instance per Spring IoC container.
			2. prototype: Scopes a single bean definition to any number of object instances.
			3. request: Scopes a single bean definition to the lifecycle of a single HTTP request; that is, each HTTP request has its own instance of a bean created off the back of a single bean definition. Only valid in the context of a web-aware Spring ApplicationContext.
			4. session: Scopes a single bean definition to the lifecycle of an HTTP Session. Only valid in the context of a web-aware Spring ApplicationContext.
			5. application: Scopes a single bean definition to the lifecycle of a ServletContext. Only valid in the context of a web-aware Spring ApplicationContext.
			6. WebSocket: Scopes a single bean definition to the lifecycle of a WebSocket. Only valid in the context of a web-aware Spring ApplicationContext
