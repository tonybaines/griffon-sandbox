package griffon.sandbox

class Twitter_stubRatpackApp {
    final Closure routes = {
        get('/search.json') {
            setHeader("Access-Control-Allow-Origin", "*");
            setHeader("Access-Control-Allow-Headers", "X-Requested-With");
            setHeader("Content-Type", "application/json")
            '''{
   "completed_in" : 0.062,
   "max_id" : 221311848941764608,
   "max_id_str" : "221311848941764608",
   "next_page" : "?page=2&max_id=221311848941764608&q=griffon",
   "page" : 1,
   "query" : "griffon",
   "refresh_url" : "?since_id=221311848941764608&q=griffon",
   "results" :
      [
         {
            "created_at" : "Fri, 06 Jul 2012 18:37:11 +0000",
            "from_user" : "bob",
            "from_user_id" : 123456,
            "from_user_id_str" : "1234567",
            "from_user_name" : "bob",
            "geo" : null,
            "id" : 221311848941764608,
            "id_str" : "221311848941764608",
            "iso_language_code" : "en",
            "metadata" :
               {
                  "result_type" : "recent"
               },
            "text" : "Hello World! Plus, I had cornflakes for breakfast",
            "to_user" : null,
            "to_user_id" : 0,
            "to_user_id_str" : "0",
            "to_user_name" : null
         }
      ],
   "results_per_page" : 15,
   "since_id" : 0,
   "since_id_str" : "0"
}
'''
        }
    }
}
