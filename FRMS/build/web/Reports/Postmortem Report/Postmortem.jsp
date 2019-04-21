<%-- 
    Document   : Postmortem
    Created on : Sep 25, 2018, 4:40:36 PM
    Author     : TOSHIBA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Post-Mortem Report</title>

        <!--    <link href="./styles/mainstyle.css" rel="stylesheet" type="text/css" >
            <link href="./styles/style.css" rel="stylesheet" type="text/css" >
            <link rel="stylesheet" type="text/css" href="styles/style1.css">
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
            <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>-->

        <style>
            * {
                box-sizing: border-box;
            }

            body {
                background-image:url(   ./admin/Images/backgroundImage.jpg);
            }

            #regForm {
                background-color: #ffffff;
                margin: 100px auto;
                font-family: Raleway;
                padding: 40px;
                width: 70%;
                min-width: 300px;
            }

            h1 {
                text-align: center;  
            }

            input {
                padding: 10px;
                width: 100%;
                font-size: 17px;
                font-family: Raleway;
                border: 1px solid #aaaaaa;
            }

            /* Mark input boxes that gets an error on validation: */
            input.invalid {
                background-color: #ffdddd;
            }

            /*Hide all steps by default:*/ 
            .tab {
                display: none;
            }

            button {
                background-color: #1a6d6c;
                color: #434244;
                border: none;
                padding: 10px 20px;
                font-size: 17px;
                font-family: Raleway;
                cursor: pointer;
            }

            button:hover {
                opacity: 0.8;
            }

            #prevBtn {
                background-color: #3cd1cf;
            }

            /* Make circles that indicate the steps of the form: */
            .step {
                height: 15px;
                width: 15px;
                margin: 0 2px;
                background-color: #e2467d;
                border: none;  
                border-radius: 50%;
                display: inline-block;
                opacity: 0.5;
            }

            .step.active {
                opacity: 1;
            }

            /* Mark the steps that are finished and valid: */
            .step.finish {
                background-color: #f26d9b;
            }
        </style>
        <script>
            function startTime() {
                var today = new Date();
                var h = today.getHours();
                var m = today.getMinutes();
                var s = today.getSeconds();
                m = checkTime(m);
                s = checkTime(s);
                document.getElementById('clockText').innerHTML =
                        h + ":" + m + ":" + s;
                var t = setTimeout(startTime, 500);
            }
            function checkTime(i) {
                if (i < 10) {
                    i = "0" + i
                }
                ;  // add zero in front of numbers < 10
                return i;
            }
        </script>
    </head>




    <body onload="startTime()">

        <div class="header">
            <img src="../admin/Images/FRMS.png" style="height:100px;width:250px;"> 
            <font color="white" size="5px">

            <div type="text" disabled="" class="warnButton1"  style="float: right;" id="clockText" ></div>
            <a href=""><button class="warnButton"  style="float: right;">Logout</button></a>

            <button class="activeButton" onclick="document.getElementById('idForm').style.display = 'block'" style="float: right;">Login</button>

            <a href=""><button class="warnButton"  style="float: right;background-color:#9db4b7;">Admin Home</button></a>
            <a href=""><button class="warnButton"  style="float: right;background-color:#c60084;">FRMS Home</button></a>
            </font>
        </div><hr>
        <br><br>

        <form id="regForm" action="/FRMS/PM_Report" method="POST">
            <h1>POST-MORTEM REPORT</h1>
            <!-- One "tab" for each step in the form: -->
            <div class="tab">
                <b>SR No:</b>
                <p><input type="text" placeholder="SR No..."  name="Num"></p>

                <b>Police:</b>
                <p><input type="text" placeholder="Police Station Name..."  name="police"></p>

                <b>Investigating Officer:</b>
                <p><input type="text" placeholder="Officer Name..."  name="officer"></p>
                
                <input type="submit" name="btnString" value="butt"> Button 
            </div>
            <div class="tab">

                <b>INQUEST No.:</b>
                <p><input type="text" placeholder="INQUEST No."  name="inquest"></p>

                <b>Place:</b>
                <p><input type="text" placeholder="Place"  name="place1"></p>

                <b>Court:</b>
                <p><input type="text" placeholder="Court Name"  name="court"></p>

                <b> Date:</b>
                <p><input type="date" placeholder=""  name="date_1"></p>

                <b> CASE No.:</b>
                <p><input type="text" placeholder="Case No."  name="case"></p>

                <b> Name of Deceased Person:</b>
                <p><input type="text" placeholder="Full Name"  name="name1"></p>

                <b>Date and Time of Death (if known):</b>
                <p><input type="text" placeholder="Date & Time"  name="time1"></p>

                <b>Name of Medical Officer who conducted the Post-Mortem Examination:</b>
                <p><input type="text" placeholder="Doctor Name"  name="d_name"></p>

                <b>  Date and Time of Post-Mortem Examination:</b>
                <p><input type="text" placeholder="Date & Time"  name="time2"></p>

                <b> Name and designation of the person who requested the Post-Mortem Examination:</b>
                <p><input type="text" placeholder="Name"  name="name2"></p>

                <b> District:</b>
                <p><select name="district">
                        <option value="Ampara">Ampara</option>
                        <option value="Anuradhapura">Anuradhapura</option>
                        <option value="Badulla">Badulla</option>
                        <option value="Batticaloa">Batticaloa</option>
                        <option value="Colombo">Colombo</option>
                        <option value="Galle">Galle</option>
                        <option value="Gampaha">Gampaha</option>
                        <option value="Hambantota">Hambantota</option>
                        <option value="Jaffna">Jaffna</option>
                        <option value="Kalutara">Kalutara</option>
                        <option value="Kandy">Kandy</option>
                        <option value="Kegalle">Kegalle</option>
                        <option value="Kilinochchi">Kilinochchi</option>
                        <option value="Kurunegala">Kurunegala</option>
                        <option value="Mannar">Mannar</option>
                        <option value="Matale">Matale</option>
                        <option value="Matara">Matara</option>
                        <option value="Moneragala">Moneragala</option>
                        <option value="Mullaitivu">Mullaitivu</option>
                        <option value="Nuwara Eliya">Nuwara Eliya</option>
                        <option value="Polonnaruwa">Polonnaruwa</option>
                        <option value="Puttalam">Puttalam</option>
                        <option value="Ratnapura">Ratnapura</option>
                        <option value="Trincomalee">Trincomalee</option>
                        <option value="Vavuniya">Vavuniya</option>
                    </select></p>


                <b>Place of Examination:</b>
                <p><input type="text" placeholder="Place"  name="place2"></p>

                <b> Names and Address of Persons who identified the body:</b>
                <p><input type="text" placeholder="Name & address"  name="name3"></p>
            </div>
            <div class="tab">
                <b>1.Examination of the locus (Site and Position of body):</b>
                <p><textarea name="locus" rows="20" cols="100%"></textarea></p>

                <b>2.External Examination of body (clothing, nourishment, colour, marks and product of disease etc.):</b>
                <p><textarea name="external" rows="20" cols="100%"></textarea></p>

                <p><b>3.Injuries (inflicted before or after death)(Use continuation sheet, and Health 1135A if necessary)</b></p>
            </div>
            <div class="tab">
                <b>4.Height (By measurement):</b>
                <p><textarea name="height" rows="10" cols="100%"></textarea></p>

                <b>5.Age (estimated when relevent):</b>
                <p><textarea name="age" rows="10" cols="100%"></textarea></p>

                <b>6.Sex:</b>
                <p><textarea name="sex" rows="10" cols="100%"></textarea></p>

                <b>7.Eyes and pupils:</b>
                <p><textarea name="eyes" rows="10" cols="100%"></textarea></p>

                <b>8.Length,colour and condion of hair:</b>
                <p><textarea name="hair" rows="10" cols="100%"></textarea></p>

                <b>9.Position and condition of tongue:</b>
                <p><textarea name="tongue" rows="10" cols="100%"></textarea></p>

                <b>10.Number of tooth (Complete,incomplete,peculiarities):</b>
                <p><textarea name="tooth" rows="10" cols="100%"></textarea></p>

                <b>11.Sign of death (Record temperature where necessary):</b>
                <p><textarea name="sign_death" rows="10" cols="100%"></textarea></p>

                <ul>
                    <li><b>Primary flaccidity:</b>
                        <p><input type="text" placeholder=""  name="flaccidity"></p></li>

                    <li><b>Rigor mortis:</b>
                        <p><input type="text" placeholder=""  name="mortis"></p></li>

                    <li><b>Hypostasis:</b>
                        <p><input type="text" placeholder=""  name="hypostasis"></p></li>

                    <li><b>Puterfaction:</b>
                        <p><input type="text" placeholder=""  name="purterfaction"></p></li>

                </ul>

                <b>12.Condition and contenets of hand and nails:</b>
                <p><textarea name="condition" rows="10" cols="100%"></textarea></p>
            </div>


            <div class="tab">
                <b>13.Natural openings (especially with refernce to presence of foreign substance,poisons,presence or absence of the signs of virginity and recent injury about the parts):</b>
                <p><textarea name="open" rows="10" cols="100%"></textarea></p>

                <ul>
                    <li><b>Nose,mouth and ears:</b>
                        <p><input type="text" placeholder=""  name="nose"></p></li>

                    <li><b>Urinary and sexual:</b>
                        <p><input type="text" placeholder=""  name="urinary"></p></li>

                    <li><b>Anal:</b>
                        <p><input type="text" placeholder=""  name="anal"></p></li>
                </ul>

                <b>14.Neck:</b>
                <p><textarea name="neck" rows="10" cols="100%"></textarea></p>

                <ul>
                    <li>
                        <b>Soft tissues and blood vessels of neck,and cervical vartebrae (special attention to strangulation)::</b>
                        <p><input type="text" placeholder=""  name="neck1"></p>
                    </li>
                </ul>

                <b>15.Head:</b>
                <p><textarea name="head1" rows="10" cols="100%"></textarea></p>

                <ol type="i">
                    <li>
                        <b>Soft parts covering it:</b>
                        <p><input type="text" placeholder=""  name="cover"></p>
                    </li>

                    <li>
                        <b>Bones of skull:</b>
                        <p><input type="text" placeholder=""  name="skull"></p>
                    </li>

                    <li>
                        <b>Membranes and sinuses of brain:</b>
                        <p><input type="text" placeholder=""  name="brain"></p>
                    </li>

                    <li>
                        <b>Brain substance and ventricles:</b>
                        <p><input type="text" placeholder=""  name="brain1"></p>
                    </li>

                    <li>
                        <b>Blood vessels of brain:</b>
                        <p><input type="text" placeholder=""  name="vessels"></p>
                    </li>
                </ol>

                <b>16.Spain cord:</b>
                <p><textarea name="spain" rows="10" cols="100%"></textarea></p>

            </div>

            <div class="tab">
                <b>17.Thorax:</b>
                <p><textarea name="thorax" rows="10" cols="100%"></textarea></p>

                <ol type="i">
                    <li>
                        <b>Soft parts covering it:</b>
                        <p><input type="text" placeholder=""  name="cover1"></p>
                    </li>

                    <li>
                        <b>Bones (ribs,sternum,vertebrae):</b>
                        <p><input type="text" placeholder=""  name="ribs"></p>
                    </li>

                    <li>
                        <b>Chest cavity (position of organs,contents of pleural cavities):</b>
                        <p><input type="text" placeholder=""  name="chest"></p>
                    </li>

                    <li>
                        <b>Pericardium and its contents:</b>
                        <p><input type="text" placeholder=""  name="peri"></p>
                    </li>

                    <li>
                        <b>Heart (cavities and contents,values myocardium):</b>
                        <p><input type="text" placeholder=""  name="heart"></p>
                    </li>

                    <li>
                        <b>Coronary vessels:</b>
                        <p><input type="text" placeholder=""  name="coro"></p>
                    </li>

                    <li>
                        <b>Large blood vessels:</b>
                        <p><input type="text" placeholder=""  name="large"></p>
                    </li>

                    <li>
                        <b>Larynax,trachea and bronchi(condition and contents):</b>
                        <p><input type="text" placeholder=""  name="larynax"></p>
                    </li>

                    <li>
                        <b>Pleura and Lungs:</b>
                        <p><input type="text" placeholder=""  name="lungs"></p>
                    </li>

                    <li>
                        <b>Gullet:</b>
                        <p><input type="text" placeholder=""  name="gull"></p>
                    </li>
                </ol>
            </div>

            <div class="tab">
                <b>18.Abdomen:</b>
                <p><textarea name="abd" rows="10" cols="100%"></textarea></p>

                <ol type="i">
                    <li>
                        <b>Contents, vessels and position of organs:</b>
                        <p><input type="text" placeholder=""  name="organs"></p>
                    </li>

                    <li>
                        <b>Peritoneum:</b>
                        <p><input type="text" placeholder=""  name="perito"></p>
                    </li>

                    <li>
                        <b>Diaphragm:</b>
                        <p><input type="text" placeholder=""  name="dia"></p>
                    </li>

                    <li>
                        <b>Liver and Gall Bladder:</b>
                        <p><input type="text" placeholder=""  name="liver"></p>
                    </li>

                    <li>
                        <b>Spleen:</b>
                        <p><input type="text" placeholder=""  name="spleen"></p>
                    </li>

                    <li>
                        <b>Stomach (condition and contents):</b>
                        <p><input type="text" placeholder=""  name="stomach"></p>
                    </li>

                    <li>
                        <b>Duodenum,jegunum,ileum (condition and contents;where relevent passage of food):</b>
                        <p><input type="text" placeholder=""  name="duod"></p>
                    </li>

                    <li>
                        <b>Large intestines(condition and contents):</b>
                        <p><input type="text" placeholder=""  name="intes"></p>
                    </li>

                    <li>
                        <b>Pancreas:</b>
                        <p><input type="text" placeholder=""  name="pancreas"></p>
                    </li>

                    <li>
                        <b>Kidneys:</b>
                        <p><input type="text" placeholder=""  name="kidney"></p>
                    </li>

                    <li>
                        <b>Supra-renal glands:</b>
                        <p><input type="text" placeholder=""  name="renal"></p>
                    </li>
                </ol>
            </div>

            <div class="tab">
                <b>19.Pelvis:</b>
                <p><textarea name="pel" rows="10" cols="100%"></textarea></p>

                <ol type="i">
                    <li>
                        <b>Urinary bladder prostate (Condition and contents):</b>
                        <p><input type="text" placeholder=""  name="bladder"></p>
                    </li>

                    <li>
                        <b>Generative organs:</b>
                        <p><input type="text" placeholder=""  name="gen"></p>
                    </li>

                    <li>
                        <b>Blood vessels:</b>
                        <p><input type="text" placeholder=""  name="bv"></p>
                    </li>

                    <li>
                        <b>Vertebrae and pelvic bones:</b>
                        <p><input type="text" placeholder=""  name="pelvic"></p>
                    </li>

                </ol>


                <b>20.Cause of death and other relevant opinions:</b>
                <p><textarea name="cause_r" rows="10" cols="100%"></textarea></p>

            </div>
        </div>

        <div style="overflow:auto;">
            <div style="float:right;">
                <button type="button" id="prevBtn" onclick="nextPrev(-1)">Previous</button>
                <button type="button" id="nextBtn" onclick="nextPrev(1)">Next</button>
            </div>
        </div>
        <!-- Circles which indicates the steps of the form: -->
        <div style="text-align:center;margin-top:40px;">
            <span class="step"></span>
            <span class="step"></span>
            <span class="step"></span>
            <span class="step"></span>
            <span class="step"></span>
            <span class="step"></span>
            <span class="step"></span>
            <span class="step"></span>
        </div>
    </form>

    <script>
        var currentTab = 0; // Current tab is set to be the first tab (0)
        showTab(currentTab); // Display the crurrent tab

        function showTab(n) {
            // This function will display the specified tab of the form...
            var x = document.getElementsByClassName("tab");
            x[n].style.display = "block";
            //... and fix the Previous/Next buttons:
            if (n == 0) {
                document.getElementById("prevBtn").style.display = "none";
            } else {
                document.getElementById("prevBtn").style.display = "inline";
            }
            if (n == (x.length - 1)) {
                document.getElementById("nextBtn").innerHTML = "Submit";
            } else {
                document.getElementById("nextBtn").innerHTML = "Next";
            }
            //... and run a function that will display the correct step indicator:
            fixStepIndicator(n)
        }

        function nextPrev(n) {
            // This function will figure out which tab to display
            var x = document.getElementsByClassName("tab");
            // Exit the function if any field in the current tab is invalid:
            if (n == 1 && !validateForm())
                return false;
            // Hide the current tab:
            x[currentTab].style.display = "none";
            // Increase or decrease the current tab by 1:
            currentTab = currentTab + n;
            // if you have reached the end of the form...
            if (currentTab >= x.length) {
                // ... the form gets submitted:
                document.getElementById("regForm").submit();
                return false;
            }
            // Otherwise, display the correct tab:
            showTab(currentTab);
        }

        function validateForm() {
            // This function deals with validation of the form fields
            var x, y, i, valid = true;
            x = document.getElementsByClassName("tab");
            y = x[currentTab].getElementsByTagName("input");
            // A loop that checks every input field in the current tab:
            for (i = 0; i < y.length; i++) {
                // If a field is empty...
                if (y[i].value == "") {
                    // add an "invalid" class to the field:
                    y[i].className += " invalid";
                    // and set the current valid status to false
                    valid = false;
                }
            }
            // If the valid status is true, mark the step as finished and valid:
            if (valid) {
                document.getElementsByClassName("step")[currentTab].className += " finish";
            }
            return valid; // return the valid status
        }

        function fixStepIndicator(n) {
            // This function removes the "active" class of all steps...
            var i, x = document.getElementsByClassName("step");
            for (i = 0; i < x.length; i++) {
                x[i].className = x[i].className.replace(" active", "");
            }
            //... and adds the "active" class on the current step:
            x[n].className += " active";
        }
    </script>

</body>
</html>