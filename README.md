<div _ngcontent-ehw-c194="" id="programming-exercise-instructions-content" class="guided-tour instructions__content__markdown markdown-preview"><h3 id="carpark">Car Park</h3>
<p>Goal of this assignment is to simulate a car park.</p>
<p><img alt="*UML*" src="https://syncandshare.lrz.de/dl/fiM5SRgrnDvoMet5aE7QDtcW/carPark.png?inline"></p>
<ul>
<li><div class="pe-task-36 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-ehw-c192="" class="ng-star-inserted"><div _ngcontent-ehw-c192="" class="guided-tour">
    <!---->
    <!---->
    <fa-icon _ngcontent-ehw-c192="" size="lg" class="ng-fa-icon test-icon text-secondary ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="circle-question" class="svg-inline--fa fa-circle-question fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M256 512c141.4 0 256-114.6 256-256S397.4 0 256 0S0 114.6 0 256S114.6 512 256 512zM169.8 165.3c7.9-22.3 29.1-37.3 52.8-37.3h58.3c34.9 0 63.1 28.3 63.1 63.1c0 22.6-12.1 43.5-31.7 54.8L280 264.4c-.2 13-10.9 23.6-24 23.6c-13.3 0-24-10.7-24-24V250.5c0-8.6 4.6-16.5 12.1-20.8l44.3-25.4c4.7-2.7 7.6-7.7 7.6-13.1c0-8.4-6.8-15.1-15.1-15.1H222.6c-3.4 0-6.4 2.1-7.5 5.3l-.4 1.2c-4.4 12.5-18.2 19-30.6 14.6s-19-18.2-14.6-30.6l.4-1.2zM288 352c0 17.7-14.3 32-32 32s-32-14.3-32-32s14.3-32 32-32s32 14.3 32 32z"></path></svg></fa-icon><!---->
    <span _ngcontent-ehw-c192="" class="task-name ng-star-inserted">LicensePlate</span><!---->
    <span _ngcontent-ehw-c192="" class="guided-tour test-status--linked text-secondary ng-star-inserted">1 of 2 tests passing</span><!---->
    
    <!---->
</div>
</jhi-programming-exercise-instructions-task-status></div>Realize a class <code>LicensePlate</code> with the attributes <code>String regionalCode</code>, <code>String letters</code> and <code>int digits</code>
together with a constructor.</li>
<li><div class="pe-task-37 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-ehw-c192="" class="ng-star-inserted"><div _ngcontent-ehw-c192="" class="guided-tour success">
    <fa-icon _ngcontent-ehw-c192="" size="lg" class="ng-fa-icon test-icon text-success ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="far" data-icon="circle-check" class="svg-inline--fa fa-circle-check fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M243.8 339.8C232.9 350.7 215.1 350.7 204.2 339.8L140.2 275.8C129.3 264.9 129.3 247.1 140.2 236.2C151.1 225.3 168.9 225.3 179.8 236.2L224 280.4L332.2 172.2C343.1 161.3 360.9 161.3 371.8 172.2C382.7 183.1 382.7 200.9 371.8 211.8L243.8 339.8zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48z"></path></svg></fa-icon><!---->
    <!---->
    <!---->
    <span _ngcontent-ehw-c192="" class="task-name ng-star-inserted">Car</span><!---->
    <span _ngcontent-ehw-c192="" class="guided-tour test-status--linked text-success ng-star-inserted">2 of 2 tests passing</span><!---->
    
    <!---->
</div>
</jhi-programming-exercise-instructions-task-status></div>Realize a class <code>Car</code> with the attributes <code>String brand</code> and <code>LicensePlate licensePlate</code> together with a meaningful constructor.</li>
<li><div class="pe-task-38 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-ehw-c192="" class="ng-star-inserted"><div _ngcontent-ehw-c192="" class="guided-tour">
    <!---->
    <!---->
    <fa-icon _ngcontent-ehw-c192="" size="lg" class="ng-fa-icon test-icon text-secondary ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="circle-question" class="svg-inline--fa fa-circle-question fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M256 512c141.4 0 256-114.6 256-256S397.4 0 256 0S0 114.6 0 256S114.6 512 256 512zM169.8 165.3c7.9-22.3 29.1-37.3 52.8-37.3h58.3c34.9 0 63.1 28.3 63.1 63.1c0 22.6-12.1 43.5-31.7 54.8L280 264.4c-.2 13-10.9 23.6-24 23.6c-13.3 0-24-10.7-24-24V250.5c0-8.6 4.6-16.5 12.1-20.8l44.3-25.4c4.7-2.7 7.6-7.7 7.6-13.1c0-8.4-6.8-15.1-15.1-15.1H222.6c-3.4 0-6.4 2.1-7.5 5.3l-.4 1.2c-4.4 12.5-18.2 19-30.6 14.6s-19-18.2-14.6-30.6l.4-1.2zM288 352c0 17.7-14.3 32-32 32s-32-14.3-32-32s14.3-32 32-32s32 14.3 32 32z"></path></svg></fa-icon><!---->
    <span _ngcontent-ehw-c192="" class="task-name ng-star-inserted">chassisNumber</span><!---->
    <span _ngcontent-ehw-c192="" class="guided-tour test-status--linked text-secondary ng-star-inserted">0 of 1 tests passing</span><!---->
    
    <!---->
