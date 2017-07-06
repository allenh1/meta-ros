# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=9;endline=9;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin geometry_msgs roscpp rospy std_msgs tf2 tf2_ros turtlesim"
SRC_URI = "https://github.com/ros-gbp/geometry_tutorials-release/archive/release/lunar/turtle_tf2/0.2.2-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "13f5e952ddc65b4f4f9d3261d8e443ea"
SRC_URI[sha256sum] = "8aaeb265ec96b205f8c360cfefd2f4a2690fceb892f9128b3a1b95dab9ffee6c"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
