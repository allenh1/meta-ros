# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=9;endline=9;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "boost catkin python-rospkg rospack"
SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/lunar/roslib/1.14.0-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5bcae19127e9fba1542752a13027eba2"
SRC_URI[sha256sum] = "875c4ea9b694761dca93de89aa9e8cd3bc4129e4d5a96b99d918cbfed467fcd9"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
