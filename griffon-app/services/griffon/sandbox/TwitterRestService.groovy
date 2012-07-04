package griffon.sandbox

class TwitterRestService {
    def goGetIt() {
        def results = []
        //http://search.twitter.com/search.json?q=griffon&rpp=5&include_entities=true&with_twitter_user_id=true&result_type=mixed
        withRest(id: "twitter", uri: "http://search.twitter.com/") {
            def response = get(
                    path: 'search.json',
                    query: [q: 'griffon', rpp: '5', include_entities: true,
                               result_type: 'mixed'])
            results = response.data.results
        }
    }
}