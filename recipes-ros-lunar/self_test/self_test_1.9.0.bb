# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=10;endline=10;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin diagnostic_msgs diagnostic_updater roscpp rostest"
SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/lunar/self_test/1.9.0-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ee82258a87a9926f8b3a63beb39cc2ee"
SRC_URI[sha256sum] = "54d50ec554bc9c42113f47647d75aae06e1c4a78fbc33d13ec1d066adee790b7"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
