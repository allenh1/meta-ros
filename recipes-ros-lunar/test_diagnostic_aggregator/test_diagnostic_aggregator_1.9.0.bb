# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=10;endline=10;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin diagnostic_aggregator diagnostic_msgs pluginlib roscpp rospy rostest"
SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/lunar/test_diagnostic_aggregator/1.9.0-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1966d3a69dc187e382d33cf7cec6f965"
SRC_URI[sha256sum] = "29ab50b5afdf4da781b01adb8523e238c5040f12b62cd9dcbe95eb28e9f58aee"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
