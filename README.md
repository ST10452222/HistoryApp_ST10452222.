**PURPOSE:**

The purpose of the app honours the lives of prominent figures who have
made significant impacts in the world we live in today. The app will
serve as an invaluable educational tool for students providing a vast
archive of historical personalities from a variety of disciplines and
historical periods. Furthermore, the appâ€™s feature to compare the ages
of the deceased personalities offers a unique perspective allowing
students to identify trends, similarities and distinctions across
different time periods. Students that use the software enhance their
historical knowledge and sharpen their critical thinking abilities. To
sum up, the app will be a priceless tool for both teachers and students,
fostering a deeper understanding of the intricate web of human
achievement and the enduring legacies of those who have influenced our
world.

**DESIGN CONSIDERATIONS:**

<img src="media/image1.png" style="width:3.30868in;height:5.84896in" />

**INTUITIVE DESIGN:**

The â€œHistory Appâ€ has an intuitive design; an easy to use interface that
has been carefully crafted to enhance user experience and facilitate
smooth exploration of its extensive information. The appâ€™s user friendly
interface ensures accessibility and ease of navigation for all ages and
levels of expertise. The intuitive features such as the â€œCompareâ€ and
â€œClearâ€ functions are evenly spaced out and enable users to effortlessly
discover and explore the lives of notable people who have left a lasting
impact on human history.

**CONTENT PRIORITISATION:**

Content prioritisation lies at the core of the appâ€™s design structure,
meticulously crafted to deliver a streamlined and user friendly
experience.Only the most crucial UI components are incorporated into the
app through careful curation, guaranteeing clarity and concentration
throughout the user experience. Users are provided with a consistent and
user-friendly design that reduces distractions and increases engagement
by giving priority to material and functionalities that are vital. Every
component has a specific function that makes it easier to navigate and
have quick access to the extensive historical information stored in the
app. With no complication, users may easily lose themselves in the
compelling stories of the people who have passed away and influenced the
path of human history. Consequently, prioritising content improves
usability but also elevates the appâ€™s effectiveness as an educational
resource, empowering learners to explore, discover and appreciate the
legacies of the past.

**LEGIBLE TEXT CONTENT:**

A key component of the appâ€™s design is its readable text content, which
makes it easy for the user to interact with its abundance of
information. To prioritise readability I have opted for a font size that
is comfortably large, ensuring that text remains clear and easily
distinguishable even on smaller screens. This deliberate choice ensures
that users of all ages and visual abilities can access the content
without eye strain or experiencing difficulty in comprehension.

**MAKE INTERFACE ELEMENTS CLEARLY VISIBLE:**

The app's UI was designed with the utmost attention to make sure that
every aspect was easily accessible and understood by the user. Every
element is judiciously positioned to achieve a harmony between visual
appeal and readability, preventing both excessive white space and
overcrowding.The primary purpose of this is to allow users to navigate
the app with ease, clearly visualising and interacting with each element
without any confusion, optimising user engagement providing a seamless
interface.

**HAND AND POSITION CONTROLS:**

In order to maximise user involvement, the app uses hand position
controls, which place buttons and controls in strategic locations for
easy accessibility. The application facilitates seamless navigation and
a seamless user experience by positioning buttons within the user's hand
reach. Users may interact with the app's features without effort or
discomfort because of this careful design consideration, which improves
usability and engagement. Users may readily grasp and interact with
controls, optimising efficiency and enjoyment.

**IMAGES:**

The head text is visually appealing, as is the photo of Nelson Mandela,
a politician, statesman, and anti-apartheid campaigner from South
Africa. Mandela was the first black head of state to be elected in a
completely representative democratic election.. With the appâ€™s intuitive
design, it transcends the traditional confines of learning that fosters
dynamic educational experience that inspires curiosity; hence the image
being at the centre of the interface.

**Version Control with GitHub**

1\. Create a New GitHub Repository:

