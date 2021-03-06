<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="chrome=1">
    <title>${content.title}</title>

    <link rel="stylesheet" href="/stylesheets/styles.css">
    <link rel="stylesheet" href="/stylesheets/pygment_trac.css">
    <script src="/javascripts/scale.fix.js"></script>
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon">
    <link rel="icon" href="/favicon.ico" type="image/x-icon">
    <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">

    <!--[if lt IE 9]>
    <script src="//html5shiv.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <script>
      (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
      (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
      m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
      })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

      ga('create', 'UA-61755913-1', 'auto');
      ga('send', 'pageview');

    </script>

  </head>
  <body id='${content.slug}'>
    <div id='viewport'>
      <div class='billboard-bg'></div>
      <div class='main'>
        <header>
          <a id='logo' href='/'></a>
          <div id='navigation'>
            <ul>
              <li><a href='/getting-started'>Getting Started</a></li>
              <li><a href='/community'>Community</a></li>
              <li><a href='/contribute'>Contribute</a></li>
              <li><a href='/download'>Download</a></li>
            </ul>
          </div>
        </header>
        <div id='content'>
            ${content.body}
        </div>
      </div>
      <footer id="footer">
        <div class="container">
            <div class="row">
                <div class="col-md-4 col-sm-5">
                    <div class="logo"><a href="#wrapper"><img src="/images/egg-logo1.png"></a></div>
                </div>
                <div class="col-md-4 col-sm-4">
                    <p style="text-align: center">
                        Copyright &copy; <script>var d = new Date();document.write(d.getFullYear());</script> <a href="http://www.apache.org/">The Apache Software Foundation</a>.<br> Apache, Apache Geode (incubating), the Apache feather, Geode logo are trademarks of The Apache Software Foundation.
                    </p>
                </div>
            </div>
        </div>
      </footer>
    </div>
  </body>
</html>
