application {
    title = 'GriffonSandbox'
    startupGroups = ['twitterSearch']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "griffon-sandbox"
    'twitterSearch' {
        model      = 'griffon.sandbox.TwitterSearchModel'
        view       = 'griffon.sandbox.TwitterSearchView'
        controller = 'griffon.sandbox.TwitterSearchController'
    }

}