</div>
</jhi-programming-exercise-instructions-task-status></div>Exten the class
<code>Car</code> with an attribute <code>int chassisNumber</code>. This number is going to increased by 1 for each newly
built <code>Car</code>-object. <em>Hint: This works analogously to the class <code>Count</code> of the lecture.</em></li>
<li><div class="pe-task-39 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-ehw-c192="" class="ng-star-inserted"><div _ngcontent-ehw-c192="" class="guided-tour success">
    <fa-icon _ngcontent-ehw-c192="" size="lg" class="ng-fa-icon test-icon text-success ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="far" data-icon="circle-check" class="svg-inline--fa fa-circle-check fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M243.8 339.8C232.9 350.7 215.1 350.7 204.2 339.8L140.2 275.8C129.3 264.9 129.3 247.1 140.2 236.2C151.1 225.3 168.9 225.3 179.8 236.2L224 280.4L332.2 172.2C343.1 161.3 360.9 161.3 371.8 172.2C382.7 183.1 382.7 200.9 371.8 211.8L243.8 339.8zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48z"></path></svg></fa-icon><!---->
    <!---->
    <!---->
    <span _ngcontent-ehw-c192="" class="task-name ng-star-inserted">CarPark</span><!---->
    <span _ngcontent-ehw-c192="" class="guided-tour test-status--linked text-success ng-star-inserted">2 of 2 tests passing</span><!---->
    
    <!---->
</div>
</jhi-programming-exercise-instructions-task-status></div>Realize a class <code>CarPark</code> which represents a car park with <span><span class="katex"><span class="katex-mathml"><math><mrow><mi>n</mi></mrow>n</math></span><span aria-hidden="true" class="katex-html"><span class="base"><span style="height: 0.43056em; vertical-align: 0em;" class="strut"></span><span class="mord mathdefault">n</span></span></span></span></span> places to deposit cars (<code>spaces</code>).
This size <span><span class="katex"><span class="katex-mathml"><math><mrow><mi>n</mi></mrow>n</math></span><span aria-hidden="true" class="katex-html"><span class="base"><span style="height: 0.43056em; vertical-align: 0em;" class="strut"></span><span class="mord mathdefault">n</span></span></span></span></span> of the car park is meant to be provided to the constructor.</li>
<li><div class="pe-task-40 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-ehw-c192="" class="ng-star-inserted"><div _ngcontent-ehw-c192="" class="guided-tour">
    <!---->
    <!---->
    <fa-icon _ngcontent-ehw-c192="" size="lg" class="ng-fa-icon test-icon text-secondary ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="circle-question" class="svg-inline--fa fa-circle-question fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M256 512c141.4 0 256-114.6 256-256S397.4 0 256 0S0 114.6 0 256S114.6 512 256 512zM169.8 165.3c7.9-22.3 29.1-37.3 52.8-37.3h58.3c34.9 0 63.1 28.3 63.1 63.1c0 22.6-12.1 43.5-31.7 54.8L280 264.4c-.2 13-10.9 23.6-24 23.6c-13.3 0-24-10.7-24-24V250.5c0-8.6 4.6-16.5 12.1-20.8l44.3-25.4c4.7-2.7 7.6-7.7 7.6-13.1c0-8.4-6.8-15.1-15.1-15.1H222.6c-3.4 0-6.4 2.1-7.5 5.3l-.4 1.2c-4.4 12.5-18.2 19-30.6 14.6s-19-18.2-14.6-30.6l.4-1.2zM288 352c0 17.7-14.3 32-32 32s-32-14.3-32-32s14.3-32 32-32s32 14.3 32 32z"></path></svg></fa-icon><!---->
    <span _ngcontent-ehw-c192="" class="task-name ng-star-inserted">park</span><!---->
    <span _ngcontent-ehw-c192="" class="guided-tour test-status--linked text-secondary ng-star-inserted">0 of 3 tests passing</span><!---->
    
    <!---->
