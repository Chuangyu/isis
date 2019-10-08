package org.ro.urls

object HTTP_ERROR_ON_UNIQUE_CONSTRAINT_VIOLATION : Response() {
    val ReadCallback = "\$ReadCallback"
    val CachedChain = "\$CachedChain"

    override val url = "http://localhost:8080/restful/services/isisApplib.FixtureScriptsDefault/actions/runFixtureScript/invoke"
    override val str = """{
    "httpStatusCode": 500,
    "message": "Insert of object \"domainapp.modules.simple.dom.impl.SimpleObject@7d58c3bd\" using statement \"INSERT INTO \"simple\".\"SimpleObject\" (\"name\",\"notes\",\"version\") VALUES (?,?,?)\" failed : integrity constraint violation: unique constraint or index violation; \"SimpleObject_name_UNQ\" table: \"SimpleObject\"",
    "detail": {
        "className": "javax.jdo.JDODataStoreException",
        "message": "Insert of object \"domainapp.modules.simple.dom.impl.SimpleObject@7d58c3bd\" using statement \"INSERT INTO \"simple\".\"SimpleObject\" (\"name\",\"notes\",\"version\") VALUES (?,?,?)\" failed : integrity constraint violation: unique constraint or index violation; \"SimpleObject_name_UNQ\" table: \"SimpleObject\"",
        "element": [
            "org.datanucleus.api.jdo.NucleusJDOHelper.getJDOExceptionForNucleusException(NucleusJDOHelper.java:543)",
            "org.datanucleus.api.jdo.JDOPersistenceManager.jdoMakePersistent(JDOPersistenceManager.java:725)",
            "org.datanucleus.api.jdo.JDOPersistenceManager.makePersistent(JDOPersistenceManager.java:745)",
            "org.apache.isis.objectstore.jdo.datanucleus.persistence.commands.DataNucleusCreateObjectCommand.execute(DataNucleusCreateObjectCommand.java:54)",
            "org.apache.isis.core.runtime.system.persistence.PersistenceSession.executeCommands(PersistenceSession.java:1309)",
            "org.apache.isis.core.runtime.system.persistence.PersistenceSession.execute(PersistenceSession.java:1303)",
            "org.apache.isis.core.runtime.system.transaction.IsisTransaction.doFlush(IsisTransaction.java:393)",
            "org.apache.isis.core.runtime.system.transaction.IsisTransaction.flush(IsisTransaction.java:347)",
            "org.apache.isis.core.runtime.system.transaction.IsisTransactionManager.flushTransaction(IsisTransactionManager.java:265)",
            "org.apache.isis.core.runtime.services.persistsession.PersistenceSessionServiceInternalDefault.flush(PersistenceSessionServiceInternalDefault.java:156)",
            "org.apache.isis.core.metamodel.services.xactn.TransactionServiceDefault.flushTransaction(TransactionServiceDefault.java:39)",
            "org.apache.isis.core.metamodel.facets.actions.action.invocation.ActionInvocationFacetForDomainEventAbstract.setCommandResultIfEntity(ActionInvocationFacetForDomainEventAbstract.java:461)",
            "org.apache.isis.core.metamodel.facets.actions.action.invocation.ActionInvocationFacetForDomainEventAbstract.doInvoke(ActionInvocationFacetForDomainEventAbstract.java:334)",
            "org.apache.isis.core.metamodel.facets.actions.action.invocation.ActionInvocationFacetForDomainEventAbstract${'$'}1.execute(ActionInvocationFacetForDomainEventAbstract.java:164)",
            "org.apache.isis.core.runtime.system.transaction.IsisTransactionManager.executeWithinTransaction(IsisTransactionManager.java:142)",
            "org.apache.isis.core.runtime.system.transaction.IsisTransactionManager.executeWithinTransaction(IsisTransactionManager.java:132)",
            "org.apache.isis.core.runtime.services.persistsession.PersistenceSessionServiceInternalDefault.executeWithinTransaction(PersistenceSessionServiceInternalDefault.java:186)",
            "org.apache.isis.core.metamodel.facets.actions.action.invocation.ActionInvocationFacetForDomainEventAbstract.invoke(ActionInvocationFacetForDomainEventAbstract.java:160)",
            "org.apache.isis.core.metamodel.specloader.specimpl.ObjectActionDefault.executeInternal(ObjectActionDefault.java:400)",
            "org.apache.isis.core.metamodel.specloader.specimpl.ObjectActionDefault.execute(ObjectActionDefault.java:389)",
            "org.apache.isis.viewer.restfulobjects.server.resources.DomainResourceHelper.invokeActionUsingAdapters(DomainResourceHelper.java:370)",
            "org.apache.isis.viewer.restfulobjects.server.resources.DomainResourceHelper.invokeAction(DomainResourceHelper.java:351)",
            "org.apache.isis.viewer.restfulobjects.server.resources.DomainServiceResourceServerside.invokeAction(DomainServiceResourceServerside.java:263)",
            "sun.reflect.GeneratedMethodAccessor184.invoke(Unknown Source)",
            "sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)",
            "java.lang.reflect.Method.invoke(Method.java:498)",
            "org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:140)",
            "org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:295)",
            "org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:249)",
            "org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:236)",
            "org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:406)",
            "org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:213)",
            "org.jboss.resteasy.plugins.server.servlet.ServletContainerDispatcher.service(ServletContainerDispatcher.java:228)",
            "org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher.service(HttpServletDispatcher.java:56)",
            "org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher.service(HttpServletDispatcher.java:51)",
            "javax.servlet.http.HttpServlet.service(HttpServlet.java:790)",
            "org.eclipse.jetty.servlet.ServletHolder.handle(ServletHolder.java:821)",
            "org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1685)",
            "org.apache.isis.viewer.restfulobjects.server.webapp.IsisTransactionFilterForRestfulObjects.doFilter(IsisTransactionFilterForRestfulObjects.java:50)",
            "org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1668)",
            "org.apache.isis.core.webapp.IsisSessionFilter.doFilter(IsisSessionFilter.java:341)",
            "org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1668)",
            "org.apache.isis.core.webapp.diagnostics.IsisLogOnExceptionFilter.doFilter(IsisLogOnExceptionFilter.java:52)",
            "org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1668)",
            "org.apache.shiro.web.servlet.AbstractShiroFilter.executeChain(AbstractShiroFilter.java:449)",
            "org.apache.shiro.web.servlet.AbstractShiroFilter${'$'}1.call(AbstractShiroFilter.java:365)",
            "org.apache.shiro.subject.support.SubjectCallable.doCall(SubjectCallable.java:90)",
            "org.apache.shiro.subject.support.SubjectCallable.call(SubjectCallable.java:83)",
            "org.apache.shiro.subject.support.DelegatingSubject.execute(DelegatingSubject.java:383)",
            "org.apache.shiro.web.servlet.AbstractShiroFilter.doFilterInternal(AbstractShiroFilter.java:362)",
            "org.apache.shiro.web.servlet.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:125)",
            "org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1668)",
            "org.eclipse.jetty.servlets.CrossOriginFilter.handle(CrossOriginFilter.java:308)",
            "org.eclipse.jetty.servlets.CrossOriginFilter.doFilter(CrossOriginFilter.java:262)",
            "org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1668)",
            "org.eclipse.jetty.servlet.ServletHandler.doHandle(ServletHandler.java:581)",
            "org.eclipse.jetty.server.handler.ScopedHandler.handle(ScopedHandler.java:143)",
            "org.eclipse.jetty.security.SecurityHandler.handle(SecurityHandler.java:548)",
            "org.eclipse.jetty.server.session.SessionHandler.doHandle(SessionHandler.java:226)",
            "org.eclipse.jetty.server.handler.ContextHandler.doHandle(ContextHandler.java:1158)",
            "org.eclipse.jetty.servlet.ServletHandler.doScope(ServletHandler.java:511)",
            "org.eclipse.jetty.server.session.SessionHandler.doScope(SessionHandler.java:185)",
            "org.eclipse.jetty.server.handler.ContextHandler.doScope(ContextHandler.java:1090)",
            "org.eclipse.jetty.server.handler.ScopedHandler.handle(ScopedHandler.java:141)",
            "org.eclipse.jetty.server.handler.ContextHandlerCollection.handle(ContextHandlerCollection.java:213)",
            "org.eclipse.jetty.server.handler.HandlerCollection.handle(HandlerCollection.java:109)",
            "org.eclipse.jetty.server.handler.HandlerWrapper.handle(HandlerWrapper.java:119)",
            "org.eclipse.jetty.server.Server.handle(Server.java:517)",
            "org.eclipse.jetty.server.HttpChannel.handle(HttpChannel.java:306)",
            "org.eclipse.jetty.server.HttpConnection.onFillable(HttpConnection.java:242)",
            "org.eclipse.jetty.io.AbstractConnection$ReadCallback.succeeded(AbstractConnection.java:261)",
            "org.eclipse.jetty.io.FillInterest.fillable(FillInterest.java:95)",
            "org.eclipse.jetty.io.SelectChannelEndPoint${'$'}2.run(SelectChannelEndPoint.java:75)",
            "org.eclipse.jetty.util.thread.strategy.ExecuteProduceConsume.produceAndRun(ExecuteProduceConsume.java:213)",
            "org.eclipse.jetty.util.thread.strategy.ExecuteProduceConsume.run(ExecuteProduceConsume.java:147)",
            "org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:654)",
            "org.eclipse.jetty.util.thread.QueuedThreadPool${'$'}3.run(QueuedThreadPool.java:572)",
            "java.lang.Thread.run(Thread.java:748)"
        ],
        "causedBy": {
            "className": "java.sql.SQLIntegrityConstraintViolationException",
            "message": "integrity constraint violation: unique constraint or index violation; \"SimpleObject_name_UNQ\" table: \"SimpleObject\"",
            "element": [
                "org.hsqldb.jdbc.JDBCUtil.sqlException(Unknown Source)",
                "org.hsqldb.jdbc.JDBCUtil.sqlException(Unknown Source)",
                "org.hsqldb.jdbc.JDBCPreparedStatement.fetchResult(Unknown Source)",
                "org.hsqldb.jdbc.JDBCPreparedStatement.executeUpdate(Unknown Source)",
                "org.datanucleus.store.rdbms.datasource.dbcp.DelegatingPreparedStatement.executeUpdate(DelegatingPreparedStatement.java:103)",
                "org.datanucleus.store.rdbms.datasource.dbcp.DelegatingPreparedStatement.executeUpdate(DelegatingPreparedStatement.java:103)",
                "org.datanucleus.store.rdbms.ParamLoggingPreparedStatement.executeUpdate(ParamLoggingPreparedStatement.java:393)",
                "org.datanucleus.store.rdbms.SQLController.executeStatementUpdate(SQLController.java:431)",
                "org.datanucleus.store.rdbms.request.InsertRequest.execute(InsertRequest.java:413)",
                "org.datanucleus.store.rdbms.RDBMSPersistenceHandler.insertObjectInTable(RDBMSPersistenceHandler.java:162)",
                "org.datanucleus.store.rdbms.RDBMSPersistenceHandler.insertObject(RDBMSPersistenceHandler.java:138)",
                "org.datanucleus.state.StateManagerImpl.internalMakePersistent(StateManagerImpl.java:3363)",
                "org.datanucleus.state.StateManagerImpl.makePersistent(StateManagerImpl.java:3339)",
                "org.datanucleus.ExecutionContextImpl.persistObjectInternal(ExecutionContextImpl.java:2079)",
                "org.datanucleus.ExecutionContextImpl.persistObjectWork(ExecutionContextImpl.java:1922)",
                "org.datanucleus.ExecutionContextImpl.persistObject(ExecutionContextImpl.java:1777)",
                "org.datanucleus.api.jdo.JDOPersistenceManager.jdoMakePersistent(JDOPersistenceManager.java:720)",
                "org.datanucleus.api.jdo.JDOPersistenceManager.makePersistent(JDOPersistenceManager.java:745)",
                "org.apache.isis.objectstore.jdo.datanucleus.persistence.commands.DataNucleusCreateObjectCommand.execute(DataNucleusCreateObjectCommand.java:54)",
                "org.apache.isis.core.runtime.system.persistence.PersistenceSession.executeCommands(PersistenceSession.java:1309)",
                "org.apache.isis.core.runtime.system.persistence.PersistenceSession.execute(PersistenceSession.java:1303)",
                "org.apache.isis.core.runtime.system.transaction.IsisTransaction.doFlush(IsisTransaction.java:393)",
                "org.apache.isis.core.runtime.system.transaction.IsisTransaction.flush(IsisTransaction.java:347)",
                "org.apache.isis.core.runtime.system.transaction.IsisTransactionManager.flushTransaction(IsisTransactionManager.java:265)",
                "org.apache.isis.core.runtime.services.persistsession.PersistenceSessionServiceInternalDefault.flush(PersistenceSessionServiceInternalDefault.java:156)",
                "org.apache.isis.core.metamodel.services.xactn.TransactionServiceDefault.flushTransaction(TransactionServiceDefault.java:39)",
                "org.apache.isis.core.metamodel.facets.actions.action.invocation.ActionInvocationFacetForDomainEventAbstract.setCommandResultIfEntity(ActionInvocationFacetForDomainEventAbstract.java:461)",
                "org.apache.isis.core.metamodel.facets.actions.action.invocation.ActionInvocationFacetForDomainEventAbstract.doInvoke(ActionInvocationFacetForDomainEventAbstract.java:334)",
                "org.apache.isis.core.metamodel.facets.actions.action.invocation.ActionInvocationFacetForDomainEventAbstract${'$'}1.execute(ActionInvocationFacetForDomainEventAbstract.java:164)",
                "org.apache.isis.core.runtime.system.transaction.IsisTransactionManager.executeWithinTransaction(IsisTransactionManager.java:142)",
                "org.apache.isis.core.runtime.system.transaction.IsisTransactionManager.executeWithinTransaction(IsisTransactionManager.java:132)",
                "org.apache.isis.core.runtime.services.persistsession.PersistenceSessionServiceInternalDefault.executeWithinTransaction(PersistenceSessionServiceInternalDefault.java:186)",
                "org.apache.isis.core.metamodel.facets.actions.action.invocation.ActionInvocationFacetForDomainEventAbstract.invoke(ActionInvocationFacetForDomainEventAbstract.java:160)",
                "org.apache.isis.core.metamodel.specloader.specimpl.ObjectActionDefault.executeInternal(ObjectActionDefault.java:400)",
                "org.apache.isis.core.metamodel.specloader.specimpl.ObjectActionDefault.execute(ObjectActionDefault.java:389)",
                "org.apache.isis.viewer.restfulobjects.server.resources.DomainResourceHelper.invokeActionUsingAdapters(DomainResourceHelper.java:370)",
                "org.apache.isis.viewer.restfulobjects.server.resources.DomainResourceHelper.invokeAction(DomainResourceHelper.java:351)",
                "org.apache.isis.viewer.restfulobjects.server.resources.DomainServiceResourceServerside.invokeAction(DomainServiceResourceServerside.java:263)",
                "sun.reflect.GeneratedMethodAccessor184.invoke(Unknown Source)",
                "sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)",
                "java.lang.reflect.Method.invoke(Method.java:498)",
                "org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:140)",
                "org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:295)",
                "org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:249)",
                "org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:236)",
                "org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:406)",
                "org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:213)",
                "org.jboss.resteasy.plugins.server.servlet.ServletContainerDispatcher.service(ServletContainerDispatcher.java:228)",
                "org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher.service(HttpServletDispatcher.java:56)",
                "org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher.service(HttpServletDispatcher.java:51)",
                "javax.servlet.http.HttpServlet.service(HttpServlet.java:790)",
                "org.eclipse.jetty.servlet.ServletHolder.handle(ServletHolder.java:821)",
                "org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1685)",
                "org.apache.isis.viewer.restfulobjects.server.webapp.IsisTransactionFilterForRestfulObjects.doFilter(IsisTransactionFilterForRestfulObjects.java:50)",
                "org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1668)",
                "org.apache.isis.core.webapp.IsisSessionFilter.doFilter(IsisSessionFilter.java:341)",
                "org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1668)",
                "org.apache.isis.core.webapp.diagnostics.IsisLogOnExceptionFilter.doFilter(IsisLogOnExceptionFilter.java:52)",
                "org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1668)",
                "org.apache.shiro.web.servlet.AbstractShiroFilter.executeChain(AbstractShiroFilter.java:449)",
                "org.apache.shiro.web.servlet.AbstractShiroFilter${'$'}1.call(AbstractShiroFilter.java:365)",
                "org.apache.shiro.subject.support.SubjectCallable.doCall(SubjectCallable.java:90)",
                "org.apache.shiro.subject.support.SubjectCallable.call(SubjectCallable.java:83)",
                "org.apache.shiro.subject.support.DelegatingSubject.execute(DelegatingSubject.java:383)",
                "org.apache.shiro.web.servlet.AbstractShiroFilter.doFilterInternal(AbstractShiroFilter.java:362)",
                "org.apache.shiro.web.servlet.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:125)",
                "org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1668)",
                "org.eclipse.jetty.servlets.CrossOriginFilter.handle(CrossOriginFilter.java:308)",
                "org.eclipse.jetty.servlets.CrossOriginFilter.doFilter(CrossOriginFilter.java:262)",
                "org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1668)",
                "org.eclipse.jetty.servlet.ServletHandler.doHandle(ServletHandler.java:581)",
                "org.eclipse.jetty.server.handler.ScopedHandler.handle(ScopedHandler.java:143)",
                "org.eclipse.jetty.security.SecurityHandler.handle(SecurityHandler.java:548)",
                "org.eclipse.jetty.server.session.SessionHandler.doHandle(SessionHandler.java:226)",
                "org.eclipse.jetty.server.handler.ContextHandler.doHandle(ContextHandler.java:1158)",
                "org.eclipse.jetty.servlet.ServletHandler.doScope(ServletHandler.java:511)",
                "org.eclipse.jetty.server.session.SessionHandler.doScope(SessionHandler.java:185)",
                "org.eclipse.jetty.server.handler.ContextHandler.doScope(ContextHandler.java:1090)",
                "org.eclipse.jetty.server.handler.ScopedHandler.handle(ScopedHandler.java:141)",
                "org.eclipse.jetty.server.handler.ContextHandlerCollection.handle(ContextHandlerCollection.java:213)",
                "org.eclipse.jetty.server.handler.HandlerCollection.handle(HandlerCollection.java:109)",
                "org.eclipse.jetty.server.handler.HandlerWrapper.handle(HandlerWrapper.java:119)",
                "org.eclipse.jetty.server.Server.handle(Server.java:517)",
                "org.eclipse.jetty.server.HttpChannel.handle(HttpChannel.java:306)",
                "org.eclipse.jetty.server.HttpConnection.onFillable(HttpConnection.java:242)",
                "org.eclipse.jetty.io.AbstractConnection$ReadCallback.succeeded(AbstractConnection.java:261)",
                "org.eclipse.jetty.io.FillInterest.fillable(FillInterest.java:95)",
                "org.eclipse.jetty.io.SelectChannelEndPoint${'$'}2.run(SelectChannelEndPoint.java:75)",
                "org.eclipse.jetty.util.thread.strategy.ExecuteProduceConsume.produceAndRun(ExecuteProduceConsume.java:213)",
                "org.eclipse.jetty.util.thread.strategy.ExecuteProduceConsume.run(ExecuteProduceConsume.java:147)",
                "org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:654)",
                "org.eclipse.jetty.util.thread.QueuedThreadPool${'$'}3.run(QueuedThreadPool.java:572)",
                "java.lang.Thread.run(Thread.java:748)"
            ],
            "causedBy": {
                "className": "org.hsqldb.HsqlException",
                "message": "integrity constraint violation: unique constraint or index violation; \"SimpleObject_name_UNQ\" table: \"SimpleObject\"",
                "element": [
                    "org.hsqldb.error.Error.error(Unknown Source)",
                    "org.hsqldb.Constraint.getException(Unknown Source)",
                    "org.hsqldb.index.IndexAVLMemory.insert(Unknown Source)",
                    "org.hsqldb.persist.RowStoreAVL.indexRow(Unknown Source)",
                    "org.hsqldb.TransactionManager2PL.addInsertAction(Unknown Source)",
                    "org.hsqldb.Session.addInsertAction(Unknown Source)",
                    "org.hsqldb.Table.insertSingleRow(Unknown Source)",
                    "org.hsqldb.StatementDML.insertRowSet(Unknown Source)",
                    "org.hsqldb.StatementInsert.getResult(Unknown Source)",
                    "org.hsqldb.StatementDMQL.execute(Unknown Source)",
                    "org.hsqldb.Session.executeCompiledStatement(Unknown Source)",
                    "org.hsqldb.Session.execute(Unknown Source)",
                    "org.hsqldb.jdbc.JDBCPreparedStatement.fetchResult(Unknown Source)",
                    "org.hsqldb.jdbc.JDBCPreparedStatement.executeUpdate(Unknown Source)",
                    "org.datanucleus.store.rdbms.datasource.dbcp.DelegatingPreparedStatement.executeUpdate(DelegatingPreparedStatement.java:103)",
                    "org.datanucleus.store.rdbms.datasource.dbcp.DelegatingPreparedStatement.executeUpdate(DelegatingPreparedStatement.java:103)",
                    "org.datanucleus.store.rdbms.ParamLoggingPreparedStatement.executeUpdate(ParamLoggingPreparedStatement.java:393)",
                    "org.datanucleus.store.rdbms.SQLController.executeStatementUpdate(SQLController.java:431)",
                    "org.datanucleus.store.rdbms.request.InsertRequest.execute(InsertRequest.java:413)",
                    "org.datanucleus.store.rdbms.RDBMSPersistenceHandler.insertObjectInTable(RDBMSPersistenceHandler.java:162)",
                    "org.datanucleus.store.rdbms.RDBMSPersistenceHandler.insertObject(RDBMSPersistenceHandler.java:138)",
                    "org.datanucleus.state.StateManagerImpl.internalMakePersistent(StateManagerImpl.java:3363)",
                    "org.datanucleus.state.StateManagerImpl.makePersistent(StateManagerImpl.java:3339)",
                    "org.datanucleus.ExecutionContextImpl.persistObjectInternal(ExecutionContextImpl.java:2079)",
                    "org.datanucleus.ExecutionContextImpl.persistObjectWork(ExecutionContextImpl.java:1922)",
                    "org.datanucleus.ExecutionContextImpl.persistObject(ExecutionContextImpl.java:1777)",
                    "org.datanucleus.api.jdo.JDOPersistenceManager.jdoMakePersistent(JDOPersistenceManager.java:720)",
                    "org.datanucleus.api.jdo.JDOPersistenceManager.makePersistent(JDOPersistenceManager.java:745)",
                    "org.apache.isis.objectstore.jdo.datanucleus.persistence.commands.DataNucleusCreateObjectCommand.execute(DataNucleusCreateObjectCommand.java:54)",
                    "org.apache.isis.core.runtime.system.persistence.PersistenceSession.executeCommands(PersistenceSession.java:1309)",
                    "org.apache.isis.core.runtime.system.persistence.PersistenceSession.execute(PersistenceSession.java:1303)",
                    "org.apache.isis.core.runtime.system.transaction.IsisTransaction.doFlush(IsisTransaction.java:393)",
                    "org.apache.isis.core.runtime.system.transaction.IsisTransaction.flush(IsisTransaction.java:347)",
                    "org.apache.isis.core.runtime.system.transaction.IsisTransactionManager.flushTransaction(IsisTransactionManager.java:265)",
                    "org.apache.isis.core.runtime.services.persistsession.PersistenceSessionServiceInternalDefault.flush(PersistenceSessionServiceInternalDefault.java:156)",
                    "org.apache.isis.core.metamodel.services.xactn.TransactionServiceDefault.flushTransaction(TransactionServiceDefault.java:39)",
                    "org.apache.isis.core.metamodel.facets.actions.action.invocation.ActionInvocationFacetForDomainEventAbstract.setCommandResultIfEntity(ActionInvocationFacetForDomainEventAbstract.java:461)",
                    "org.apache.isis.core.metamodel.facets.actions.action.invocation.ActionInvocationFacetForDomainEventAbstract.doInvoke(ActionInvocationFacetForDomainEventAbstract.java:334)",
                    "org.apache.isis.core.metamodel.facets.actions.action.invocation.ActionInvocationFacetForDomainEventAbstract${'$'}1.execute(ActionInvocationFacetForDomainEventAbstract.java:164)",
                    "org.apache.isis.core.runtime.system.transaction.IsisTransactionManager.executeWithinTransaction(IsisTransactionManager.java:142)",
                    "org.apache.isis.core.runtime.system.transaction.IsisTransactionManager.executeWithinTransaction(IsisTransactionManager.java:132)",
                    "org.apache.isis.core.runtime.services.persistsession.PersistenceSessionServiceInternalDefault.executeWithinTransaction(PersistenceSessionServiceInternalDefault.java:186)",
                    "org.apache.isis.core.metamodel.facets.actions.action.invocation.ActionInvocationFacetForDomainEventAbstract.invoke(ActionInvocationFacetForDomainEventAbstract.java:160)",
                    "org.apache.isis.core.metamodel.specloader.specimpl.ObjectActionDefault.executeInternal(ObjectActionDefault.java:400)",
                    "org.apache.isis.core.metamodel.specloader.specimpl.ObjectActionDefault.execute(ObjectActionDefault.java:389)",
                    "org.apache.isis.viewer.restfulobjects.server.resources.DomainResourceHelper.invokeActionUsingAdapters(DomainResourceHelper.java:370)",
                    "org.apache.isis.viewer.restfulobjects.server.resources.DomainResourceHelper.invokeAction(DomainResourceHelper.java:351)",
                    "org.apache.isis.viewer.restfulobjects.server.resources.DomainServiceResourceServerside.invokeAction(DomainServiceResourceServerside.java:263)",
                    "sun.reflect.GeneratedMethodAccessor184.invoke(Unknown Source)",
                    "sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)",
                    "java.lang.reflect.Method.invoke(Method.java:498)",
                    "org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:140)",
                    "org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:295)",
                    "org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:249)",
                    "org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:236)",
                    "org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:406)",
                    "org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:213)",
                    "org.jboss.resteasy.plugins.server.servlet.ServletContainerDispatcher.service(ServletContainerDispatcher.java:228)",
                    "org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher.service(HttpServletDispatcher.java:56)",
                    "org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher.service(HttpServletDispatcher.java:51)",
                    "javax.servlet.http.HttpServlet.service(HttpServlet.java:790)",
                    "org.eclipse.jetty.servlet.ServletHolder.handle(ServletHolder.java:821)",
                    "org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1685)",
                    "org.apache.isis.viewer.restfulobjects.server.webapp.IsisTransactionFilterForRestfulObjects.doFilter(IsisTransactionFilterForRestfulObjects.java:50)",
                    "org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1668)",
                    "org.apache.isis.core.webapp.IsisSessionFilter.doFilter(IsisSessionFilter.java:341)",
                    "org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1668)",
                    "org.apache.isis.core.webapp.diagnostics.IsisLogOnExceptionFilter.doFilter(IsisLogOnExceptionFilter.java:52)",
                    "org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1668)",
                    "org.apache.shiro.web.servlet.AbstractShiroFilter.executeChain(AbstractShiroFilter.java:449)",
                    "org.apache.shiro.web.servlet.AbstractShiroFilter${'$'}1.call(AbstractShiroFilter.java:365)",
                    "org.apache.shiro.subject.support.SubjectCallable.doCall(SubjectCallable.java:90)",
                    "org.apache.shiro.subject.support.SubjectCallable.call(SubjectCallable.java:83)",
                    "org.apache.shiro.subject.support.DelegatingSubject.execute(DelegatingSubject.java:383)",
                    "org.apache.shiro.web.servlet.AbstractShiroFilter.doFilterInternal(AbstractShiroFilter.java:362)",
                    "org.apache.shiro.web.servlet.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:125)",
                    "org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1668)",
                    "org.eclipse.jetty.servlets.CrossOriginFilter.handle(CrossOriginFilter.java:308)",
                    "org.eclipse.jetty.servlets.CrossOriginFilter.doFilter(CrossOriginFilter.java:262)",
                    "org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1668)",
                    "org.eclipse.jetty.servlet.ServletHandler.doHandle(ServletHandler.java:581)",
                    "org.eclipse.jetty.server.handler.ScopedHandler.handle(ScopedHandler.java:143)",
                    "org.eclipse.jetty.security.SecurityHandler.handle(SecurityHandler.java:548)",
                    "org.eclipse.jetty.server.session.SessionHandler.doHandle(SessionHandler.java:226)",
                    "org.eclipse.jetty.server.handler.ContextHandler.doHandle(ContextHandler.java:1158)",
                    "org.eclipse.jetty.servlet.ServletHandler.doScope(ServletHandler.java:511)",
                    "org.eclipse.jetty.server.session.SessionHandler.doScope(SessionHandler.java:185)",
                    "org.eclipse.jetty.server.handler.ContextHandler.doScope(ContextHandler.java:1090)",
                    "org.eclipse.jetty.server.handler.ScopedHandler.handle(ScopedHandler.java:141)",
                    "org.eclipse.jetty.server.handler.ContextHandlerCollection.handle(ContextHandlerCollection.java:213)",
                    "org.eclipse.jetty.server.handler.HandlerCollection.handle(HandlerCollection.java:109)",
                    "org.eclipse.jetty.server.handler.HandlerWrapper.handle(HandlerWrapper.java:119)",
                    "org.eclipse.jetty.server.Server.handle(Server.java:517)",
                    "org.eclipse.jetty.server.HttpChannel.handle(HttpChannel.java:306)",
                    "org.eclipse.jetty.server.HttpConnection.onFillable(HttpConnection.java:242)",
                    "org.eclipse.jetty.io.AbstractConnection$ReadCallback.succeeded(AbstractConnection.java:261)",
                    "org.eclipse.jetty.io.FillInterest.fillable(FillInterest.java:95)",
                    "org.eclipse.jetty.io.SelectChannelEndPoint${'$'}2.run(SelectChannelEndPoint.java:75)",
                    "org.eclipse.jetty.util.thread.strategy.ExecuteProduceConsume.produceAndRun(ExecuteProduceConsume.java:213)",
                    "org.eclipse.jetty.util.thread.strategy.ExecuteProduceConsume.run(ExecuteProduceConsume.java:147)",
                    "org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:654)",
                    "org.eclipse.jetty.util.thread.QueuedThreadPool${'$'}3.run(QueuedThreadPool.java:572)",
                    "java.lang.Thread.run(Thread.java:748)"
                ],
                "causedBy": null
            }
        }
    }
}
"""
}
