# lein-ping

Leiningen plugin that pings websites/urls.

[![Dependencies Status](http://jarkeeper.com/hashobject/lein-ping/status.png)](http://jarkeeper.com/hashobject/lein-ping)

## Usage

To use this for project-level plugins please do next steps.

Put `[lein-ping "0.1.0"]` into the ':plugins' vector of your project.clj.

Add list of URLs that you want to ping
into the ':ping-urls' vector of your project.clj. E.x.

```
  :ping-urls ["http://blog.hashobject.com/"]
```

Then just run

```
  lein ping
```


## Tips

This is great tool for web apps deployed on [Heroku](http://heroku.com).
If you have only one dyno for your app it will fall asleep after
30 minutes of inactivity. See [docs](https://devcenter.heroku.com/articles/usage-and-billing#dyno-sleeping)
for more details on this. To avoid such behaviour you can ping your web app periodically.

To do this you need to use Heroku's [scheduler addon](https://addons.heroku.com/scheduler).
See [docs](https://devcenter.heroku.com/articles/scheduler#scheduling-jobs) for more details.

After installing addon and adding lein-ping plugin to your project.clj you can just
configure 'lein ping' command to run every 10 minutes.



## Contributions

We love contributions. Please submit your pull requests.


## License

Copyright © 2013-2014 Hashobject Ltd (team@hashobject.com).

Distributed under the [Eclipse Public License](http://opensource.org/licenses/eclipse-1.0).