</div>
</jhi-programming-exercise-instructions-task-status></div>Add to the class <code>CarPark</code> a method <code>int park(Car c)</code> by which a car <em>c</em> receives the first empty space of the
car park. The method should additionall return the number of the occupied space.
When the car park is full, the value <em>-1</em> should be returned.</li>
<li><div class="pe-task-41 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-ehw-c192="" class="ng-star-inserted"><div _ngcontent-ehw-c192="" class="guided-tour">
    <!---->
    <!---->
    <fa-icon _ngcontent-ehw-c192="" size="lg" class="ng-fa-icon test-icon text-secondary ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="circle-question" class="svg-inline--fa fa-circle-question fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M256 512c141.4 0 256-114.6 256-256S397.4 0 256 0S0 114.6 0 256S114.6 512 256 512zM169.8 165.3c7.9-22.3 29.1-37.3 52.8-37.3h58.3c34.9 0 63.1 28.3 63.1 63.1c0 22.6-12.1 43.5-31.7 54.8L280 264.4c-.2 13-10.9 23.6-24 23.6c-13.3 0-24-10.7-24-24V250.5c0-8.6 4.6-16.5 12.1-20.8l44.3-25.4c4.7-2.7 7.6-7.7 7.6-13.1c0-8.4-6.8-15.1-15.1-15.1H222.6c-3.4 0-6.4 2.1-7.5 5.3l-.4 1.2c-4.4 12.5-18.2 19-30.6 14.6s-19-18.2-14.6-30.6l.4-1.2zM288 352c0 17.7-14.3 32-32 32s-32-14.3-32-32s14.3-32 32-32s32 14.3 32 32z"></path></svg></fa-icon><!---->
    <span _ngcontent-ehw-c192="" class="task-name ng-star-inserted">isEqual</span><!---->
    <span _ngcontent-ehw-c192="" class="guided-tour test-status--linked text-secondary ng-star-inserted">0 of 4 tests passing</span><!---->
    
    <!---->
</div>
</jhi-programming-exercise-instructions-task-status></div>Extend the class <code>LicensePlate</code> by a method <code>boolean isEqual(LicensePlate other)</code> which returns <code>true</code> if and only if
when <em>other</em> and <em>this</em> describe the same licence plate.</li>
<li><div class="pe-task-42 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-ehw-c192="" class="ng-star-inserted"><div _ngcontent-ehw-c192="" class="guided-tour">
    <!---->
    <!---->
    <fa-icon _ngcontent-ehw-c192="" size="lg" class="ng-fa-icon test-icon text-secondary ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="circle-question" class="svg-inline--fa fa-circle-question fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M256 512c141.4 0 256-114.6 256-256S397.4 0 256 0S0 114.6 0 256S114.6 512 256 512zM169.8 165.3c7.9-22.3 29.1-37.3 52.8-37.3h58.3c34.9 0 63.1 28.3 63.1 63.1c0 22.6-12.1 43.5-31.7 54.8L280 264.4c-.2 13-10.9 23.6-24 23.6c-13.3 0-24-10.7-24-24V250.5c0-8.6 4.6-16.5 12.1-20.8l44.3-25.4c4.7-2.7 7.6-7.7 7.6-13.1c0-8.4-6.8-15.1-15.1-15.1H222.6c-3.4 0-6.4 2.1-7.5 5.3l-.4 1.2c-4.4 12.5-18.2 19-30.6 14.6s-19-18.2-14.6-30.6l.4-1.2zM288 352c0 17.7-14.3 32-32 32s-32-14.3-32-32s14.3-32 32-32s32 14.3 32 32z"></path></svg></fa-icon><!---->
    <span _ngcontent-ehw-c192="" class="task-name ng-star-inserted">search</span><!---->
    <span _ngcontent-ehw-c192="" class="guided-tour test-status--linked text-secondary ng-star-inserted">0 of 1 tests passing</span><!---->
    
    <!---->
