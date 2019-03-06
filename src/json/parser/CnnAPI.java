package json.parser;

public class CnnAPI {
    /*
      You can get API_KEY from this below link. Once you have the API_KEY, you can fetch the top-headlines news.
      https://newsapi.org/s/cnn-api

      Fetch This following CNN API, It will return some news in Json data. Parse this data and construct
      https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=5133d895398a4f0fb198b80c9762d89b

      MY_API_KEY=0d9e35dfa3c140aab8bf9cdd70df957f

      After getting Json Format of the news, You can go to json validator link: https://jsonlint.com/ to see
      how it can be parsed.

      {
	"status": "ok",
	"totalResults": 10,
	"articles": [{
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Analysis by Chris Cillizza, CNN Editor-at-large",
		"title": "Donald Trump is laying the groundwork to de-legitimize the 2020 election",
		"description": "Even as the 2020 race begins in earnest, President Donald Trump is already suggesting that Democrats cannot beat him fairly -- raising the specter that if he loses next November, he will suggest that the election was not legitimate.",
		"url": "http://us.cnn.com/2019/03/06/politics/donald-trump-2020-election-illegitimate/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190306094939-trump-03052019-super-tease.jpg",
		"publishedAt": "2019-03-06T17:05:53Z",
		"content": "THE POINT -- NOW ON YOUTUBE! \r\nIn each episode of his weekly YouTube show, Chris Cillizza will delve a little deeper into the surreal world of politics. Click to subscribe!"
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": null,
		"title": "GM is getting rid of these 6 cars - CNN Video",
		"description": "General Motors will end production of six sedans by the end of 2019. Here are the cars GM is offing.",
		"url": "http://us.cnn.com/videos/business/2018/11/26/gm-is-getting-rid-of-these-6-cars.cnn-business",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/181126144412-04-gm-car-models-112618-super-tease.jpg",
		"publishedAt": "2019-03-06T16:39:18.8109329Z",
		"content": null
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": null,
		"title": "After 52 years, Lordstown must face life after GM  - CNN Video",
		"description": "GM has been a critical part of this Ohio town's economy for decades. Now, as GM makes changes to its business, these workers face an uncertain future.",
		"url": "http://us.cnn.com/videos/business/2019/03/05/gm-lordstown-closing.cnn-business",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190306075830-save-the-gm-plant-lordstown-ophio-super-tease.jpg",
		"publishedAt": "2019-03-06T16:39:17.3265617Z",
		"content": null
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": null,
		"title": "Live updates: Homeland Security Secretary Kirstjen Nielsen testifies on border security - CNNPolitics",
		"description": "DHS Secretary Kirstjen Nielsen appears before the House Homeland Security Committee for a hearing on border security. Follow here for the latest.",
		"url": "http://us.cnn.com/politics/live-news/kirstjen-nielsen-homeland-security-hearing/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/181113072021-01-kirstjen-nielsen-lead-image-super-tease.jpg",
		"publishedAt": "2019-03-06T15:14:49Z",
		"content": "Photo by Chip Somodevilla/Getty Images\r\nAccording to her prepared testimony, Department of Homeland Security Secretary Kirstjen Nielsen will call the situation along the US-Mexico border a national security and humanitarian crisis, and double down on her supp… [+1374 chars]"
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Stephanie Halasz and Lianne Kolirin, CNN",
		"title": "Dead gardener may have taken revenge from beyond the grave",
		"description": "German police suspect a landscape gardener is responsible for killing one man and injuring two other people with booby-traps set before his own death.",
		"url": "http://us.cnn.com/2019/03/06/europe/gardener-booby-traps-scli-grm-intl/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190306112053-02-germany-gardener-booby-traps-0305-super-tease.jpg",
		"publishedAt": "2019-03-06T14:43:32Z",
		"content": null
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Story by Lydia DePillis\nVideo by Jeremy Moorhead\nPhotographs by Maddie McGarvey",
		"title": "As GM's Lordstown plant idles, an iconic American job nears extinction",
		"description": "General Motors' Lordstown, Ohio plant will make its last Chevy Cruze and close its doors on Wednesday. As recently as the early 2000s, a job in an auto plant could be a launchpad to the middle class, but those jobs are increasingly rare.",
		"url": "http://us.cnn.com/2019/03/06/economy/gm-lordstown-workers/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190305212109-05-gm-lordstown---exterior-super-tease.jpg",
		"publishedAt": "2019-03-06T14:10:26Z",
		"content": null
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Julia Horowitz, CNN Business",
		"title": "Production will end at GM's Lordstown, Ohio plant on Wednesday",
		"description": "General Motors is ending production at its Lordstown, Ohio plant Wednesday — two days earlier than previously expected.",
		"url": "http://us.cnn.com/2019/03/04/business/general-motors-lordstown/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/181126175247-04-gm-lordstown-plant-super-tease.jpg",
		"publishedAt": "2019-03-05T16:36:55Z",
		"content": null
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Johnny C. Taylor Jr. for CNN Business Perspectives",
		"title": "Perspectives: US businesses are missing out on a valuable pool of talent: former convicts",
		"description": "For criminal justice reform to succeed, American employers must take the next step: committing to consider qualified jobseekers with criminal records, writes Johnny C. Taylor Jr., president and CEO of the Society for Human Resource Management.",
		"url": "http://us.cnn.com/2019/02/08/perspectives/first-step-act-criminal-backgrounds-business/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/190208135201-20190208-perspectives-hire-former-convicts-gfx-super-tease.jpg",
		"publishedAt": "2019-02-08T20:00:18Z",
		"content": null
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Doug Criss, CNN",
		"title": "Read the heartbreaking letters kids wrote to GM to save their town's auto plant",
		"description": "\"Please, please listen, the rest of my life is in your hands.\"",
		"url": "http://us.cnn.com/2018/12/13/us/lordstown-letters-trnd/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/181213153956-lordstown-letters-story-top-super-tease.jpg",
		"publishedAt": "2018-12-13T22:53:11Z",
		"content": "(CNN)It's Christmastime in Lordstown, but all is not merry. The largest employer in the northeast Ohio town, the sprawling GM plant, will shut down in a couple of months, a victim of General Motor's major restructuring plan. That would be a devastating blow t… [+3486 chars]"
	}, {
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": "Julia Horowitz, CNN Business",
		"title": "Without GM, Lordstown, Ohio, will never be the same",
		"description": "GM workers in Lordstown, once a bustling industrial hub, seem all but certain to become a casualty of General Motors' plan to reinvent itself.",
		"url": "http://us.cnn.com/2018/11/27/business/gm-plants-closing-lordstown-ohio/index.html",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/181127130243-01-gm-plants-closing-1128-super-tease.jpg",
		"publishedAt": "2018-11-27T18:53:21Z",
		"content": null
	}]
}

	   Read the articles array and construct Headline news as source, author, title,description,url,urlToImage,publishedAt
	   and content. You need to design News Data Model and construct headline news.
	   You can store in Map and then into ArrayList as your choice of Data Structure.

	   You can follow How we implemented in Employee and JsonReaderUtil task.

	   Show output of all the headline news in to console.
	   Store into choice of your database and retrieve.

     */
}
