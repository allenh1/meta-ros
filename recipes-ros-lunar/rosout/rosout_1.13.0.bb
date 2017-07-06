# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=8;endline=8;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin roscpp rosgraph_msgs"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/rosout/1.13.0-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "465f5163bf2907e84b71d447677b8fa2"
SRC_URI[sha256sum] = "7ae62287cf9fd2a708fa2975d7c07a108bccf953a735c09d7522f61938b7ca85"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