</div>
</jhi-programming-exercise-instructions-task-status></div>Extend the class <code>CarPark</code> with a method <code>int search(LicensePlate lp)</code> which searches for a car by means of a
license plate.
If the car with license plate <em>lp</em> is residing inside the car park,
the method should return the number of the occupied space, otherwise
<em>-1</em>.</li>
<li><div class="pe-task-43 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-ehw-c192="" class="ng-star-inserted"><div _ngcontent-ehw-c192="" class="guided-tour">
    <!---->
    <!---->
    <fa-icon _ngcontent-ehw-c192="" size="lg" class="ng-fa-icon test-icon text-secondary ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="circle-question" class="svg-inline--fa fa-circle-question fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M256 512c141.4 0 256-114.6 256-256S397.4 0 256 0S0 114.6 0 256S114.6 512 256 512zM169.8 165.3c7.9-22.3 29.1-37.3 52.8-37.3h58.3c34.9 0 63.1 28.3 63.1 63.1c0 22.6-12.1 43.5-31.7 54.8L280 264.4c-.2 13-10.9 23.6-24 23.6c-13.3 0-24-10.7-24-24V250.5c0-8.6 4.6-16.5 12.1-20.8l44.3-25.4c4.7-2.7 7.6-7.7 7.6-13.1c0-8.4-6.8-15.1-15.1-15.1H222.6c-3.4 0-6.4 2.1-7.5 5.3l-.4 1.2c-4.4 12.5-18.2 19-30.6 14.6s-19-18.2-14.6-30.6l.4-1.2zM288 352c0 17.7-14.3 32-32 32s-32-14.3-32-32s14.3-32 32-32s32 14.3 32 32z"></path></svg></fa-icon><!---->
    <span _ngcontent-ehw-c192="" class="task-name ng-star-inserted">driveOff</span><!---->
    <span _ngcontent-ehw-c192="" class="guided-tour test-status--linked text-secondary ng-star-inserted">0 of 1 tests passing</span><!---->
    
    <!---->
</div>
</jhi-programming-exercise-instructions-task-status></div>Extend the class <code>CarPark</code> with a method <code>Car driveOff(LicensePlate lp)</code> which empties the space
occupied by the car with license plate <em>lp</em> and returns the corresponding car.
If a car with the given license plate <em>lp</em> cannot be found in the car park, the value <em>null</em>
should be returned.</li>
<li><div class="pe-task-44 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-ehw-c192="" class="ng-star-inserted"><div _ngcontent-ehw-c192="" class="guided-tour">
    <!---->
    <!---->
    <fa-icon _ngcontent-ehw-c192="" size="lg" class="ng-fa-icon test-icon text-secondary ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="fas" data-icon="circle-question" class="svg-inline--fa fa-circle-question fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M256 512c141.4 0 256-114.6 256-256S397.4 0 256 0S0 114.6 0 256S114.6 512 256 512zM169.8 165.3c7.9-22.3 29.1-37.3 52.8-37.3h58.3c34.9 0 63.1 28.3 63.1 63.1c0 22.6-12.1 43.5-31.7 54.8L280 264.4c-.2 13-10.9 23.6-24 23.6c-13.3 0-24-10.7-24-24V250.5c0-8.6 4.6-16.5 12.1-20.8l44.3-25.4c4.7-2.7 7.6-7.7 7.6-13.1c0-8.4-6.8-15.1-15.1-15.1H222.6c-3.4 0-6.4 2.1-7.5 5.3l-.4 1.2c-4.4 12.5-18.2 19-30.6 14.6s-19-18.2-14.6-30.6l.4-1.2zM288 352c0 17.7-14.3 32-32 32s-32-14.3-32-32s14.3-32 32-32s32 14.3 32 32z"></path></svg></fa-icon><!---->
    <span _ngcontent-ehw-c192="" class="task-name ng-star-inserted">toString</span><!---->
    <span _ngcontent-ehw-c192="" class="guided-tour test-status--linked text-secondary ng-star-inserted">0 of 3 tests passing</span><!---->
    
    <!---->
</div>
</jhi-programming-exercise-instructions-task-status></div>Add to all classes a method
<code>public String toString()</code> which returns a String representation of the respective objects.
The output format is as follows:<ul>
<li>LicensePlate: <code>&lt;regionalCode&gt;:&lt;letters&gt; &lt;digits&gt;</code></li>
<li>Car: <code>Car &lt;chassisNumber&gt;: (Brand: &lt;brand&gt;, License Plate: &lt;licensePlate&gt;)</code></li>
<li>CarPark: <code>Car Park:\n</code> followed by <code>&lt;index&gt;: [&lt;car&gt;]\n</code> or <code>&lt;index&gt;: []\n</code> for every space</li></ul></li>
</ul></div>
