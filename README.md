# Flixster

Flixster is an app that allows the user to get information about movies including the title, poster image, and a synopsis.

Submitted by: Mo Bakhiet

Time spent: 12 hours spent in total

## User Stories

The following **required** functionality is completed:

* [x] User can view a list of movies (title, poster image, and overview) currently playing in theaters from the Movie
Database API

The following **optional** features are implemented:

* [x] Displays a nice default placeholder graphic for each image during loading (read more about Picasso) (1 point)
* [x] Views should be responsive for both landscape/portrait mode and fully optimized for performance with the ViewHolder pattern. (2 points)
* [x] Improve the user interface through styling and coloring (1 to 5 points depending on the difficulty of UI improvements) (I played with the margins to make it look better)
* [ ] Expose details of movie (ratings using RatingBar, popularity, and synopsis) in a separate activity. (3 points)
* [ ] Stretch: For popular movies (i.e. a movie voted for more than 5 stars), the full backdrop image of the movie is displayed. Otherwise, a poster image, the movie title, and overview is listed. Use Heterogenous ListViews and use different ViewHolder layout files for popular movies and less popular ones. (2 points)
* [x] Stretch: Add a rounded corners for the images using the Picasso transformations. (1 point)
* [ ] Stretch: Apply the popular ButterKnife annotation library to reduce view boilerplate. (2 points)
The following **additional** features are implemented:
* [ ] Stretch: Allow video posts to be played in full-screen using the YouTubePlayerView (3 points)

* [ ] List anything else that you can get done to improve the app functionality!

## Video Walkthrough 

Here's a walkthrough of implemented user stories:

gif: http://imgur.com/Q87hfKB

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Notes

I had difficulty rotating the views and using ViewHolder. I worked exposing details but did not finish. Overall I had quite a bit of difficulty understanding on how the various classes and xml files interacted with the adapter class but I think I'm beginning to understand better. I've also had difficulty with git (I'm now realizing that I overwrote the todo app rather than making a new repository and that I wasn't able to get the gif working properly within github. Here's the link: http://imgur.com/Q87hfK. I think next week I need to do a better job asking for help and doing more reading/internalizing prior to attempting to tackle the challenges.

## License

    Copyright 2016 Mohammad Bakhiet

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
