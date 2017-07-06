# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=10;endline=10;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin python-netifaces python-rospkg"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/rosgraph/1.13.0-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9a0b53248c0d684aed8e84a5faf93a0d"
SRC_URI[sha256sum] = "dd070c4ddb7a0b1a5a7f1398539ca4e83388dd7b2d72cf3f67112db0a863be60"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
