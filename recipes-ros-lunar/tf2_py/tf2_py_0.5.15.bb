# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=11;endline=11;md5=7389aef5a605df7910cbc0188bffd7bb"

DEPENDS = "catkin rospy tf2"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/lunar/tf2_py/0.5.15-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9c0d8beb572d588ea415c23c80abfd43"
SRC_URI[sha256sum] = "75bbeb366b6b4b2a4f7cfa989882453c00203a16dab498d1b52e3b251d8dcabf"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