Go to the GitHub website (https://github.com/) and sign in to your
account.

Click on the "+" icon in the top right corner and select "New
repository".

Repository name (ST10452222MondeMkhize), add a description (IMAD5112
Assignment 1) and choose public.

Click on the "Create repository" button.

2\. Initialise the Repository with a README File:

After creating the repository, you'll see an option to "Initialize this
repository with a README". Check this option to create a README file.

Click on the "Create repository" button to finalize the creation of the
repository.

3\. Commit and Push Your Project Files to the GitHub Repository:

In Android Studio, go to VCS (Version Control System) -> Import into
Version Control -> Share Project on GitHub.

Log in to your GitHub account if prompted, and select the repository you
created earlier.

Click on the "Share" button to push your project files to the GitHub
repository.

4\. Regularly Commit and Push Your Code as You Make Progress:

After the initial push, continue making changes to your project in
Android Studio.

Whenever you make significant progress or changes, commit your changes
locally in Android Studio using VCS -> Commit Changes.

Once committed, push your changes to the GitHub repository using VCS ->
Git -> Push.

Testing and Automated Testing:

1\. Conduct Manual Testing:

Manually test your app to ensure it functions seamlessly and offers an
enjoyable educational experience for learners.

To test various features and user interactions do the following:

> 1\. Create a New Test Class:
>
> In your Android project, navigate to the tests directory (or create it
> if it doesn't exist).
>
> Create a new Kotlin file for your test class. Name it appropriately to
> indicate what component or functionality you are testing.
>
> 2\. Write Test Methods:
>
> Inside the test class, write test methods like the example below.
>
> 3\. Use assertions to verify the expected behaviour of your code.
>
> 4\. Run the Tests:
>
> Run the tests using the testing framework's tools provided by Android
> Studio or through the command line.

Sample of a test class using JUnit:

import org.junit.Assert.\*

import org.junit.Test

class MyUnitTest {

@Test

fun testWhenStatement() {

// Test case for a when statement

val result = when (25) {

1 -> "Kobe Bryant, Was an American professional basketball player. A
shooting guard, he spent his entire 20-year career with the Los Angeles
Lakers in the National Basketball Association, died at 41."

74 -> "Muhammad Ali, Was an American professional boxer and activist.
Nicknamed the Greatest, he is regarded as one of the most significant
sports figures of the 20th century and is often regarded as the greatest
heavyweight boxer of all time, died at 74."

39 -> "Martin Luther King Jr., Was an American Christian minister,
activist, and political philosopher who was one of the most prominent
leaders in the civil rights movement from 1955 until his assassination
in 1968, died at 39."

else -> "Nobody famous known to me died at this age"

}

assertEquals("Nobody famous known to me died at this age", result)

}

}

2\. GitHub Actions for Automated Testing:

Set up GitHub Actions to automatically run tests and build your code
whenever changes are pushed to the repository.

Create a GitHub Actions workflow (.github/workflows/tests.yml) to run
tests automatically on every push:

Create a .github/workflows directory in your project repository.

Inside this directory, create YAML files defining your GitHub Actions
workflows for testing and building.

Sample GitHub Actions Workflow for Testing (tests.yml):

name: Run Tests

on: \[push\]

jobs:

test:

runs-on: ubuntu-latest

steps:

\- name: Set up JDK

uses: actions/setup-java@v2

with:

distribution: 'adopt'

java-version: '11'

\- name: Check out code

uses: actions/checkout@v2

\- name: Build and test

run: ./gradlew test

Set Up Automated Build:

Create a GitHub Actions workflow (.github/workflows/build.yml) to build
the APK automatically on every push.

Sample GitHub Actions Workflow for Building (build.yml):

name: Build APK

on: \[push\]

jobs:

build:

runs-on: ubuntu-latest

steps:

\- name: Set up JDK

uses: actions/setup-java@v2

with:

distribution: 'adopt'

java-version: '11'

\- name: Check out code

uses: actions/checkout@v2

\- name: Build APK

run: ./gradlew assembleDebug

Test your workflows by pushing changes to your repository and observing
the actions running in the "Actions" tab on GitHub.

**Link to YouTube Video**:

[<u>https://youtu.be/qyswSXL9SQY</u>](https://youtu.be/qyswSXL9SQY)

**CODE EXPLAINED:**

The code is an Android application written in Kotlin. The code defines a
package â€œza.ac.iie.st10452222.lu2appâ€ and imports necessary classes from
the Android framework. It defines a class â€œMainActivityâ€ which extends
â€œAppCompatActivityâ€. This class represents the main activity of the
Android application. In the â€œonCreateâ€ method, the layout of the
activity is set using â€œsetContentView (R.layout.activity_main). Various
UI elements are initialised using â€œfindViewById" such as
buttons(compareButton and clearButton), an â€œEditTextâ€ for entering age
(ageEditText) and a â€œTextViewâ€ for displaying results.
â€œsetOnClickListenerâ€ is used to assign behaviour to the â€œcompareButtonâ€
and â€œclearButtonâ€. When the â€œcompareButtonâ€ is clicked, the code
retrieves the text entered in â€œageEditTextâ€, logs it, and checks if itâ€™s
empty or not a valid integer. If the entered age is not valid,
appropriate error messages are displayed in â€œresultTextViewâ€. If the age
is valid, it checks if it falls within a specific range and then uses a
â€œwhen" expression to check for certain ages and displays corresponding
information about notable figures who died at that age. If the age does
not match any of the predefined cases, a generic message is displayed.
When the â€œclearButtonâ€ is clicked , the text in â€œageEditText" is cleared
and â€œresultTextViewâ€ is emptied. This is the general overview of what
this code does. It is an Android app that takes an age input, compares
it against predefined ages and displays information about notable
figures who died at that age.

**REFERENCE LIST:**

Wikipedia contributors. (2024). "Kobe Bryant." Wikipedia, The Free
Encyclopedia. Retrieved from:
<https://en.wikipedia.org/wiki/Kobe_Bryant> \[Accessed 8 April 2024\].

Wikipedia contributors. (2024). "Muhammad Ali." Wikipedia, The Free
Encyclopedia. Retrieved from:
<https://en.wikipedia.org/wiki/Muhammad_Ali> \[Accessed 8 April 2024\].

Wikipedia contributors. (2024). "Martin Luther King Jr." Wikipedia, The
Free Encyclopedia. Retrieved from:
<https://en.wikipedia.org/wiki/Martin_Luther_King_Jr>. \[Accessed 8
April 2024\].

Wikipedia contributors. (2024). "Nelson Mandela." Wikipedia, The Free
Encyclopedia. Retrieved from:
<https://en.wikipedia.org/wiki/Nelson_Mandela> \[Accessed 8 April
2024\].

Wikipedia contributors. (2024). "Elizabeth II." Wikipedia, The Free
Encyclopedia. Retrieved from:
<https://en.wikipedia.org/wiki/Elizabeth_II> \[Accessed 8 April 2024\].

Wikipedia contributors. (2024). "Adolf Hitler." Wikipedia, The Free
Encyclopedia. Retrieved from:
<https://en.wikipedia.org/wiki/Adolf_Hitler> \[Accessed 8 April 2024\].

Wikipedia contributors. (2024). "Tupac Shakur." Wikipedia, The Free
Encyclopedia. Retrieved from:
<https://en.wikipedia.org/wiki/Tupac_Shakur> \[Accessed 8 April 2024\].

Wikipedia contributors. (2024). "Shaka." Wikipedia, The Free
Encyclopedia. Retrieved from: <https://en.wikipedia.org/wiki/Shaka>
\[Accessed 8 April 2024\].

Wikipedia contributors. (2024). "Goodwill Zwelithini." Wikipedia, The
Free Encyclopedia. Retrieved from:
<https://en.wikipedia.org/wiki/Goodwill_Zwelithini> \[Accessed 8 April
2024\].

Wikipedia contributors. (2024). "Mansa Musa." Wikipedia, The Free
Encyclopedia. Retrieved from: <https://en.wikipedia.org/wiki/Mansa_Musa>
\[Accessed 8 April 2024\].

OpenAI. (2024) Retrieved from
<https://chat.openai.com/c/4c8dfafb-2c06-4f30-8105-7a4a4f1fd4f4>


